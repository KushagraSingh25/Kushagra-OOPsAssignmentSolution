package com.oops.main;

import com.oops.department.Admindepartment;
import com.oops.department.Hrdepartment;
import com.oops.department.Superdepartment;
import com.oops.department.Techdepartment;

public class DriverClass {
	public static void main(String[] args) {
		Superdepartment s = new Superdepartment();
		
		s.departmentName();
		s.getTodaysWork();
		s.getWorkDeadline();
		s.isTodayAHoliday();
		System.out.println("Welcome to " + s.departmentName());
 		System.out.println(s.getTodaysWork());
 		System.out.println(s.getWorkDeadline());
 		System.out.println(s.isTodayAHoliday());
		
		
		Superdepartment a = new Admindepartment();
 
 		a.departmentName();
 		a.getTodaysWork();
 		a.getWorkDeadline();
 		System.out.println("\n" + "Welcome to " + a.departmentName());
 		System.out.println(a.getTodaysWork());
 		System.out.println(a.getWorkDeadline());
 		System.out.println(s.isTodayAHoliday());
 		
		Superdepartment h = new Hrdepartment();
		Hrdepartment h1 = new Hrdepartment();
 		
 		h.departmentName();
 		h1.doActivity();
 		h.getTodaysWork();
 		h.getWorkDeadline();
 		System.out.println("\n" + "Welcome to " + h.departmentName());
 		System.out.println(h1.doActivity());
 		System.out.println(h.getTodaysWork());
 		System.out.println(h.getWorkDeadline());
 		System.out.println(s.isTodayAHoliday());
 		
 		Superdepartment t = new Techdepartment();
		Techdepartment t1 = new Techdepartment();
 		
 		t.departmentName();
 		t.getTodaysWork();
 		t.getWorkDeadline();
 		t1.getTechStackInformation();
 		System.out.println("\n" + "Welcome to " + t.departmentName());
 		System.out.println(t.getTodaysWork());
 		System.out.println(t.getWorkDeadline());
 		System.out.println(t1.getTechStackInformation());
 		System.out.println(s.isTodayAHoliday());
 		
	}
}
