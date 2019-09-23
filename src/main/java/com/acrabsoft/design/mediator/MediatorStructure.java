package com.acrabsoft.design.mediator;

public class MediatorStructure extends Mediator{
	HouseOwner houseOwner;
	Tenant tenant;
	
	



	public HouseOwner getHouseOwner() {
		return houseOwner;
	}





	public void setHouseOwner(HouseOwner houseOwner) {
		this.houseOwner = houseOwner;
	}





	public Tenant getTenant() {
		return tenant;
	}





	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}





	@Override
	public void constact(String message, Person person) {
		// TODO Auto-generated method stub
		if(person == houseOwner) {
			tenant.getMsg();
		} else {
			houseOwner.getMsg();
		}
	}

}
