
package com.example.demo.Service;

import com.example.demo.Model.Cart;
import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.RequestDTO.CustomerRequestDto;
import com.example.demo.convertor.CustomerConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String addCustomer(CustomerRequestDto customerRequestDto){

        Customer customer = CustomerConvertor.CustomerRequestDtoToCustomer(customerRequestDto);

        // allocate a cart to customer
        Cart cart = new Cart();
        cart.setCartTotal(0);
        cart.setCustomer(customer);

        // set cart in customer
        customer.setCart(cart);

        customerRepository.save(customer);
        return "Congrats !! Welcome to China Market.";
    }
}