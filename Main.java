package org.example;

import Pizza.Base.Especialidades.PizzaHawaiana;
import Pizza.Base.Especialidades.PizzaCarnivora;
import Pizza.Base.Especialidades.PizzaDeluxe;
import Pizza.Base.Pizza;


//import Pizza.Base.PizzaItaliana;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Debes crear una instancia de PizzaItaliana y agregar los ingredientes
        PizzaItaliana pizza = new PizzaItaliana("Pizza Margherita");
        pizza.addTopping(new Topping("Tomato", 1.5));
        pizza.addTopping(new Topping("Mozzarella", 2.0));
        pizza.addTopping(new Topping("Basil", 0.5));

        // Calcular y obtener el precio de la pizza
        double pizzaPrice = pizza.getPizzaPrice();
        System.out.println("El precio de la pizza es: $" + pizzaPrice);
    }


}


class PizzaItaliana {
    private String name;
    private ArrayList<Topping> toppings = new ArrayList<>();

    public PizzaItaliana(String name) {
        this.name = name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getPizzaPrice() {
        double totalPrice = 0.0;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
}

class Topping {
    private String name;
    private double price;
    private Pizza pizzaPequeña;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Pizza pizzaPequeña = new Pizza();
        System.out.println("Precio de pizza pequeña: $" + pizzaPequeña.getPrecio());
        pizzaPequeña.preparacion();

        Pizza pizzaMediana = new Pizza("mediana");
        System.out.println("Precio de pizza mediana: $" + pizzaMediana.getPrecio());
        pizzaMediana.preparacion();

        PizzaHawaiana hawaianaGrande = new PizzaHawaiana("grande");
        System.out.println("Precio de pizza hawaiana grande: $" + hawaianaGrande.getPrecio());
        hawaianaGrande.preparacion();

        PizzaCarnivora carnivoraGrande = new PizzaCarnivora("grande");
        System.out.println("Precio de pizza hawaiana grande: $" + carnivoraGrande.getPrecio());
        carnivoraGrande.preparacion();

        PizzaDeluxe deluxeGrande = new PizzaDeluxe("grande");
        System.out.println("Precio de pizza hawaiana grande: $" + deluxeGrande.getPrecio());
        deluxeGrande.preparacion();
    }
}

