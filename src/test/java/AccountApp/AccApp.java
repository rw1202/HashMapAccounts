package AccountApp;

import junit.framework.TestCase;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import com.qa.accounts.AccountApp.AccountDetails;




public class AccApp extends TestCase {
	

@Test

public int firstNameTest() {

	HashMap<Integer, Object> hmap = new HashMap<Integer, Object>();
	AccountDetails ac2= new AccountDetails("Greg ","Geld ",2);
	AccountDetails ac3= new AccountDetails("Greg ","Geld ",3);
	
	int count =0; 
	
	
	Object Value = hmap.get(ac2);
	{
		return assertEquals(count,2);
			}
	
}
	
}

