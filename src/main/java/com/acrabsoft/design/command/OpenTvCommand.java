package com.acrabsoft.design.command;

public class OpenTvCommand implements Command {

	private Television tv;
	
	public OpenTvCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.opne();

	}

}
