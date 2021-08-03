package com.employeewage;

 public class EmpWage {
	public static void main(String[] args) {
			System.out.println("Welcome to the employee wage program");  
			
			    int IS_FULL_TIME = 1;
			    int IS_PART_TIME = 2;
			    int EMP_RATE_PER_HOUR = 20;
			    int NUM_OF_WORKING_DAYS = 20;
			    int MAX_HRS_IN_MONTH = 100;
			    int empWage = 0,  totalEmpWage= 0 ;
			    int workingHour = 0,  totalWorkingHours= 0;
			    int totalWorkingDays = 0;
			    
			    while (totalWorkingHours <=  MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			    	totalWorkingDays++;
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
				totalWorkingHours += totalWorkingHours;
				System.out.println("Day:" +totalWorkingDays+ "Working hour is :" + workingHour);
			
			    }
				totalEmpWage = totalWorkingHours * EMP_RATE_PER_HOUR;
			    System.out.println("Total Employee  wage is: " + totalEmpWage);    
	}
}
