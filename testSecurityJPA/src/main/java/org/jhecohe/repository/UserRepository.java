package org.jhecohe.repository;

import org.jhecohe.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByEmail(String email);
}
