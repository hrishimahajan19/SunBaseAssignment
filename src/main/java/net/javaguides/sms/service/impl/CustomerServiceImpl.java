package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Customer;
import net.javaguides.sms.repository.CustomerRepository;
import net.javaguides.sms.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Override
	public void deletCustomersById(Long id) {

	}

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return null;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return null;
	}

	@Override
	public Customer getCustomerById(Long id) {
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return null;
	}

	@Override
	public void deleteCustomerById(Long id) {

	}



}
