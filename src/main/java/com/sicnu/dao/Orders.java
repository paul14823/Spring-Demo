package com.sicnu.dao;

import com.sicnu.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface Orders {
    void AddOrder(Order order);
}
