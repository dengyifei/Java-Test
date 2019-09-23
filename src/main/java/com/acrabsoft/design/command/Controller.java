package com.acrabsoft.design.command;


public class Controller {
	private Command open;
	private Command close;
	
	public Controller(Command open, Command close) {
		super();
		this.open = open;
		this.close = close;
	}
	
	public void open() {
		open.execute();
	}
	
	public void close() {
		close.execute();
	}
	
	
	

}
