package Product;

import java.time.LocalDate;

/**
 * Клас Product представляє інформацію про продукт.
 */
public class Product {
    private int id;
    private String title;
    private String producer;
    private int price;
    private LocalDate consume_date;
    private int quantity;

    /**
     * Конструктор класу Product ініціалізує об'єкт з вказаними параметрами.
     *
     * @param id Унікальний ідентифікатор продукту
     * @param title Назва продукту
     * @param producer Виробник продукту
     * @param price Ціна продукту
     * @param consume_date Дата споживання продукту
     * @param quantity Кількість продукту на складі
     */
    public Product(int id, String title, String producer, int price, LocalDate consume_date, int quantity){
        this.id = id;
        this.title = title;
        this.producer = producer;
        this.price = price;
        this.consume_date = consume_date;
        this.quantity = quantity;
    }

    /**
     * Встановлює унікальний ідентифікатор продукту.
     *
     * @param value Новий ідентифікатор
     */
    public void setId(int value){
        this.id = value;
    }

    /**
     * Отримує унікальний ідентифікатор продукту.
     *
     * @return Унікальний ідентифікатор продукту
     */
    public int getId(){
        return this.id;
    }

    /**
     * Встановлює назву продукту.
     *
     * @param value Нова назва продукту
     */
    public void setTitle(String value){
        this.title = value;
    }

    /**
     * Отримує назву продукту.
     *
     * @return Назва продукту
     */
    public String getTitle(){
        return this.title;
    }

    /**
     * Встановлює виробника продукту.
     *
     * @param value Новий виробник продукту
     */
    public void setProducer(String value){
        this.producer = value;
    }

    /**
     * Отримує виробника продукту.
     *
     * @return Виробник продукту
     */
    public String getProducer(){
        return this.producer;
    }

    /**
     * Встановлює ціну продукту.
     *
     * @param value Нова ціна продукту
     */
    public void setPrice(int value){
        this.price = value;
    }

    /**
     * Отримує ціну продукту.
     *
     * @return Ціна продукту
     */
    public int getPrice(){
        return this.price;
    }

    /**
     * Встановлює дату споживання продукту.
     *
     * @param value Нова дата споживання
     */
    public void setConsumeDate(LocalDate value){
        this.consume_date = value;
    }

    /**
     * Отримує дату споживання продукту.
     *
     * @return Дата споживання продукту
     */
    public LocalDate getConsumeDate(){
        return this.consume_date;
    }

    /**
     * Встановлює кількість продукту на складі.
     *
     * @param value Нова кількість продукту
     */
    public void setQuantity(int value){
        this.quantity = value;
    }

    /**
     * Отримує кількість продукту на складі.
     *
     * @return Кількість продукту на складі
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Перевизначений метод toString для представлення об'єкту класу Product у вигляді рядка.
     *
     * @return Рядок, що містить інформацію про продукт
     */
    @Override
    public String toString(){
        return this.id+" -- "+this.title+" -- "+this.producer+" -- "+this.price+" -- "+this.consume_date+" -- "+this.quantity;
    }
}