package com.example.NameEmailApi;

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
	public List<Contact> list() {

		return service.listAll();
	}

	@GetMapping("/contacts/{id}")

	public Contact find(@PathVariable Integer id) {

		return service.get(id);

	}

	@PostMapping("/contacts")
	public void add(@RequestBody Contact contact) {
		service.Add(contact);
	}

	@PutMapping("/contacts/{id}")
	public void update(@RequestBody Contact contact, @PathVariable Integer id) {

		service.Add(contact);
	}

	@DeleteMapping("/contacts")
	public void delete(@PathVariable Integer id) {

		service.delete(id);

	}

}
