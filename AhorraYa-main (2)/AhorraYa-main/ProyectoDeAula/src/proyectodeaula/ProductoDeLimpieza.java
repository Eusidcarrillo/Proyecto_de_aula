package proyectodeaula;


public class ProductoDeLimpieza extends Producto {

    public ProductoDeLimpieza() {
    }

    public ProductoDeLimpieza(String nombreProducto, String cantidad, double precio, long codigo, Proveedor vendidoEn) {
        super(nombreProducto, cantidad, precio, codigo, vendidoEn);
    }

    
    @Override
    public boolean buscarProducto(long codigo) {
       return false;
    }

    @Override
    public void eliminar(long codigo) {
        
    }

    @Override
    public void agregar(long codigo) {
        
    }
    
}
