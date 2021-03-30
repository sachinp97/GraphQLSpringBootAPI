package com.sachin.GraphQLOrder.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
    private final String id;
    private final int customerId;
    private final List<Item> items;
    private final Date dueDate;

    public Order(String id, int customerId, List<Item> items, Date dueDate) {
        this.id = id;
        this.customerId = customerId;
        this.items = new ArrayList<>();
        this.items.addAll(items);
        this.dueDate = dueDate;
    }

    public int getCustomerId() {
        return this.customerId;
    }
}
