package com.tasks;

import java.util.Scanner;

public class BugTracker {
	static Scanner sc = new Scanner(System.in);
	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	boolean status;
	String assignedDeveloper;
	
	public int getBugId() {
		return bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getBugTitle() {
		return bugTitle;
	}

	public void setBugTitle(String bugTitle) {
		this.bugTitle = bugTitle;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getAssignedDeveloper() {
		return assignedDeveloper;
	}

	public void setAssignedDeveloper(String assignedDeveloper) {
		this.assignedDeveloper = assignedDeveloper;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugTracker b = new BugTracker();
		
		System.out.println("Enter bug id : ");
		b.bugId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter bug title: ");
		b.bugTitle=sc.nextLine();
		System.out.println("Enter application Name");
		b.applicationName=sc.nextLine();
		System.out.println("Enter severity: ");
		b.severity=sc.nextLine();
		System.out.println("Enter bug priority : ");
		b.priority=sc.nextLine();
		System.out.println("Bug status : ");
		b.status=sc.nextBoolean();
		b.assignedDeveloper=b.assignToDeveloper(b.bugId,b.assignedDeveloper);
		sc.nextLine();
		b.displayBugSummary();
	}

	public void displayBugSummary() {
		// TODO Auto-generated method stub
		System.out.println("Application Name"+applicationName+", Bug Id : "+bugId+", Bug Title : "+bugTitle+", Severity"+severity+", Bug priority : "+priority);
		if(status) {
			System.out.println("Bug status : Not completed");
			
		}else {
			System.out.println("Bug status : Completed");
		}
	}

	public String assignToDeveloper(int bugId, String assignedDeveloper) {
		// TODO Auto-generated method stub
		System.out.println(bugId+" is assigned to : ");
		assignedDeveloper = sc.nextLine();
		status=updateStatus(status);
		return assignedDeveloper;
		
	}

	public boolean updateStatus(boolean status) {
		// TODO Auto-generated method stub
		status =false;
		return status;
		
	}

}
