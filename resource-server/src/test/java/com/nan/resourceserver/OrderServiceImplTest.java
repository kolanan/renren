package com.nan.resourceserver;

import com.nan.resourceserver.config.Order;
import com.nan.resourceserver.config.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImplTest extends ResourceServerApplicationTests {

    @Autowired
    private OrderService orderService;
    @Test
    public void testSave(){
        for (int i = 0 ; i< 100 ; i++){
            Order order = new Order();
            order.setName("电脑"+i);
            order.setSex(1);
            orderService.save(order);
        }
    }
    @Test
    public void testGetById(){
        long id = 1184489163202789377L;
        Order order  = orderService.getById(id);
        System.out.println(order.toString());
    }
}
