package com.springRest.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.DAO.UserIDInfoDAO;
import com.springRest.model.ResponsePayLoad;
import com.springRest.model.UserID;
import com.springRest.model.UserIDResponse;

@RestController
@RequestMapping("/api")
public class UserInfoController {

	@Autowired
	private UserIDInfoDAO userIdInfo;

	@RequestMapping(value = "/userInfo", method = GET)
	public List<ResponsePayLoad> getUserInfo() {

		return userIdInfo.getUserInfo();
	}

	@RequestMapping(value = "/userInfo", method = POST)
	public UserIDResponse createUserInfo(@RequestBody UserID userID) {

		return userIdInfo.createUserInfo(userID);

	}

}
