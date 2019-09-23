package com.acrabsoft.design.proxy;

public class HerChum implements GiveGift {
	
	You you;
	
	public HerChum(BeautifulGirl  mm) {
		super();
		this.you = new You(mm);
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void giveBook() {
		// TODO Auto-generated method stub

	}

}
