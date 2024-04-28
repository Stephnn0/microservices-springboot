package com.example.orders;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @GetMapping("/test")
    public String getOrder() {
        return "Order received successfully!";
    }

}
