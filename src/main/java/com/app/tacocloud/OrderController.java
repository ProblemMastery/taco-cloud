package com.app.tacocloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
// RequestMapping specifies that any request-handling methods in this controller will
// handle requests who path begins with "/orders"
// when combined with @GetMapping it specifies that the orderForm() method will handle HTTP GET requests for
// /orders/current
public class OrderController {
    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    /**
     * This method is called to handle submitted order
     * @param order
     * @param errors
     * @return
     */
    @PostMapping // -> for POST requests
    public String processOrder( Order order, Errors errors) {
        if (errors.hasErrors()) {
            return "orderForm";
        }
        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
