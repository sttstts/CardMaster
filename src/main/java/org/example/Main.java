package org.example;

import org.example.data.Card;
import org.example.data.MasterCard;
import org.example.data.UnionPayCard;
import org.example.data.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static org.example.data.Country.RU;

public class Main {

    public static void main(String[] args) {
        invoke(new MasterCard());
        List<String> aList = new ArrayList<>();

    }


    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 75);
        System.out.println("Current balance: " + card.getBalance());
    }
}