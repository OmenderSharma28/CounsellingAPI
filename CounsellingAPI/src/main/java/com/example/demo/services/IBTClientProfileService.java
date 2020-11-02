package com.example.demo.services;

import com.example.demo.model.BTAllReposVO;
import com.example.demo.model.BTGitHubRepoVO;
import com.example.demo.model.BTGitHubUsersVO;
import org.springframework.http.ResponseEntity;


public interface IBTClientProfileService {
    public ResponseEntity<BTGitHubUsersVO> getClientProfileForSpecificUser(String user) throws Exception;
    public ResponseEntity<Object[]> getReposForSpecificUser(String user) throws Exception;
}
