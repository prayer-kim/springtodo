package kr.re.kitri.hellogram.order.controller;

import kr.re.kitri.hellogram.order.model.Order;
import kr.re.kitri.hellogram.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MallController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public String doOrders(@RequestBody Order order) {
        orderService.doOrder(order);
        return "success";
    }
}
