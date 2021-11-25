package com.sicnu.services;

import com.sicnu.dao.Goods;
import com.sicnu.dao.Orders;
import com.sicnu.domain.Order;
import com.sicnu.services.interfaces.IShop;
import lombok.Setter;

@Setter
public class IShopImp implements IShop {
    private Goods goods;
    private Orders orders;
    @Override
    public void BuySometh() {
        Order order=new Order();
        orders.AddOrder(order);
    }
}
