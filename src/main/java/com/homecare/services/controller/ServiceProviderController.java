package com.homecare.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homecare.services.payload.ServiceProviderDto;
import com.homecare.services.service.ServiceProviderService;

@RestController
@RequestMapping("/home-care/servicesProvider")
public class ServiceProviderController {

    @Autowired
    ServiceProviderService serviceProviderService;
    
    @PostMapping("/register")
    public ResponseEntity<ServiceProviderDto> registerServiceProvider(@RequestBody ServiceProviderDto serviceProviderDto){

        return new ResponseEntity<ServiceProviderDto>(serviceProviderService.registerServiceProvider(serviceProviderDto),HttpStatus.CREATED);
    }

    @GetMapping("/getServiceProvider/id/{id}")
    public ResponseEntity<ServiceProviderDto> getServiceProviderById(@PathVariable Long id){
        return new ResponseEntity<ServiceProviderDto>(serviceProviderService.getServiceProviderById(id), HttpStatus.FOUND);
    }
    

}
