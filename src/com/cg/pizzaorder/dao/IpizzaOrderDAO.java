package com.cg.pizzaorder.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaException;

public interface IpizzaOrderDAO {
public int placeorder(Customer cust,PizzaOrder pizza )throws PizzaException;
public PizzaOrder getOrderDetails(int orderid) throws PizzaException;
Map<Integer,PizzaOrder> pizzaEntry=new HashMap<Integer, PizzaOrder>();
Map<Integer,Customer> customerEntry=new HashMap<Integer, Customer>();
}
