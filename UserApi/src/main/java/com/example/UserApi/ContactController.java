package com.example.UserApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService service;

	@GetMapping("/contacts")
	public List<UserInfo> list() {

		return service.listAll();
	}

	@GetMapping("/contacts/{id}")

	public UserInfo find(@PathVariable Integer id) {

		return service.get(id);

	}

	@PostMapping("/contacts")
	public void add(@RequestBody UserInfo userInfo) {
		service.Add(userInfo);
	}

	@PutMapping("/contacts/{id}")
	public void update(@RequestBody UserInfo userInfo, @PathVariable Integer id) {

		service.Add(userInfo);
	}

	@DeleteMapping("/contacts")
	public void delete(@PathVariable Integer id) {

		service.delete(id);

	}

}
