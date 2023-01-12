package com.client.ws.rasmooplus.mapper;

import com.client.ws.rasmooplus.dto.UserDto;
import com.client.ws.rasmooplus.entity.SubscriptionType;
import com.client.ws.rasmooplus.entity.User;
import com.client.ws.rasmooplus.entity.UserType;

public class UserMapper {
    public static User fromDtoToEntity(UserDto dto, UserType userType, SubscriptionType subscriptionType) {
        return  User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .cpf(dto.getCpf())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .dtSubscription(dto.getDtSubscription())
                .dtExpiration(dto.getDtExpiration())
                .userType(userType)
                .subscriptionType(subscriptionType)
                .build();
    }
}
