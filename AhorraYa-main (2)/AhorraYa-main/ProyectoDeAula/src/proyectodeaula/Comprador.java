
package proyectodeaula;


public class Comprador extends Persona {
    
    private CarroDeCompra carrito;

    
    public Comprador() {
    }

   

    public Comprador(CarroDeCompra carrito, String nombre, long cedula, int edad, String sexo) {
        super(nombre, cedula, edad, sexo);
        this.carrito = carrito;
    }

    

    public CarroDeCompra getCarrito() {
        return carrito;
    }

    public void setCarrito(CarroDeCompra carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        return "Comprador{" + "carrito=" + carrito + '}';
    }
    
    
    
}
