package com.example.nauka;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersion2")
    public String shout(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        theName.toUpperCase();

        String result = "Yo!" + theName;

        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersion3")
    public String processFormVersion3(@RequestParam("studentName") String theName, Model model) {

        theName.toUpperCase();

        String result = "Hello my friend " + theName;

        model.addAttribute("message", result);

        return "helloworld";
    }

}
