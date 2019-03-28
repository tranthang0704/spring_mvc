package spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HomeController {
	@RequestMapping("/home")
    public String hello(Model model) {
        model.addAttribute("message", "Hello Spring MVC");
        return "home";     
    }
}
