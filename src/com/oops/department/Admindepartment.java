package com.oops.department;

public class Admindepartment extends Superdepartment {
	public String departmentName() {
		return "Admin Department";
	
	}
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
