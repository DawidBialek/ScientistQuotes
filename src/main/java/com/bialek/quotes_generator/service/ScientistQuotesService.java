package com.bialek.quotes_generator.service;

import com.bialek.quotes_generator.resources.Quotes;
import org.springframework.stereotype.Service;

@Service
public class ScientistQuotesService implements QuotesService {

    private final Quotes quotes;

    public ScientistQuotesService(Quotes quotes) {
        this.quotes = quotes;
    }

    public String getQuote(){
        return quotes.getRandomQuote();
    }
}
