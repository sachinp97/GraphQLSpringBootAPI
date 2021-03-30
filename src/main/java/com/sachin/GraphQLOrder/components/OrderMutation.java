package com.sachin.GraphQLOrder.components;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sachin.GraphQLOrder.dao.OrderDAO;
import com.sachin.GraphQLOrder.domain.Item;
import com.sachin.GraphQLOrder.domain.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class OrderMutation implements GraphQLMutationResolver {
    private OrderDAO orderDAO;

    public OrderMutation(OrderDAO orderDAO){
        this.orderDAO = orderDAO;
    }
    public Order writeOrder(int customerId, List<Item> items, Date dueDate){
        Order order = new Order(UUID.randomUUID().toString(), customerId, items, dueDate);
        orderDAO.addOrdersToStore(order);
        return order;
    }
    public Order writeOrder(int customerId, Date dueDate){
        return writeOrder(customerId, new ArrayList<>(), dueDate);
    }
}
