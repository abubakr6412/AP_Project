package application;

import java.util.ArrayList;

public class Department {
	private int ID, PersonnelCount;
	
	private String Location, Name;
	
	InventoryClerk IC;
	//ArrayList<String> cars = new ArrayList<String>();
	ArrayList<Employee> EMP = new ArrayList<Employee>();
	
	
	Department(int id,String name,String location,int count){
		
		ID=id;
		Name=name;
		PersonnelCount=count;
		Location=location;
		
	}
	
	public int getPersonnelCount() {
		return PersonnelCount;
	}
	public void setPersonnelCount(int personnelCount) {
		PersonnelCount = personnelCount;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public void DisplayDepartment() {
		System.out.println(ID +" "+ Name+" "+Location+" "+PersonnelCount);
	}

}
