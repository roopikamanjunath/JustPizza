package com.cg.pizzaorder.dao;

import java.util.HashMap;
import java.util.Map;
import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaException;

public class PizzaOrderDAO implements IpizzaOrderDAO {
//	Customer c;
//	PizzaOrder p;
private	Map<Integer,PizzaOrder> pizzaEntry=new HashMap<Integer, PizzaOrder>();
private	Map<Integer,Customer> customerEntry=new HashMap<Integer, Customer>();
@Override
public int placeorder(Customer cust, PizzaOrder pizza)
		throws PizzaException {
	// TODO Auto-generated method stub
	customerEntry.put((int) cust.getCustomerID(),cust);
	pizzaEntry.put((int) pizza.getOrderId(),pizza);
	return 0;
}
@Override
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException {
		// TODO Auto-generated method stub
	if(pizzaEntry.containsKey(orderid)){
	System.out.println(pizzaEntry.get(orderid));
	}
	else
		throw new PizzaException("OrderId is not valid");
	/*Collection<Entry<Integer, PizzaOrder>> st = pizzaEntry.entrySet();
	
	for (Entry<Integer, PizzaOrder> me:st) 
    { 
        //System.out.println(me.getValue());
       // break;
    }*/
		return null;
	}
public HashMap<Integer, Customer> findAllCustomers() {

	return (HashMap<Integer, Customer>) customerEntry;

}

public HashMap<Integer, PizzaOrder> findAllPizzaorders() {

	return (HashMap<Integer, PizzaOrder>) pizzaEntry;

}
}
