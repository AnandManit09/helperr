package com.homecare.services.payload;

import java.util.List;

import com.homecare.services.entities.Address;
import com.homecare.services.entities.Rating;
import com.homecare.services.entities.ServiceList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ServiceProviderDto {

    private Long providerId;
    private String providerName;
    private int providerAge;
    private Address providerAddress;
    private Long aadharNumber;
    private Long contactNumber;
    private List<Rating> providerRating;
    private int providerFee;
    private ServiceList servicesId;
    private int providerExperience;

    


}
