package com.meritamerica.assignment7.security.services;

import com.meritamerica.assignment7.security.models.User;

public interface UserService {
	public User addUser(User user);
	public User getUser(int userId);
}
