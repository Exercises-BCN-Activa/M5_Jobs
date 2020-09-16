package com.jobs.application;

import com.jobs.domain.IPaymentRate;

/**
 * class that builds the interface variables that 
 * calculate the net pay for each type of employee
 * @author faunoguazina
 *
 */
public class PaymentFactory {

	
	/**
	 * @return interface method that pays a boss, fifty percent more
	 */
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	/**
	 * @return interface method that pays a employee, fifteen percent less
	 */
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;
			}
		};
	}
	
	/**
	 * @return interface method that pays a manager, ten percent more
	 */
	public static IPaymentRate createPaymentRateManagerEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
}
