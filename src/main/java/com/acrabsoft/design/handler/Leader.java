package com.acrabsoft.design.handler;

/**
 * 抽象处理者
 * @author efei
 *
 */
public abstract class Leader {
	String name;
	Leader successor;
	
	public Leader(String name) {
		super();
		this.name = name;
	}

	public void setSuccessor(Leader successor) {
		this.successor = successor;
	}
	
	public abstract void handlerRequest(LeaveNote leaveNote) ;
	
	
	
	
	

}
