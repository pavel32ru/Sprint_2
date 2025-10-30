import model.Meat;
import model.Apple;
import model.Food;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        // Создание массива продуктов
        Food[] products = {meat, redApples, greenApples};

        // Инициализация корзины
        ShoppingCart cart = new ShoppingCart(products);

        // Расчет и вывод результатов
        System.out.println("=== РЕЗУЛЬТАТЫ РАСЧЕТА ===");
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalPriceVegetarianWithoutDiscount() + " руб.");

        // Дополнительная информация для проверки
        System.out.println("\n=== ДЕТАЛЬНАЯ ИНФОРМАЦИЯ ===");
        System.out.println("Мясо: " + meat.getAmount() + " кг × " + meat.getPrice() + " руб. = " + meat.calculateTotalPrice() + " руб.");
        System.out.println("Красные яблоки: " + redApples.getAmount() + " кг × " + redApples.getPrice() + " руб. = " + redApples.calculateTotalPrice() + " руб. (скидка " + redApples.getDiscount() + "%)");
        System.out.println("Зеленые яблоки: " + greenApples.getAmount() + " кг × " + greenApples.getPrice() + " руб. = " + greenApples.calculateTotalPrice() + " руб. (скидка " + greenApples.getDiscount() + "%)");
    }
}