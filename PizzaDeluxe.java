package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
public class PizzaDeluxe extends Pizza {
    public PizzaDeluxe() {
        super(); // Tamaño por defecto
    }

    public PizzaDeluxe(String tamaño) {
        super(tamaño);
    }

    @Override
    public void preparacion() {
        super.preparacion();
        System.out.println("Añadiendo carne, champiñones y vegetales.");
    }
}
