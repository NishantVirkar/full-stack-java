package com.myproject;

public class Customers {
	private String CustomerName;
	private int CustomerId;
	private int Quantity;
	private double Amount;
	private double TotalAmount;
	private double RequiredAAmount;
	private double Change;

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}

	public double getChange() {
		return Change;
	}

	public void setChange(double change) {
		Change = change;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public double getRequiredAAmount() {
		return RequiredAAmount;
	}

	public void setRequiredAAmount(double requiredAAmount) {
		RequiredAAmount = requiredAAmount;
	}

	

}
