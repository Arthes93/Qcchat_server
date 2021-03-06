package org.qucell.chat.service;

import java.io.IOException;
import java.util.List;

import org.qucell.chat.model.DefaultRes;
import org.qucell.chat.model.user.Users;

public interface UserService {
	public Users getByUserId(String jwt);
	
	/**
	 * 
	 * @return json data - friends list
	 * @throws IOException
	 */
	public List<Users> getAllFriendsList(int userId);
	public Users getUserByName(String userName);
	public void addUserAsFriend(String userName, String friendName);
}
