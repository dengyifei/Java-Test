package com.acrabsoft.design.handler;

public class DepartmentHead extends Leader{

	public DepartmentHead(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handlerRequest(LeaveNote leaveNote) {
		// TODO Auto-generated method stub
		if(leaveNote.getNumber() <= 7){   //小于7天系主任审批
            System.out.println("系主任" + name + "审批" +leaveNote.getPerson() + "同学的请假条,请假天数为" + leaveNote.getNumber() + "天。");
        }
        else{     //否则传递给院长
            if(this.successor != null){
                this.successor.handlerRequest(leaveNote);
            }
        }
	}

}
