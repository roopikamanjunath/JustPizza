package com.cg.pizzaorder.service;

import java.util.HashMap;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.dao.IpizzaOrderDAO;
import com.cg.pizzaorder.dao.PizzaOrderDAO;
import com.cg.pizzaorder.exception.PizzaException;

public class PizzaOrderService implements IPizzaOrderService {
IpizzaOrderDAO ld=new PizzaOrderDAO();
Customer c;
PizzaOrder p;
@Override
	public HashMap<Integer, Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return ((PizzaOrderDAO) ld).findAllCustomers();
	}
@Override
	public HashMap<Integer, PizzaOrder> findAllPizzaorders() {
		// TODO Auto-generated method stub
		return ((PizzaOrderDAO) ld).findAllPizzaorders();
	}
@Override
			public PizzaOrder getOrderDetails(int orderid) throws PizzaException {
				// TODO Auto-generated method stub
	ld.getOrderDetails(orderid);
	
				return ld.getOrderDetails(orderid);
			}
@Override
				public int placeOrder(Customer customer, PizzaOrder pizza) throws PizzaException {
					// TODO Auto-generated method stub
				ld.placeorder(customer, pizza);
					return ld.placeorder(customer, pizza);
				}
@Override
	public Customer validateMobilenumber(String mobileno) {
		// TODO Auto-generated method stub
	if(mobileno.length()==10)
	System.out.println("Mobile number Validated ");
	else{
	System.out.println("you entered wrong mobile number");
	System.exit(0);
	}
		return null;
	}
	}
