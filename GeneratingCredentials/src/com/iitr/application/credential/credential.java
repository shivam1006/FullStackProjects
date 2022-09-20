package com.iitr.application.credential;

import java.util.Scanner;

import com.iitr.application.model.Department;
import com.iitr.application.model.Employee;
import com.iitr.application.service.CredentialService;

public class credential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Department");
	    System.out.println("1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
		int option = scanner.nextInt();
		System.out.println("Enter your firstName");
		String firstName = scanner.next();
		
		System.out.println("Enter your lastName");
		String lastName = scanner.next();
		Employee employee = new Employee(firstName ,lastName);
		
		Department department = new Department();
		
		CredentialService service = new CredentialService();
        switch (option) {
        case 1:
        department.setDepartment("Technical");
        String dept = department.getDepartment();
        String Email= service.generateEmailAddress(firstName, lastName, dept);
        String Password=service.generatePassword();
        service.showCredentials(Email, Password);
         break;
        case 2:
    	department.setDepartment("Admin");
    	String dept2 = department.getDepartment();
        String Email2= service.generateEmailAddress(firstName, lastName, dept2);
    	String Password2= service.generatePassword();
    	service.showCredentials(Email2, Password2);
    	break;
        case 3:
    	department.setDepartment("Human Resource");
    	String dept3 = department.getDepartment();
        String Email3= service.generateEmailAddress(firstName, lastName, dept3);
    	String Password3= service.generatePassword();
    	service.showCredentials(Email3, Password3);
    	break;
        case 4:
    	department.setDepartment("Legal");
    	String dept4 = department.getDepartment();
        String Email4= service.generateEmailAddress(firstName, lastName, dept4);    	
        String Password4= service.generatePassword();
    	service.showCredentials(Email4, Password4);
    	break;
        default:
			System.out.println("Please give a valid department no.");
		}
        scanner.close();
        
     }
     
		
		
}


