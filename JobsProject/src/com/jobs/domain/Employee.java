package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [");
		builder.append(" id= ");
		builder.append(id);
		builder.append(", name= ");
		builder.append(name);
		builder.append(", address= ");
		builder.append(address);
		builder.append(", phone= ");
		builder.append(phone);
		builder.append(", salaryPerMonth= ");
		builder.append(salaryPerMonth);
		builder.append(", totalPaid= ");
		builder.append(totalPaid);
		builder.append(" ]");
		return builder.toString();
	}
	
	

}
