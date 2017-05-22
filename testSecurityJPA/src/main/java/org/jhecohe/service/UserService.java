package org.jhecohe.service;

import org.jhecohe.domain.User;

public interface UserService {

	public User findByEmail(String email);
}
