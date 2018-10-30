package com.qa.accounts.AccountApp;

import java.util.HashMap;

public class AccountServices {
	static HashMap<Integer, Object> hmap = new HashMap<Integer, Object>();
	
	public static void main(String[] args) {
		 
		addAccount();
		getAccount();
		
		
		

	}
	private static void addAccount() {
		
		AccountDetails ac1= new AccountDetails("Guy ","Geld ",1);
		AccountDetails ac2= new AccountDetails("Gary ","Geld ",2);
		AccountDetails ac3= new AccountDetails("Greg ","Geld ",3);
	
		hmap.put(1,ac1);
		hmap.put(2,ac2);
		hmap.put(3,ac3);
	

		
	}
	
	
	private static void getAccount() {
		
		
		 System.out.println("Account Number: "+ 
		 ((AccountDetails) hmap.get(1)).getAccountNumber());
		 System.out.println("First Name: "+((AccountDetails) hmap.get(1)).getLastName());
		 System.out.println("Last Name: " + ((AccountDetails) hmap.get(1)).getFirstName());
		 
		 
		
		 
			
		
		
	}
	}
	
	


