package com.qa.accounts.AccountApp;

import java.util.HashMap;

import org.json.simple.JSONObject;


public class AccountServices {
	static HashMap<Integer, Object> hmap = new HashMap<Integer, Object>();
	static AccountDetails ac1= new AccountDetails("Guy ","Geld ",1);
	static AccountDetails ac2= new AccountDetails("Greg ","Geld ",2);
	static AccountDetails ac3= new AccountDetails("Greg ","Geld ",3);

	public static void main(String[] args) {
		 
		addAccount();
		getAccount();
		
		
		
	}
	private static void addAccount() {
		
		hmap.put(1,ac1);
		hmap.put(2,ac2);
		hmap.put(3,ac3);
	

		
	}
	
	
	private static void getAccount() {
		
		
//		 System.out.println("Account Number: "+ 
//		 ((AccountDetails) hmap.get(1)).getAccountNumber());
//		 System.out.println("First Name: "+((AccountDetails) hmap.get(1)).getLastName());
//		 System.out.println("Last Name: " + ((AccountDetails) hmap.get(1)).getFirstName());
		 
		 
		JSONObject obj = new JSONObject();
		 obj.put(1, ac1.getLastName() + ac1.getFirstName() + ac1.getAccountNumber());
		 obj.put(2, ac2.getLastName() + ac2.getFirstName() + ac2.getAccountNumber());
		 obj.put(3, ac3.getLastName() + ac3.getFirstName() + ac3.getAccountNumber());
			
				
		System.out.println(obj.toJSONString());




}
}

	
	


