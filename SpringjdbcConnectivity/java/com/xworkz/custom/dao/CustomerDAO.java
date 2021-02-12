package com.xworkz.custom.dao;

import com.xworkz.custom.Customer;

public interface CustomerDAO {
	public void insert(Customer customer);
    public Customer findByCustomerId(int custId);


}
