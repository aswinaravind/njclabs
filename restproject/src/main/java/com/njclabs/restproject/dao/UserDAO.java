package com.njclabs.restproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.njclabs.restproject.dto.UserDTO;


@Repository
public interface  UserDAO extends JpaRepository<UserDTO, String>{

}
