package com.example.LoginAndRegistrationApi;

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
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/user")
	public  List<User>list(){
		
		
		return service.listAll();
		
	}

	@GetMapping("/user/{id}")
	
	public User get(@PathVariable Integer id) {
		
		return service.get(id);
		
	}
	@PostMapping("/user")
	public void add(@RequestBody User user) {
		service.save(user);
	
	}
	
	@PutMapping("/user/{id}")
	public void update(@RequestBody User user, @PathVariable Integer id) {
		service.save(user);
	
	}	
	
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	
}
