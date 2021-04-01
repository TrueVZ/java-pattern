package ru.mirea.task14.controllers;


import org.springframework.web.bind.annotation.*;
import ru.mirea.task14.models.Order;

import java.util.ArrayList;

@RestController
public class OrderController {
    ArrayList<Order> orders = new ArrayList<>();
    @PostMapping("/orders/create")
    public String createOrder(@RequestBody Order order){
        orders.add(order);
        order.setId(orders.size());
        return orders.toString();
    }

    @GetMapping("/orders")
    public String allOrders(){
        return orders.toString();
    }

    @DeleteMapping("/orders/{order_id}")
    public String deleteOrder(@PathVariable("order_id") int order_id){
        orders.removeIf(o -> o.getId() == order_id);
        return orders.toString();
    }
}
