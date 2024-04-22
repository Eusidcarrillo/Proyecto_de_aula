
package proyectodeaula;

import java.util.ArrayList;


public class Proveedor {
    
    private String ubicacion;
    private String nombre;
    
    //RELACION CON LA CLASE PRODUCTO
    private ArrayList<Producto> productos;

    public Proveedor() {
    }

    public Proveedor(String ubicacion, String nombre, ArrayList<Producto> productos) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "ubicacion=" + ubicacion + ", nombre=" + nombre + ", productos=" + productos + '}';
    }
}
