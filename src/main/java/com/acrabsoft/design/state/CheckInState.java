package com.acrabsoft.design.state;

public class CheckInState implements State{

	private Room room;
	
	
	public CheckInState(Room room) {
		super();
		this.room = room;
	}

	@Override
	public void bookRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsubscribeRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkInRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkOutRoom() {
		// TODO Auto-generated method stub
		room.setState(room.getFreeState());
	}

}
