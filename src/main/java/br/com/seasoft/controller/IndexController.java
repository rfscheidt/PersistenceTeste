package br.com.seasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
    public String index() {
        return "index";
    }
	
	@GetMapping("/view")
    public String view() {
        return "view";
    }
	
	@GetMapping("/edit")
    public String edit() {
        return "edit";
    }
	
	@GetMapping("/add")
    public String add() {
        return "add";
    }

}
