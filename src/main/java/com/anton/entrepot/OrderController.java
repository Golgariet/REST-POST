package com.anton.entrepot;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

//    @RequestMapping(value="/order", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
//    public Order requestInformation(){
//
//        Order order = new Order();
//
//        order.setId("awd");
//        order.setPrice(22);
//
//        return order;
//
//    }

    @RequestMapping(value="/order", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CodeStatus> requestInformation(){

        Order order = new Order();

        order.setId("awd");
        order.setPrice(22);

        return new ResponseEntity<>(HttpStatus.OK);

    }

//    @RequestMapping(value="/order", method=RequestMethod.POST)
//    public ResponseEntity<CodeStatus> getCode(/*@PathVariable Integer id*/){
//        return new ResponseEntity<>(HttpStatus.OK);
//    }






}
