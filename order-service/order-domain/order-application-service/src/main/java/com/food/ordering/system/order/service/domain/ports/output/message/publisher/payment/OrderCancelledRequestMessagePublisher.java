package com.food.ordering.system.order.service.domain.ports.output.message.publisher.payment;

import com.food.ordering.system.order.service.domain.event.OrderCancelledEvent;
import common.food.ordering.system.domain.event.publisher.DomainEventPublisher;

public interface OrderCancelledRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {

}
