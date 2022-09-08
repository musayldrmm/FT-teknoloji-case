package com.FtTeknoloji.FtTeknoloji.Service;

import com.FtTeknoloji.FtTeknoloji.entity.Customer;
import com.FtTeknoloji.FtTeknoloji.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
