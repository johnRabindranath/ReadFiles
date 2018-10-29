package com.readFile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.readFile.text.User;

/**
 * <p>
 * Used for CRUD operation for
 * <class>com.techfetch.mysql.model.PortiaData</class>
 * </p>
 * 
 * @author John Rabindranath
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findAllById(int i);
}
