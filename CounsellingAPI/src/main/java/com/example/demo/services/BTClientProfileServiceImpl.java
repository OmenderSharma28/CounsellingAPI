package com.example.demo.services;

import com.example.demo.model.BTAllReposVO;
import com.example.demo.model.BTGitHubRepoVO;
import com.example.demo.model.BTGitHubUsersVO;
import com.example.demo.model.BTClientResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import static com.example.demo.enums.BTClientProfileConstants.BASE_URL;

@Service
public class BTClientProfileServiceImpl implements IBTClientProfileService{

    public final static Logger LOG = LoggerFactory.getLogger(BTClientProfileServiceImpl.class);

    public ResponseEntity<BTGitHubUsersVO> getClientProfileForSpecificUser(String user) throws Exception{
        long currentTime = System.currentTimeMillis();
        LOG.info("Executing getUserProfile() method :: start time (in Millis) :: {}", currentTime);
        ResponseEntity<BTGitHubUsersVO> rateResponse = null;
        String serviceUrl = BASE_URL+user;
        //String serviceUrl1 = BTMessageUtil.getMessage("github.base.url");
        try{
            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(serviceUrl);
            RestTemplate restTemplate = new RestTemplate();
            rateResponse = restTemplate.getForEntity(builder.build().toString(), BTGitHubUsersVO.class);
        }catch (Exception e){
            LOG.error("Exception found while calling getClientProfileForSpecificUser");
        }finally {
            LOG.info("Method ended");
        }
        return rateResponse;
    }

    public ResponseEntity<Object[]> getReposForSpecificUser(String user) throws Exception{
        long currentTime = System.currentTimeMillis();
        LOG.info("Executing getReposForSpecificUser() method :: start time (in Millis) :: {}", currentTime);
        ResponseEntity<Object[]> rateResponse = null;
        String serviceUrl = BASE_URL+user+"/repos";
        //String serviceUrl1 = BTMessageUtil.getMessage("github.base.url");
        try{
            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(serviceUrl);
            RestTemplate restTemplate = new RestTemplate();
            rateResponse = restTemplate.getForEntity(builder.build().toString(), Object[].class);
        }catch (Exception e){
            LOG.error("Exception found while calling getReposForSpecificUser");
        }finally {
            LOG.info("Method ended");
        }
        return rateResponse;
    }
}
