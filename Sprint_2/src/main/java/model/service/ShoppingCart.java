package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            total += item.calculateTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (Food item : items) {
            double itemTotal = item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                double discount = discountable.getDiscount();
                itemTotal = itemTotal * (1 - discount / 100);
            }

            total += itemTotal;
        }
        return total;
    }

    public double getTotalPriceVegetarianWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.calculateTotalPrice();
            }
        }
        return total;
    }
}