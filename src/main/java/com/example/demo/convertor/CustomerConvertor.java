
package com.example.demo.convertor;

import com.example.demo.Model.Customer;
import com.example.demo.RequestDTO.CustomerRequestDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerConvertor {

    public static Customer CustomerRequestDtoToCustomer(CustomerRequestDto customerRequestDto){

        return Customer.builder()
                .name(customerRequestDto.getName())
                .age(customerRequestDto.getAge())
                .email(customerRequestDto.getEmail())
                .mobNo(customerRequestDto.getMobNo())
                .build();
    }
}