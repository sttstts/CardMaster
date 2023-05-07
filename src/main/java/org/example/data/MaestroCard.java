package org.example.data;


import java.io.Serializable;

import static org.example.data.Country.RU;
import static org.example.data.PaymentSystem.MAESTRO;

public class MaestroCard extends Card implements ICard, Serializable {
    public MaestroCard(PaymentSystem paymentSystem) {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}
