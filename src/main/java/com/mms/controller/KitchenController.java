package com.mms.controller;

import com.mms.repository.KitchenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/kitchen")
public class KitchenController {

    @Autowired
    private KitchenRepository kitchenRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String getMms() {
        return "MMS COMING SOON INCHAALLAH";
    }


}
