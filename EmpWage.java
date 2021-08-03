package com.employeewage;

public class EmpWage {
	public static void main(String[] args) {
			System.out.println("Welcome to the employee wage program");  
			
			    int IS_FULL_TIME = 1;
		        int IS_PART_TIME = 2;
			    int dailyWage;
			    int wagePerHour = 20;
			    int workingHour;
				int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;
				if( empCheck == IS_FULL_TIME)
				{
					System.out.println("Employee is full time present");
					workingHour = 8; 
				}
				else if( empCheck == IS_PART_TIME)
				{
					System.out.println("Employee is part time present");
					workingHour = 4; 
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
