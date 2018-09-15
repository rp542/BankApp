package com.capgemini.bankapp.serviceimpl;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.dao.impl.CustomerDaoImpl;
import com.capgemini.bankapp.model.Customer;
import com.capgemini.bankapp.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public Customer authenticate(Customer customer) {
		return customerDao.authenticate(customer);
	}

	@Override
	public Customer updateProfile(Customer customer) {
		return customerDao.updateProfile(customer);
	}

	@Override
	public Customer updatePassword(Customer customer, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}
}