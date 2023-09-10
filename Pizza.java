package Pizza.Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;

    private double precio;

    private String tamaño;

    private List<Topping> toppings = new ArrayList<>();

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        //this.price = price;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    //public double getPrice() {
    //  return price;
    //}


    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + ", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The Pizza is ready!");
    }

    public Pizza() {
        this.tamaño = "Pequeña";
        this.precio = calcularPrecio();
    }

    public Pizza(String tamaño) {
        this.tamaño = tamaño;
        this.precio = calcularPrecio();
    }

    private double calcularPrecio() {
        switch (tamaño.toLowerCase()) {
            case "pequeña":
                return 10;
            case "mediana":
                return 12;
            case "grande":
                return 14;
            default:
                return 10;
        }
    }
    public double getPrecio() {
        return precio;
    }

    public void preparacion() {
        System.out.println("Preparando una pizza " + tamaño);
    }
}


