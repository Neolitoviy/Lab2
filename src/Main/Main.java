package Main;

import Product.Product;

import java.time.LocalDate;

/**
 * Головний клас додатку
 */
public class Main {

    /**
     * Генерує випадкове число
     *
     * @param min - мінімальне значення
     * @param max - максимальне значення
     * @return випадкове ціле число
     */
    static private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /**
     * Створює колекцію продуктів
     *
     * @return список продуктів
     */
    static private Product[] getProductCollection() {
        Product[] products = new Product[20];
        String[] titles = {"Carrot", "Cabbage", "Banana", "Pear", "Salmon"};
        String[] producers = {"Fresh Farms", "Organic Harvest", "Nature's Best", "Green Fields", "BioFarm"};
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(i, titles[getRandomNumber(0, 4)], producers[getRandomNumber(0, 4)], getRandomNumber(5, 500), LocalDate.now().plusDays(getRandomNumber(-7, 21)), getRandomNumber(5, 500));
        }
        return products;
    }

    /**
     * Фільтрує продукти за різними параметрами, такими як назва, ціна та дата споживання.
     *
     * @param products Список продуктів
     * @param title Назва продукту для фільтрації
     * @param price Максимальна ціна для фільтрації
     * @param date Мінімальна дата споживання для фільтрації
     */
    static private void filterProducts(Product[] products, String title, Integer price, LocalDate date) {
        // Логічні умови для визначення заголовків фільтрації
        boolean titleAndPriceAndEatableHeader = title != null && price != null && date != null;
        boolean titleAndPriceHeader = title != null && price != null;
        boolean titleAndEatableHeader = title != null && date != null;
        boolean priceAndEatableHeader = price != null && date != null;
        boolean titleHeader = title != null;
        boolean priceHeader = price != null;
        boolean eatableHeader = date != null;

        // Вивід заголовка в залежності від умов фільтрації
        if (titleAndPriceAndEatableHeader) {
            System.out.println("\n|-----Отримати їстівні продукти за назвою " + title + " та ціною не вище " + price + "-----|");
        } else if (titleAndPriceHeader) {
            System.out.println("\n|-----Отримати продукти за назвою " + title + " та ціною не вище " + price + "-----|");
        } else if (titleAndEatableHeader) {
            System.out.println("\n|-----Отримати їстівні продукти за назвою " + title + "-----|");
        } else if (priceAndEatableHeader) {
            System.out.println("\n|-----Отримати їстівні продукти за ціною не вище " + price + "-----|");
        } else if (titleHeader) {
            System.out.println("\n|-----Отримати продукти за назвою " + title + "-----|");
        } else if (priceHeader) {
            System.out.println("\n|-----Отримати продукти за ціною не вище " + price + "-----|");
        } else if (eatableHeader) {
            System.out.println("\n|-----Їстівні продукти-----|");
        } else  {
            System.out.println("\n|-----Всі продукти-----|");
        }

        System.out.println("[Назва]--[Ціна]--[Кількість]--[Споживання до]--[Виробник]");

        // Вивід відфільтрованих продуктів
        for (Product product : products) {
            boolean titleMatches = title == null || product.getTitle().equals(title);
            boolean priceMatches = price == null || product.getPrice() <= price;
            boolean dateMatches = date == null || product.getConsumeDate().isAfter(date);

            if (titleMatches && priceMatches && dateMatches) {
                System.out.println(product.getTitle() + " -- " + product.getPrice() + "₴ -- " + product.getQuantity() + " -- " + product.getConsumeDate().toString() + " -- " + product.getProducer());
            }
        }

        System.out.println("|------------------------------|");
    }

    /**
     * Головний метод програми
     *
     * @param args Масив аргументів командного рядка
     */
    public static void main(String[] args) {
        Product[] products = getProductCollection();

        filterProducts(products, "Carrot", null, null);
        filterProducts(products, "Cabbage", 50, null);
        filterProducts(products, null, null, LocalDate.now());
    }
}