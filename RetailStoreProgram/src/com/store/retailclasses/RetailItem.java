package com.store.retailclasses;

public class RetailItem {

	private String itemCode;
	private String itemName;
	private double itemTotalPrice;
	private boolean groceryItem;

	//Constructor
	public RetailItem(String itemCode, String itemName, double itemTotalPrice,
			boolean groceryItem) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemTotalPrice = itemTotalPrice;
		this.groceryItem = groceryItem;
	}
	
	//Getters and Setters
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemTotalPrice() {
		return itemTotalPrice;
	}
	public void setItemTotalPrice(double itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}
	public boolean isGroceryItem() {
		return groceryItem;
	}
	public void setGroceryItem(boolean groceryItem) {
		this.groceryItem = groceryItem;
	}
}
