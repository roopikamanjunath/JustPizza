package com.cg.pizzaorder.bean;

public class PizzaOrder {
private int orderId;
private int customerId;
private double totalprice;
public PizzaOrder(int orderId, int customerId, double totalprice) {
	super();
	this.orderId = orderId;
	this.customerId = customerId;
	this.totalprice = totalprice;
}
public PizzaOrder() {
	// TODO Auto-generated constructor stub
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public double getTotalprice() {
	return totalprice;
}
public void setTotalprice(double totalprice) {
	this.totalprice = totalprice;
}
@Override
public String toString() {
	return "PizzaOrder [orderId=" + orderId + ", customerId=" + customerId
			+ ", totalprice=" + totalprice + "]";
}

}
