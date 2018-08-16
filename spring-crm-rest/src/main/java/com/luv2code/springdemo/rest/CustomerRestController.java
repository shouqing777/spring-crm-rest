package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

/**
 * @author shouqing E-mail:shouqing777@gmail.com
 * @version 創建時間：2018年7月29日 下午4:53:18 類說明
 */
@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		
		return customerService.getCustomers();
		
	}
	
	@GetMapping("customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
	
		Customer theCustomer = customerService.getCustomer(customerId);
			
		if(theCustomer == null) {
			throw new CustomerNotFoundException("customer id not found - " +customerId);
		}	
		
		return theCustomer;
		
	}
	
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		customer.setId(0);
		
		customerService.saveCustomer(customer);
		
		return customer;
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		
		customerService.saveCustomer(customer);
		
		return customer;
		
	}
	
	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		
		Customer customer = customerService.getCustomer(customerId);
		
		customerService.deleteCustomer(customerId);
		
		if(customer == null) {
			throw new CustomerNotFoundException("customer id not found - " +customerId);
		}	
		
		return "Deleted customer id - " + customerId;
	}
	
	
}
