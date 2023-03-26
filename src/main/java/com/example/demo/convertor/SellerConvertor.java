
package com.example.demo.convertor;

import com.example.demo.Model.Seller;
import com.example.demo.RequestDTO.SellerRequestDto;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;


public class SellerConvertor {

    public static Seller SellerRequestDtoToSeller(SellerRequestDto sellerRequestDto){

        return Seller.builder()
                .name(sellerRequestDto.getName())
                .email(sellerRequestDto.getEmail())
                .mobNo(sellerRequestDto.getMobNo())
                .panNo(sellerRequestDto.getPanNo())
                .build();
    }
}