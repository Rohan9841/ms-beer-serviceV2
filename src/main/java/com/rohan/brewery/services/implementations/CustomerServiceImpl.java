package com.rohan.brewery.services.implementations;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rohan.brewery.services.CustomerService;
import com.rohan.brewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID id) {
		return CustomerDto.builder()
				.id(id)
				.name("Rohan Maharjan")
				.build();
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		
		
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		log.debug("Customer deleted Successfully");
	}
	

}
