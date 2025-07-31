package com.portfolio.dao.interfaces;

import com.portfolio.entity.Role;

public interface RoleDAO {
    public Role findRoleByName(String roleName);
}
