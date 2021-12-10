package application;

public class InventoryClerk {

	private int ID,PNo,Age,DeptID;
	private String Name,Address,JoinDate,DOB;
	
	InventoryClerk(int id,int deptid,int pno,int age,String name,String address,String joindate,String dob){
		setDeptID(deptid);
		setID(id);
		setPNo(pno);
		setAge(age);
		setName(name);
		setAddress(address);
		setJoinDate(joindate);
		setDOB(dob);
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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
	
	public void DisplayIC() {
		//(int id,int deptid,int pno,int age,String name,String address,String joindate,String dob)
		System.out.println(ID+" "+DeptID+" "+PNo+" "+Age+" "+Name+" "+Address+" "+JoinDate +" "+DOB);
	}
	
}
