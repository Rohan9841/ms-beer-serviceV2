package com.rohan.brewery.web.mappers;

import org.mapstruct.Mapper;

import com.rohan.brewery.domain.Customer;
import com.rohan.brewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {
	
	Customer customerDtoToCustomer(CustomerDto customerDto);
	CustomerDto customerToCustomerDto(Customer customer);
}
