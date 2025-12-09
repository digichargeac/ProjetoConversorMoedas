package src.controller;

import src.service.CurrencyService;

public class CurrencyController {

    private final CurrencyService service;

    public CurrencyController() {
        this.service = new CurrencyService();
    }

    public double convert(String from, String to, double amount) {
        return service.performConversion(from, to, amount);
    }
}
