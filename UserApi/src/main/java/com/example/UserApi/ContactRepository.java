package com.example.UserApi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<UserInfo, Integer> {

}
