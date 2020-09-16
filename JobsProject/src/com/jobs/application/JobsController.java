package com.jobs.application;

import java.util.Iterator;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

/**
 * class that controls all application at public level
 * @author faunoguazina
 *
 */
public class JobsController {

	//repository instance
	private EmployeeRepository repository = new EmployeeRepository();
	
	/**
	 * public and empty constructor
	 */
	public JobsController(){
		
	}
	
	/**
	 * Construction method of a chief: 
	 * Invokes the PaymentFactory class to create the interface variable 
	 * that calculates the net payment amount based on the reported monthly salary. 
	 * Invokes the PAY method, using payment interface to calculate its net values 
	 * over the gross value reported in its construction.
	 * then add to the repository.
	 * @param name String full name
	 * @param address String full address
	 * @param phone String number
	 * @param salaryPerMonth Double valor 
	 * @throws Exception if salary is less than 0 or payment interface is null
	 */
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		boss.pay();
		repository.addMember(boss);
	}
	
	/**
	 * Construction method of a employee: 
	 * Invokes the PaymentFactory class to create the interface variable 
	 * that calculates the net payment amount based on the reported monthly salary.
	 * Invokes the PAY method, using payment interface to calculate its net values 
	 * over the gross value reported in its construction.
	 * then add to the repository.
	 * @param name String full name
	 * @param address String full address
	 * @param phone String number
	 * @param salaryPerMonth Double valor 
	 * @throws Exception if salary is less than 0 or payment interface is null
	 */
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		employee.pay();
		repository.addMember(employee);
	}

	/**
	 * Construction method of a manager: 
	 * Invokes the PaymentFactory class to create the interface variable 
	 * that calculates the net payment amount based on the reported monthly salary.
	 * Invokes the PAY method, using payment interface to calculate its net values 
	 * over the gross value reported in its construction.
	 * then add to the repository.
	 * @param name String full name
	 * @param address String full address
	 * @param phone String number
	 * @param salaryPerMonth Double valor 
	 * @throws Exception if salary is less than 0 or payment interface is null
	 */
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManagerEmployee());
		manager.pay();
		repository.addMember(manager);
	}

	
	/**
	 * Construction method of a volunteer,
	 * then add to the repository.
	 * @param name String full name
	 * @param address String full address
	 * @param phone String number
	 * @param description String text
	 * @throws Exception if name, phone or address is empty
	 */
	public void createVolunteer(String name, String address, String phone, String description) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);
	}


	/**
	 * method that invokes all members of the repository
	 * @return List of class AbsStaffMember
	 */
	public List<AbsStaffMember> getAllEmployees() {
		return repository.getAllMembers();
	}
	
	/**
	 * console printing method for all database members
	 */
	public void ListAllEmployees() {
		
		List<AbsStaffMember> allEmployees=getAllEmployees();
		
		Iterator<AbsStaffMember> it = allEmployees.iterator();
		
		System.out.println("EMPLOYEES: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	
}
