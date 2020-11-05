package com.example.UserApi;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class ContactService {

	@Autowired
	private ContactRepository repo;

	public void Add(UserInfo userInfo) {
		repo.save(userInfo);
	}

	public List<UserInfo> listAll() {
		return repo.findAll();
	}

	public UserInfo get(Integer id) {

		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
