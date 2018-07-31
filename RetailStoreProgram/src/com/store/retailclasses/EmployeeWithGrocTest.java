package com.store.retailclasses;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EmployeeWithGrocTest {

/**** The user is an employee of the store, both are the grocery items. Therefore, no discount will be applied except $5 discount 
 * on every $100 on the bill.****/
	
	Buyer purchaser;
	RetailItem Item1;
	RetailItem Item2;
		
	@Before
    public void setUp() {
		 purchaser = new Buyer("EMP","Employee","Steven",false); //Employee
		 Item1 = new RetailItem("A1", "apple", 65,true); // grocery
		 Item2 = new RetailItem("B8", "towel", 60, true); // non grocery
	}
	
	@Test
	public void test() {
		
		List<RetailItem> RetailItems = new ArrayList<RetailItem>();
		RetailItems.add(Item1);
		RetailItems.add(Item2);
		
		double totalBill = BillCalculator.calculateBill(purchaser, RetailItems);
		assertEquals(120, totalBill,0);
		
	}

}
