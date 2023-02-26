package com.food.ordering.system.order.service.domain.dto.message;

import common.food.ordering.system.domain.valueobjects.OrderApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class RestaurantApprovalResponse {
    private final String id;
    private final String sagaId;
    private final String orderId;
    private final String restaurantId;
    private Instant createdAt;
    private OrderApprovalStatus orderApprovalStatus;
    private List<String> failureMessages;
}
