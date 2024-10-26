package com.homecare.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecare.services.entities.ServiceProviders;
import com.homecare.services.payload.ServiceProviderDto;
import com.homecare.services.repository.ServiceProviderRepository;
import com.homecare.services.service.ServiceProviderService;

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService{

    @Autowired
    ServiceProviderRepository serviceProviderRepository;
    

    @Override
    public ServiceProviderDto registerServiceProvider(ServiceProviderDto serviceProviderDto) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'registerServiceProvider'");
        ServiceProviders serviceProviders=mapDtoToServiceProvider(serviceProviderDto);
       ServiceProviders savedServiceProvider= serviceProviderRepository.save(serviceProviders);
       ServiceProviderDto toUser=mapServiceProviderToDto(savedServiceProvider);
        return toUser;
    }

    @Override
    public ServiceProviderDto getServiceProviderById(Long id) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getServiceProviderById'");
        ServiceProviders serviceProviders=serviceProviderRepository.findById(id).get();
        return mapServiceProviderToDto(serviceProviders);
    }

    // we will get input of ServiceProvider which is a entity and we will map it to ServiceProviderDto for response to user

    public ServiceProviderDto mapServiceProviderToDto(ServiceProviders serviceProviders){
        ServiceProviderDto serviceProviderDto=new ServiceProviderDto();

        serviceProviderDto.setAadharNumber(serviceProviders.getAadharNumber());
        serviceProviderDto.setContactNumber(serviceProviders.getContactNumber());
        serviceProviderDto.setProviderAddress(serviceProviders.getProviderAddress());
        serviceProviderDto.setProviderAge(serviceProviders.getProviderAge());
        serviceProviderDto.setProviderExperience(serviceProviders.getProviderExperience());
        serviceProviderDto.setProviderFee(serviceProviders.getProviderFee());
        serviceProviderDto.setProviderName(serviceProviders.getProviderName());
        serviceProviderDto.setProviderRating(serviceProviders.getProviderRating());
        serviceProviderDto.setServicesId(serviceProviders.getServicesId());
        serviceProviderDto.setProviderId(serviceProviders.getProviderId());

        return serviceProviderDto;
    }

    public ServiceProviders mapDtoToServiceProvider(ServiceProviderDto serviceProviderDto){

        ServiceProviders serviceProviders=new ServiceProviders();
        serviceProviders.setAadharNumber(serviceProviderDto.getAadharNumber());
        serviceProviders.setContactNumber(serviceProviderDto.getContactNumber());
        serviceProviders.setProviderAddress(serviceProviderDto.getProviderAddress());
        serviceProviders.setProviderAge(serviceProviderDto.getProviderAge());
        serviceProviders.setProviderExperience(serviceProviderDto.getProviderExperience());
        serviceProviders.setProviderFee(serviceProviderDto.getProviderFee());
        serviceProviders.setProviderName(serviceProviderDto.getProviderName());
        serviceProviders.setProviderRating(serviceProviderDto.getProviderRating());
        serviceProviders.setServicesId(serviceProviderDto.getServicesId());

        return serviceProviders;
    }

}
