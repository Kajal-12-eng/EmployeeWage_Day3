package com.employeewage;

public class EmpWage {
	public static void main(String[] args) {
			System.out.println("Welcome to the employee wage program");  
			
			   
		     int IS_FULL_TIME = 1;
				int dailyWage;
				int wagePerHour = 20;
				int workingHour;
				int empCheck = (int)(Math.floor(Math.random() * 10)) % 2;
				if( empCheck == IS_FULL_TIME)
				{
					System.out.println("Employee is present");
					workingHour = 8; 
				}
				else
				{
					System.out.println("Employee is absent");
					workingHour = 0;
				}
				
				dailyWage = workingHour * wagePerHour;
				System.out.println("Employee daily wage is " + dailyWage);

	}
}
