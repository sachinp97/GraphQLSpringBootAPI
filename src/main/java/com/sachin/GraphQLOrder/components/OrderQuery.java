package com.sachin.GraphQLOrder.components;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sachin.GraphQLOrder.domain.Order;
import com.sachin.GraphQLOrder.dao.OrderDAO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderQuery implements GraphQLQueryResolver {
    private final OrderDAO orderDAO;

    public OrderQuery(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public List<Order> ordersByCustomer(int customerId) {
        return orderDAO.getOrderDAOSByCustomer(customerId);
    }
}
