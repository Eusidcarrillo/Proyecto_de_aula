
package proyectodeaula;

import java.util.ArrayList;


public class Vendedor extends Persona implements IFunciones{
    
    private ArrayList<Producto> catalogo;

    public Vendedor() {
    }
    
    public Vendedor(ArrayList<Producto> catalogo, String nombre, long cedula, int edad, String sexo) {
        super(nombre, cedula, edad, sexo);
        this.catalogo = catalogo;
    }
    
    @Override
    public void buscar(long codigo) {
        
    }

    @Override
    public void eliminar(long codigo) {
         
    }

    @Override
    public void agregar(long codigo) {
        
    }

}
