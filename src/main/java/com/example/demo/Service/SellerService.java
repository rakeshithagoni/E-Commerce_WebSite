
package com.example.demo.Service;

import com.example.demo.Model.Seller;
import com.example.demo.Repository.SellerRepository;
import com.example.demo.RequestDTO.SellerRequestDto;
import com.example.demo.convertor.SellerConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepo;

    public String addSeller(SellerRequestDto sellerRequestDto){

        Seller seller = SellerConvertor.SellerRequestDtoToSeller(sellerRequestDto);
        sellerRepo.save(seller);

        return "Congrats! Now you can sell on Chine Market !!!";
    }
}