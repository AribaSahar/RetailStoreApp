package com.store.retailclasses;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

/**** The user is the customer, one item is a grocery and other is not. Therefore the only discount applied will be the $5 discount
 * on every $100 on the bill.
 */
	
	Buyer purchaser;
	RetailItem Item1;
	RetailItem Item2;
		
	@Before
    public void setUp() {
		 purchaser = new Buyer("CUST","Customer","Steven",false); //Customer for less than 2 years
		 Item1 = new RetailItem("A1", "apple", 65,true); // grocery
		 Item2 = new RetailItem("B8", "towel", 60, false); // non grocery	
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