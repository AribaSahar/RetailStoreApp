package com.store.retailclasses;

import java.util.ArrayList;
import java.util.List;

public class BillCalculator {
	
	//Method to calculate discounts
	public static double calculateBill(Buyer buyer, List<RetailItem> Items) {
		
		double totalItemBill = 0;
		
		for(RetailItem item : Items) {
			boolean isgrocery = item.isGroceryItem();
			boolean loyalCustomer = buyer.getLoyaltyCardHolder();
			String buyerType = buyer.getBuyerCode();
			
			
				switch(buyerType) {
				case "EMP": //Employee
					if(!isgrocery) {
						totalItemBill += item.getItemTotalPrice() * 70 / 100;
					}
					else {
						totalItemBill += item.getItemTotalPrice();
					}
				break;
				case "CUST": //Customer
					if(!isgrocery && loyalCustomer) {
						totalItemBill += item.getItemTotalPrice() * 95 / 100;
					}
					else {
						totalItemBill += item.getItemTotalPrice();
					}
				break;
				case "AFF": //Affiliate of the store
					if(!isgrocery) {
						totalItemBill += item.getItemTotalPrice() * 90 / 100;
					}
					else {
						totalItemBill += item.getItemTotalPrice();
					}
				break;
				}
		}
		
		int amntInHundred = ((int) (totalItemBill/100)) * 100; 
		double discOnHundred = amntInHundred * 5 / 100;
		totalItemBill = totalItemBill - discOnHundred;
		return totalItemBill; //Total bill after applying all discounts
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer purchaser = new Buyer("EMP","Employee","Steven",false); 
		//Buyer purchaser = new Buyer("CUST","Employee","Steven",false);
		//Buyer purchaser = new Buyer("CUST","Employee","Steven",true);
		RetailItem Item1 = new RetailItem("A1", "apple", 65,true);
		RetailItem Item2 = new RetailItem("B8", "towel", 60, false);
		
		List<RetailItem> RetailItems = new ArrayList<RetailItem>();
		RetailItems.add(Item1);
		RetailItems.add(Item2);
		
		double totalBill = calculateBill(purchaser, RetailItems);
		
		System.out.println("The total bill is " + totalBill);
	}

}
