package org.qucell.chat.service;

import java.util.List;

import org.qucell.chat.model.room.RoomVO;

public interface RoomService {
	/**
	 * updated 20/06/15
	 * @param room
	 */
	List<String> getRoomNameList();
	void addNewChatRoom(RoomVO vo);
	void exitChatRoom(int userId, String roomName);
	
	/**
	 * updated 20/06/15
	 * @param room
	 */
}
