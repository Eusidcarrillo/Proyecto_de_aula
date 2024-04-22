
package proyectodeaula;

import java.util.ArrayList;


public class CarroDeCompra {
    
    private ArrayList<Producto> productos;

    public CarroDeCompra() {
    }

    public CarroDeCompra(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "CarroDeCompra{" + "productos=" + productos + '}';
    }
    
}
