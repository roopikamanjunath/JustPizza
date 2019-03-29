package com.cg.pizzaorder.bean;

public class Customer {
private int customerID;
private String custName;
private String address;
private String phone;
public Customer(int customerID, String custName, String address, String phone) {
	super();
	this.customerID = customerID;
	this.custName = custName;
	this.address = address;
	this.phone = phone;
}
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Customer [customerID=" + customerID + ", custName=" + custName
			+ ", address=" + address + ", phone=" + phone + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((custName == null) ? 0 : custName.hashCode());
	result = prime * result + customerID;
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (custName == null) {
		if (other.custName != null)
			return false;
	} else if (!custName.equals(other.custName))
		return false;
	if (customerID != other.customerID)
		return false;
	if (phone == null) {
		if (other.phone != null)
			return false;
	} else if (!phone.equals(other.phone))
		return false;
	return true;
}

}
