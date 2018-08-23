package com.springRest.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springRest.model.ResponsePayLoad;
import com.springRest.model.UserID;
import com.springRest.model.UserIDResponse;

@Service
public class UserIDInfoDAO {

	@Value("${user.info.url}")
	private String userInfoUrl;

	public List<ResponsePayLoad> getUserInfo() {
		final RestTemplate restTemplate = new RestTemplate();
		// final HttpEntity<UserID> request = new HttpEntity<>(new UserID());
		final ResponseEntity<List<ResponsePayLoad>> response = restTemplate.exchange(userInfoUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ResponsePayLoad>>() {
				});
		return response.getBody();

	}

	public UserIDResponse createUserInfo(UserID userID) {

		final RestTemplate restTemplate = new RestTemplate();
		final HttpEntity<UserID> request = new HttpEntity<>(userID);
		final ResponseEntity<UserIDResponse> response = restTemplate.exchange(userInfoUrl, HttpMethod.POST, request,
				UserIDResponse.class);
		return response.getBody();
	}
}
