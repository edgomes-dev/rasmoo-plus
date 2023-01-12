package com.client.ws.rasmooplus.mapper;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.dto.error.ErrorResponseDto;
import com.client.ws.rasmooplus.entity.SubscriptionType;
import org.springframework.http.HttpStatus;

public class SubscriptionTypeMapper {
    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto) {
        return SubscriptionType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .accessMonths(dto.getAccessMonth())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }
}
