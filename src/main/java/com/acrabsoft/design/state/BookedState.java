package com.acrabsoft.design.state;

public class BookedState implements State{

	private Room room;
	
	public BookedState(Room room) {
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
		room.setState(room.getFreeState());
	}

	@Override
	public void checkInRoom() {
		// TODO Auto-generated method stub
		room.setState(room.getCheckInState()); 
	}

	@Override
	public void checkOutRoom() {
		// TODO Auto-generated method stub
		
	}

}
