package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String homePage() {

        return "<html>" +
                "<body>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "</h2>" +
                "<ol>" +
                "<li> Kotlin </li>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "</ol>" +
                "</body>" +
                "/html>";




    }
    @GetMapping("/form")
    public String displayForm() {
        return "<html>" +
                "<body>" +
                "<h1>" +
                "Form Page" +
                "</h1>" +
                "<form>" +
                "<select>" +
                "<option> Kotlin </option>" +
                "<option> Java </option>" +
                "<option> JavaScript</option>" +
                "</select>" +
                "</form>" +

                "</body>" +
                "/html>";
    }
//    @PostMapping("/form")
//    public String formResults
}
