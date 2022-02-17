package com.example.demo.rest;

import com.example.demo.StepUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private StepUtils stepUtils;

    @RequestMapping({"/", "/results"})
    public String hello(Model model){
        model.addAttribute("headers", stepUtils.getHeadersValues());
        model.addAttribute("rows", stepUtils.getRowsValues());
        return "index";
    }

}
