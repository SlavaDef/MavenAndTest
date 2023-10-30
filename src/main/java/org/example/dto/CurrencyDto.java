package org.example.dto;

import org.example.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CurrencyDto {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Main.class);

    private String currency;
    private Double value;

    public CurrencyDto() {
    }

    public CurrencyDto(String currency, Double value) {
        this.currency = currency;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    /*@Override
    public String toString() {
        return "CurrencyDto{" +
                "currency='" + currency + '\'' +
                ", value=" + value +
                '}';
    } */

    public void log(){
        LOGGER.info("currency = {}, value = {}",
                currency,
                value); // як би заміна printLn в дужки підставиться значення змінних
    }


}
