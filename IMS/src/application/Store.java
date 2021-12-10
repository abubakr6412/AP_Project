package application;

import java.util.ArrayList;

public class Store {

	//ArrayList<String> cars = new ArrayList<String>();
	ArrayList<Department> Depts = new ArrayList<Department>();
	ArrayList<Supplier> Supp = new ArrayList<Supplier>();
	ArrayList<AuditReport> AuditRP = new ArrayList<AuditReport>();
	


	void PopulateSystem() {

		Filehandler FL = new Filehandler();

		Depts=FL.importDept(Depts);
		Supp=FL.importSupplier(Supp);
		

	}

	void DisplayDepartments() {
		for (int i = 0; i < Depts.size(); i++) {
			Depts.get(i).DisplayDepartment();
		}

	}
	void DisplayIC() {
		for (int i = 0; i < Depts.size(); i++) {
			Depts.get(i).IC.DisplayIC();;
		}

	}
	
	void DisplayEmployee() {
		for (int i = 0; i < Depts.size(); i++) {
			for(int j=0;j<Depts.get(i).EMP.size();j++) {
				Depts.get(i).EMP.get(j).DisplayEmployee();
			}
		}

	}
	
	void DisplaySupplie(){
		for(int i=0;i<Supp.size();i++) {
			Supp.get(i).DisplaySupplier();
		}
	}

	public static void main(String[] args) {
		//System.out.println("Hello");
		Store store=new Store();
		store.PopulateSystem();
		
		store.DisplayDepartments();
		store.DisplayIC();
		store.DisplayEmployee();
		
		store.DisplaySupplie();
		
		
	}
	
	
}
