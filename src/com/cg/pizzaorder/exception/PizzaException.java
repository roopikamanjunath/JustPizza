package com.cg.pizzaorder.exception;

public class PizzaException extends Exception {
	String str;
	private static final long serialVersionUID = 1L;

public PizzaException(String str) {
	super();
	this.str = str;
}

}
