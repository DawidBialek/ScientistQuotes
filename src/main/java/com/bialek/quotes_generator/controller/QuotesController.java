package com.bialek.quotes_generator.controller;

import com.bialek.quotes_generator.service.ScientistQuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuotesController {

    private ScientistQuotesService quotesService;

    public QuotesController(ScientistQuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping({"","/"})
    public String getQuote(Model model){

        model.addAttribute("quote", quotesService.getQuote());
        return "quotes";
    }
}
