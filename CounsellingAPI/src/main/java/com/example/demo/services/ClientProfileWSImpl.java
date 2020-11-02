package com.example.demo.services;

import com.example.demo.enums.NTClientProfileEnum;
import com.example.demo.model.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ClientProfileWSImpl implements IBTClientProfileWS {

    @Autowired
    IBTClientProfileService clientProfileService;

    public final static Logger LOG = LoggerFactory.getLogger(ClientProfileWSImpl.class);

    public Object reviewUserProfile(String user) {
        long startTime = System.currentTimeMillis();
        LOG.info("Started getUser Profile");
        BTClientResponseVO clientResponseVO = new BTClientResponseVO();
        try {
            ResponseEntity<BTGitHubUsersVO> clientResponse = clientProfileService.getClientProfileForSpecificUser(user);
            ResponseEntity<Object[]> repoResponse = clientProfileService.getReposForSpecificUser(user);
            if (isValid(clientResponse, repoResponse)) {
                populatingClientResponse(Objects.requireNonNull(clientResponse.getBody()), clientResponseVO, Objects.requireNonNull(repoResponse.getBody()));
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
                String responsePayload = objectMapper.writeValueAsString(clientResponseVO);
                LOG.info("The response payload looks like = {}", responsePayload);
                return clientResponseVO;
            } else {
                //Could have used response object to throw specific codes for every response but needed lil bit more time to figure out config issues so used this instead.
                //response = Response.status(Response.Status.OK).entity(clientResponseVO).build();
                if (clientResponse == null) {
                    return NTClientProfileEnum.USER_NOT_FOUND.getSource();
                } else if (repoResponse == null) {
                    return NTClientProfileEnum.REPO_NOT_FOUND.getSource();
                } else {
                    return performStatusHandling(clientResponse.getStatusCode());
                }
            }
        } catch (Exception e) {
            LOG.info("The request is failed, please contact the system administrator");
        } finally {
            long endTime = System.currentTimeMillis();
            LOG.info("Execution Time = {}", endTime - startTime);
        }
        return null;
    }

    public void populatingClientResponse(BTGitHubUsersVO gitHubUsersVO, BTClientResponseVO clientResponseVO, Object[] repoResponse) throws IOException, JSONException {
        clientResponseVO.setUser_name(gitHubUsersVO.getLogin());
        clientResponseVO.setDisplay_name(gitHubUsersVO.getName());
        clientResponseVO.setAvatar(gitHubUsersVO.getAvatar_url());
        clientResponseVO.setGeo_location(gitHubUsersVO.getLocation());
        clientResponseVO.setEmail(gitHubUsersVO.getEmail());
        clientResponseVO.setUrl(gitHubUsersVO.getUrl());
        clientResponseVO.setCreated_at(gitHubUsersVO.getCreated_at().replace("T"," ").replace("Z",""));
        List<BTNameUrlVO> nameUrlVOS = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        for (Object o : repoResponse) {
            String json = objectMapper.writeValueAsString(o);
            JSONObject jsonresponse = new JSONObject(json);
            String name = jsonresponse.get("name").toString();
            String url = jsonresponse.get("html_url").toString();
            BTNameUrlVO nameUrlVO = new BTNameUrlVO(name, url);

            nameUrlVOS.add(nameUrlVO);
        }
        clientResponseVO.setRepos(nameUrlVOS);
    }

    public String performStatusHandling(HttpStatus status) {
        if (HttpStatus.BAD_REQUEST == status) {
            return "BAD_REQUEST";
        } else if (HttpStatus.BAD_GATEWAY == status) {
            return "BAD_GATEWAY";
        } else if (HttpStatus.INTERNAL_SERVER_ERROR == status) {
            return "INTERNAL_SERVER_ERROR";
        }
        return NTClientProfileEnum.USER_NOT_FOUND.getSource();
    }

    public boolean isValid(ResponseEntity<BTGitHubUsersVO> clientResponse, ResponseEntity<Object[]> repoResponse) {
        return clientResponse != null && clientResponse.getBody() != null && HttpStatus.OK == clientResponse.getStatusCode() && HttpStatus.OK == repoResponse.getStatusCode()
                && repoResponse.getBody() != null;
    }
}
