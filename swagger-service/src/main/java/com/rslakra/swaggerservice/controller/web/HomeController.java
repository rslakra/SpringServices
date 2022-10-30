package com.rslakra.swaggerservice.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Rohtash Lakra (rlakra)
 * @created 8/21/21 5:46 AM
 */
@Controller
public class HomeController {

    /**
     * @return
     */
    @GetMapping({"/", "index", "home"})
    public String defaultLayout() {
        return "home";
    }

}
