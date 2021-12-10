package application;

public class Employee {

	private int EMPID,PNo,Age,DeptID;
	private String Name,Address,JoinDate,DOB;
	
	
	Employee(int empid,int deptid,int pno,int age,String name,String address,String joindate,String dob){
		DeptID=deptid;
		EMPID=empid;
		PNo=pno;
		Age=age;
		Name=name;
		Address=address;
		JoinDate=joindate;
		DOB=dob;
		
	}
	
	
	public int getEMPID() {
		return EMPID;
	}
	public void setEMPID(int eMPID) {
		EMPID = eMPID;
	}
	public int getPNo() {
		return PNo;
	}
	public void setPNo(int pNo) {
		PNo = pNo;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public int getDeptID() {
		return DeptID;
	}


	public void setDeptID(int deptID) {
		DeptID = deptID;
	}
	
	public void DisplayEmployee() {
		//(int id,int deptid,int pno,int age,String name,String address,String joindate,String dob)
		System.out.println(EMPID+" "+DeptID+" "+PNo+" "+Age+" "+Name+" "+Address+" "+JoinDate +" "+DOB);
	}
	
	
}
