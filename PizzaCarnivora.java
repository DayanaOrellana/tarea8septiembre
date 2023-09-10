package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
public class PizzaCarnivora extends Pizza {

    public PizzaCarnivora() {
        super();
    }

    public PizzaCarnivora(String tamaño) {
        super(tamaño);
    }

    @Override
    public void preparacion() {
        super.preparacion();
        System.out.println("Añadiendo Carne y jamon.");
    }
}
