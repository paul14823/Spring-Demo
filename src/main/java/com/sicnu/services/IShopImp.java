package com.sicnu.services;

import com.sicnu.dao.Goods;
import com.sicnu.dao.Orders;
import com.sicnu.domain.Good;
import com.sicnu.domain.Order;
import com.sicnu.exception.NotEnoughException;
import com.sicnu.services.interfaces.IShop;
import lombok.Setter;

import java.util.List;

@Setter
public class IShopImp implements IShop {
    private Goods goods;
    private Orders orders;
    @Override
    public void BuySometh(int good_id,int mount) {
        Order order=new Order(good_id,mount);
        orders.AddOrder(order);

        //查询商品数量
        Good good = goods.GetGoodById(good_id);
        if(good==null){
            throw new NullPointerException("没有对应的商品");
        }else if(good.getMount()<mount){
            throw new NotEnoughException("库存不足");
        }
        goods.Buy(good_id,mount);
    }
    @Override
    public List<Good> GetKC(){
        return goods.GetAllGoods();
    }
}