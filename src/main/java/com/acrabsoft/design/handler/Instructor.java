package com.acrabsoft.design.handler;

/**
 *  辅导员
 * @author Administrator
 *
 */
public class Instructor extends Leader{

	public Instructor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handlerRequest(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		if(leaveNote.getNumber() <= 3){   //小于3天辅导员审批
            System.out.println("辅导员" + name + "审批" +leaveNote.getPerson() + "同学的请假条,请假天数为" + leaveNote.getNumber() + "天。");
        }
        else{     //否则传递给系主任
            if(this.successor != null){
                this.successor.handlerRequest(leaveNote);
            }
        }
	}
	
	

}
