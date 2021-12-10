package application;

import java.util.ArrayList;

public class Supplier {

	private String Name,JoinDate,Company,Address;
	private int SupplierID,PNo,Age;
	ArrayList<Product> Products = new ArrayList<Product>();
	
	
	Supplier(String name,int suppid,int pno,int age,String company,String address,String joindate){
		Name=name;
		SupplierID=suppid;
		PNo=pno;
		Age=age;
		Company=company;
		Address=address;
		JoinDate=joindate;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getSupplierID() {
		return SupplierID;
	}
	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
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
	
	public void DisplaySupplier() {
		System.out.println(Name+" "+SupplierID+" "+PNo+" "+Age+" "+Company+" "+Address+" "+JoinDate);
	}
	
}
