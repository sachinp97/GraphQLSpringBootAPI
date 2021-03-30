package com.sachin.GraphQLOrder.domain;

import java.io.Serializable;

public class Item implements Serializable {
    private String id;
    private String productName;
    private int quantity;
    public Item(String id, String productName, int quantity){
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
}
