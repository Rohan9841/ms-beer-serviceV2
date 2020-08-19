package com.rohan.brewery.services;

import java.util.UUID;

import com.rohan.brewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID id);
	CustomerDto saveCustomer(CustomerDto customerDto);
	void updateCustomer(UUID customerId, CustomerDto customerDto);
	void deleteCustomer(UUID customerId);
}
