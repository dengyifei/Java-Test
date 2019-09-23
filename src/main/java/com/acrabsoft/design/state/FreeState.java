package com.acrabsoft.design.state;

public class FreeState implements State {

	private Room room;
	
	
	public FreeState(Room room) {
		super();
		this.room = room;
	}

	@Override
	public void bookRoom() {
		// TODO Auto-generated method stub
		System.out.println("您已经成功预订了...");
		room.setState(room.getBookedSate());   //状态变成已经预订
	}

	@Override
	public void unsubscribeRoom() {
		// TODO Auto-generated method stub
		room.setState(room.getFreeState());   //状态变成已经预订
	}

	@Override
	public void checkInRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkOutRoom() {
		// TODO Auto-generated method stub

	}

}
