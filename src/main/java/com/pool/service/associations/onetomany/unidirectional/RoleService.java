package com.pool.service.associations.onetomany.unidirectional;

import java.util.List;

import com.pool.model.associations.onetomany.unidirectional.Role;

public interface RoleService {
	public Role saveRole(Role role);

	public List<Role> roles();
}
