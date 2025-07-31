package com.portfolio.dao.interfaces;

import com.portfolio.entity.User;

public interface UserDAO {
    User findByUserName(String userName);
}
