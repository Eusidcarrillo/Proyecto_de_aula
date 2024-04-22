
package proyectodeaula;


public class Persona {
    
    private String nombre;
    private long cedula;
    private int edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, long cedula, int edad, String sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }


    public String getSexo() {
        return sexo;
        
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
}

