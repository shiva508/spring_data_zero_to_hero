package com.pool.service.associations.onetomany.unidirectional;

import java.util.List;

import com.pool.model.associations.onetomany.unidirectional.User;

public interface UserService {
	public User saveUser(User user);

	public List<User> users();
}
