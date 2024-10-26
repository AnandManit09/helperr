package com.homecare.services.service;

import com.homecare.services.payload.ServiceProviderDto;

public interface  ServiceProviderService {

    ServiceProviderDto registerServiceProvider(ServiceProviderDto serviceProviderDto);

    ServiceProviderDto getServiceProviderById(Long id);

     
}
