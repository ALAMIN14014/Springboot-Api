package com.example.NameEmailApi;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class ContactService {

	@Autowired
	private ContactRepository repo;

	public void Add(Contact contact) {
		repo.save(contact);
	}

	public List<Contact> listAll() {
		return repo.findAll();
	}

	public Contact get(Integer id) {

		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
