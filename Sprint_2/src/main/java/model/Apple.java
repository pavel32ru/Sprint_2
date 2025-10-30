package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    private String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true); // Яблоки всегда вегетарианские
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(color)) {
            return Discount.DISCOUNT_60;
        }
        return Discount.DISCOUNT_0;
    }

    public String getColor() {
        return color;
    }
}