package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	String description;
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;
	}

	
	@Override
	public void pay() {
		// do nothing because volunteers are not paid;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Volunteer [");
		builder.append(" id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", description= ");
		builder.append(description);
		builder.append(", totalPaid=");
		builder.append(totalPaid);
		builder.append("]");
		return builder.toString();
	}

}
