
package proyectodeaula;


public class Admin extends Persona implements IFunciones{

    public Admin() {
    }

    public Admin(String nombre, long cedula, int edad, String sexo) {
        super(nombre, cedula, edad, sexo);
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
