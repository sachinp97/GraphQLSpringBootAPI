package com.sachin.GraphQLOrder.dao;

import com.sachin.GraphQLOrder.domain.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDAO {
    List<Order> orders;
    public OrderDAO(List<Order> orders){
        this.orders = new ArrayList<>(orders);
    }

    public void addOrdersToStore(Order order) {
        orders.add(order);
    }

    public List<Order> getOrderDAOSByCustomer(int customerId) {
        return orders.stream()
                .filter(order -> order.getCustomerId() == customerId)
                .collect(Collectors.toList());
    }
}
