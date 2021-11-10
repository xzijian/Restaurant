package Entities;

import java.io.Serializable;

public class orderItems implements Serializable {
    private MenuItems orderItem;
    private double chargedPrice;

    public orderItems(MenuItems orderItem){
        this.orderItem = orderItem;
        this.chargedPrice = orderItem.getPrice();
    }

    public MenuItems getMenuItem(){ return this.orderItem; }
    public double getChargedPrice(){ return this.chargedPrice; }
    public String toString(){ return this.getMenuItem().getName(); }

}
