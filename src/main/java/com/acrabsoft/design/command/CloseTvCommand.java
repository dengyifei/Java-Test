package com.acrabsoft.design.command;

public class CloseTvCommand implements Command {

	private Television tv;
	
	public CloseTvCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.close();
	}

}
