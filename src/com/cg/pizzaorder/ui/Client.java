package com.cg.pizzaorder.ui;

import java.time.LocalDateTime;
import java.util.Scanner;
import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exception.PizzaException;
import com.cg.pizzaorder.service.IPizzaOrderService;
import com.cg.pizzaorder.service.PizzaOrderService;


public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int ch;
		IPizzaOrderService ils = new PizzaOrderService();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		entryArguments();
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the name of the customer: ");
			String name=sc.next();
			System.out.println("Enter Customer address: ");
		String address=sc.next();
		System.out.println("Enter Customer Phone Number: ");
		String phonenumber=sc.next();
		ils.validateMobilenumber(phonenumber);
		int custid = (int)(Math.random()* 8956);
		int ordid=(int)(Math.random()* 8956);
		Customer cus=new Customer(custid,name, address, phonenumber);
		System.out.println("Enter the top you want to add: ");
		String top=sc.next();
		PizzaOrder p = new PizzaOrder();
		switch(top)
		{
		case "Capsicum":p.setTotalprice(380.00);	
		System.out.println("Your total Price is "+p.getTotalprice());
		break;
		case "Mushroom":p.setTotalprice(400.00);
		System.out.println("Your total Price is "+p.getTotalprice());
		break;
		case "Jalapeno":p.setTotalprice(420.00);
		System.out.println("Your total Price is "+p.getTotalprice());
		break;
		case "Paneer":p.setTotalprice(435.00);
		System.out.println("Your total Price is "+p.getTotalprice());
		break;
		default:System.out.println("Entered wrong choice");
		}
		PizzaOrder piz=new PizzaOrder(ordid,custid,p.getTotalprice());
		ils.placeOrder(cus, piz);
		System.out.println("\n" + ils.findAllCustomers());
		System.out.println("\n"+ils.findAllPizzaorders());
		System.out.println("Pizza Order Successfully placed with Order ID   "+ ordid);
		System.out.println( LocalDateTime.now() );
		break;
		case 2:
			try{System.out.println("Enter Order ID: ");
			int orderid=sc.nextInt();
			//ils.validateEntry(orderid);
			System.out.println("The details saved are as follows :");
			ils.getOrderDetails(orderid);
			}
			catch(PizzaException ne)
			{
				System.out.println("Order Id is not valid");
			}
			break;
		case 3:System.exit(0);
		default:System.out.println("You entered wrong choice");
		}
		}
	}
	private static void entryArguments() {
		System.out.println("JustEat Pizzas Welcomes you !");
		System.out.println(" 1 : Place Order \n 2 : Display Order\n 3 : Exit");

	}
}
