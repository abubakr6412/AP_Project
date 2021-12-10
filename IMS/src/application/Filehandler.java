package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filehandler {

	
	
	
	ArrayList<Department> importDept(ArrayList<Department> depts) {
		
		
		
		File txt = new File("src/application/Dept.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(txt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> data = new ArrayList<String>() ;
		while(scan.hasNextLine()){
		    data.add(scan.nextLine());
		}
	
		String[] simpleArray = data.toArray(new String[]{});
		

		ArrayList<Department> Depts1 = depts;
		
		
		for (int i = 0; i <simpleArray.length; i++) {
			
			String pipeDelimited =simpleArray[i];
			String[] arguments = pipeDelimited.split(",");
				Department temp=new Department(Integer.parseInt(arguments[0]), arguments[1], arguments[2],Integer.parseInt(arguments[3]));
			Depts1.add(temp);
		}
		
		

		
		
		
		
		
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("src/application/InventoryClerk.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String str;

		List<String> list = new ArrayList<String>();
		try {
			while((str = in.readLine()) != null){
			    list.add(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] stringArr = list.toArray(new String[0]);
		
		
			
		for(int i=0;i<stringArr.length;i++) {
			String[] tokens=stringArr[i].split(",");  
			
			
			
			for(int j=0;j<Depts1.size();j++) {
				if(Integer.parseInt(tokens[1])==Depts1.get(j).getID()) {
					
					Depts1.get(j).IC=new InventoryClerk(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),tokens[4],tokens[5],tokens[6],tokens[7]);
				}
			}
			
			
		}
		
		
		
		
		BufferedReader in1 = null;
		try {
			in1 = new BufferedReader(new FileReader("src/application/Employee.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String str1;

		List<String> list1 = new ArrayList<String>();
		try {
			while((str1 = in1.readLine()) != null){
			    list1.add(str1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] stringArr1 = list1.toArray(new String[0]);	
		
		
		for(int i=0;i<stringArr1.length;i++) {
			String[] tokens1=stringArr1[i].split(","); 
			
			for(int j=0;j<Depts1.size();j++) {
				int counter=0;
				if(Depts1.get(j).getID()==Integer.parseInt(tokens1[1])) {
						{
							Employee testemp=new Employee(Integer.parseInt(tokens1[0]),Integer.parseInt(tokens1[1]),Integer.parseInt(tokens1[2]),Integer.parseInt(tokens1[3]),tokens1[4],tokens1[5],tokens1[6],tokens1[7]);
							Depts1.get(j).EMP.add(testemp);
							
							
						}

				}
				
				
				
				
			}
			
		}
			
		
		
		
		
		
		
		
		
		return Depts1;
		
	}
	
	
	ArrayList<Supplier> importSupplier(ArrayList<Supplier> supplier){
		
		
		File txt = new File("src/application/Supplier.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(txt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> data = new ArrayList<String>() ;
		while(scan.hasNextLine()){
		    data.add(scan.nextLine());
		}
	
		String[] simpleArray = data.toArray(new String[]{});
		

		ArrayList<Supplier> supplier1 = supplier;
		
		
		for (int i = 0; i <simpleArray.length; i++) {
			
			String pipeDelimited =simpleArray[i];
			String[] arguments = pipeDelimited.split(",");
				Supplier temp=new Supplier(arguments[0],Integer.parseInt(arguments[1]),Integer.parseInt(arguments[2]),Integer.parseInt(arguments[3]),arguments[4],arguments[5],arguments[6]);
			supplier1.add(temp);
		}
		
		
		
		return supplier1; 
		
	}
	
	
	
	
	
}
