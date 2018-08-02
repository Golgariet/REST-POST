package com.anton.entrepot;

public class Order {

    public String id;
    public float price;

    public Order(){

    }

    public Order(String id, float price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return "Order{" +
//                "id='" + id + '\'' +
//                ", price=" + price +
//                '}';
//    }
}
