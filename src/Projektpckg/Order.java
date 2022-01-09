package Projektpckg;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Client c1;
    String date;
    String dtf;

    public Order(Client c1, String dtf) {
        this.c1 = c1;
        this.dtf = dtf;
    }
    public Order() {

    }

    @Override
    public String toString() {
        return "Order: Personal data:" + c1 + "\n date:" + dtf + "\n";
    }

}

