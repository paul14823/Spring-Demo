package com.sicnu.dao;

import com.sicnu.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Roles {
    List<Role> GetAllRole();
    Role GetRoleById(int id);
    int GetRoleCount();
    void AddRole(Role role);
}
