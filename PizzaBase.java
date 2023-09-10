package Pizza.Base.Interfaces;

public class PizzaBase implements Preparable{

    private String nombre;

    private double precio;

    public PizzaBase(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

}
