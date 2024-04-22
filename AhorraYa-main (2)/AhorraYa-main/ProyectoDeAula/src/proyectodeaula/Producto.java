
package proyectodeaula;


public abstract class Producto {
    
    private String nombreProducto;
    private String cantidad;
    private double precio;
    private long codigo;
    
    //RELACION CON LA CLASE PROVEEDOR
    private Proveedor vendidoEn;

    public Producto() {
    }

    public Producto(String nombreProducto, String cantidad, double precio, long codigo, Proveedor vendidoEn) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo= codigo;
        this.vendidoEn = vendidoEn;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
     public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Proveedor getVendidoEn() {
        return vendidoEn;
    }

    public void setVendidoEn(Proveedor vendidoEn) {
        this.vendidoEn = vendidoEn;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", precio=" + precio + ", vendidoEn=" + vendidoEn + '}';
    }
    
    public abstract boolean buscarProducto(long codigo);
    public abstract void eliminar(long codigo);
    public abstract void agregar(long codigo);
      
}
    

    