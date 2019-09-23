package com.acrabsoft.design.state;

public interface State {
	
	//预订
	public void bookRoom();
	//退订
	public void unsubscribeRoom();
	
	//入住
	public void checkInRoom();
	
	//退房
	public void checkOutRoom();

}
