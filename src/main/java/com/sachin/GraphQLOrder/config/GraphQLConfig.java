package com.sachin.GraphQLOrder.config;

import com.sachin.GraphQLOrder.domain.Item;
import com.sachin.GraphQLOrder.domain.Order;
import com.sachin.GraphQLOrder.dao.OrderDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Configuration
public class GraphQLConfig {
    @Bean
    public OrderDAO orderStore() {
        List<Order> orderList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            orderList.add(new Order(Integer.toString(i),
                    123, getItems(),
                    Calendar.getInstance().getTime()));
        }
        return new OrderDAO(orderList);
    }

    private List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("1", "Apple", 1));
        items.add(new Item("2", "Pineapple", 2));
        items.add(new Item("3", "Custard Apple", 5));
        items.add(new Item("4", "Another Apple", 99));
        return items;
    }
}
