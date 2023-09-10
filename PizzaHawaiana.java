package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
public class PizzaHawaiana extends Pizza {

    public PizzaHawaiana() {
        super();
    }

    public PizzaHawaiana(String tamaño) {
        super(tamaño);
    }

    @Override
    public void preparacion() {
        super.preparacion();
        System.out.println("Añadiendo piña y jamón.");
    }
}
