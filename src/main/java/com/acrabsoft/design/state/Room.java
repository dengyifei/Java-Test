package com.acrabsoft.design.state;

public class Room {
	State freeState; //空闲
	State bookedSate; //预订
	State checkInState; //入住
	
	State state ;// 状态

	public Room() {
		freeState = new FreeState(this);
		bookedSate = new BookedState(this);
		checkInState = new CheckInState(this);
		state = freeState;
	}
	
	/**
     * @desc 预订房间
     * @return void
     */
    public void bookRoom(){
        state.bookRoom();
    }
    
    /**
     * @desc 退订房间
     * @return void
     */
    public void unsubscribeRoom(){
        state.unsubscribeRoom();
    }
    
    /**
     * @desc 入住
     * @return void
     */
    public void checkInRoom(){
        state.checkInRoom();
    }
    
    /**
     * @desc 退房
     * @return void
     */
    public void checkOutRoom(){
        state.checkOutRoom();
    }
    
    public String toString(){
        return "该房间的状态是:"+getState().getClass().getName();
    }

	public State getFreeState() {
		return freeState;
	}

	public void setFreeState(State freeState) {
		this.freeState = freeState;
	}

	public State getBookedSate() {
		return bookedSate;
	}

	public void setBookedSate(State bookedSate) {
		this.bookedSate = bookedSate;
	}

	public State getCheckInState() {
		return checkInState;
	}

	public void setCheckInState(State checkInState) {
		this.checkInState = checkInState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
    
    
	
	

}
