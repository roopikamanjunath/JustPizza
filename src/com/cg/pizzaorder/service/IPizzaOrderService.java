package com.cg.pizzaorder.service;

import java.util.HashMap;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaException;


public interface IPizzaOrderService {
	public HashMap<Integer, Customer> findAllCustomers(); // This method finds all the customers

	public HashMap<Integer, PizzaOrder> findAllPizzaorders(); // this method finds all the loans
public int placeOrder(Customer customer,PizzaOrder pizza)throws PizzaException;
public PizzaOrder getOrderDetails(int orderid)throws PizzaException;
public Customer validateMobilenumber(String mobileno);
}
