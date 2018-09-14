package com.capgemini.bankapp.dao.impl;

import java.util.HashSet;
import java.util.Set;

import com.capgemini.bankapp.Database.Database;
import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Set<Customer> customers = Database.getCustomer();

	@Override
	public Customer authenticate(Customer customer) {
		for (Customer c : customers) {
			if (c.getCustomerEmail().equals(customer.getCustomerEmail())) {
				System.out.println(c);
				if (c.getCustomerPassword().equals(customer.getCustomerPassword())) {
					return c;
				}
			}
		}
		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {

		for (Customer c : customers) {
			if (c.getCustomerEmail().equals(customer.getCustomerEmail())) {
				if (c.getCustomerPassword().equals(customer.getCustomerPassword())) {
					c.setCustomerName(customer.getCustomerName());
					c.setCustomerEmail(customer.getCustomerEmail());
					c.setCustomerAddress(customer.getCustomerAddress());
					c.setCustomerDateOfBirth(customer.getCustomerDateOfBirth());
					return c;
				}
			}
		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {

		for (Customer c : customers) {
			if (c.getCustomerEmail().equals(customer.getCustomerEmail())) {
				if (c.getCustomerPassword() == oldPassword) {
					c.setCustomerPassword(newPassword);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public HashSet<Customer> findAllCutomers() {

		return null;
	}
}