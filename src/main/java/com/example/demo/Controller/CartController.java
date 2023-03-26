
package com.example.demo.Controller;

import com.example.demo.Repository.CartRepository;
import com.example.demo.RequestDTO.OrderRequestDto;
//import com.example.demo.ResponseDTO.OrderResponseDto;
import com.example.demo.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;
    @Autowired
    private CartRepository cartRepository;

    @PostMapping("/add")
    public String addToCart(@RequestBody OrderRequestDto orderRequestDto){

        String response = "";
        try{
            response = cartService.addToCart(orderRequestDto);
        } catch (Exception e) {
            return e.getMessage();
        }

        return response;
    }

    @PostMapping("/checkout/{customerId}")
    public ResponseEntity checkoutCart(@PathVariable("customerId") int customerId){
        List<com.ChinaMarket.Chinamarket.ResponseDTO.OrderResponseDto> orderResponseDtos;
        try{
            orderResponseDtos = cartService.checkout(customerId);
        }
        catch(Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(orderResponseDtos,HttpStatus.ACCEPTED);
    }
}