package com.employeewage;

public class EmpWage {
	public static void main(String[] args) {
			System.out.println("Welcome to the employee wage program");  
			
			    int IS_FULL_TIME = 1;

			    int IS_PART_TIME = 2;
			    int EMP_RATE_PER_HOUR = 20;
			    int NUM_OF_WORKING_DAYS = 20;
			    int empWage = 0;
			    int workingHour = 0, totalEmpWage = 0;
			    for (int day = 0 ;day < NUM_OF_WORKING_DAYS ;day++) {
		       	    int IS_PART_TIME = 2;
			    int dailyWage;
			    int wagePerHour = 20;
			    int workingHour;
				int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;
				switch (empCheck) {
				case 1:
					System.out.println("Employee is full time present");
					workingHour = 8; 
					break;
				case 2:
					System.out.println("Employee is part time present");
					workingHour = 4; 
					break;
				default:
					System.out.println("Employee is absent");
					workingHour = 0;
				}
				empWage = workingHour * EMP_RATE_PER_HOUR;
				totalEmpWage += empWage;
				System.out.println("Employee  wage is " + empWage);
			    }
			    System.out.println("Total Employee  wage is " + totalEmpWage);    
	}
}
