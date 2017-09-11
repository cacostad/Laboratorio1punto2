
package punto2taller;


public class Producto {
    
    private String nombre;
    private double precio;
   private int cantidaddeproductos;
    private String tipo;
   private int contador;
   private int minimo;
    
 
    public Producto(String nombre, double precio, String tipo, int cantidaddeproductos, int contador,int minimo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.cantidaddeproductos= cantidaddeproductos;
        this.contador=contador;
        this.minimo=minimo;
        
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

   

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidaddeproductos() {
        return cantidaddeproductos;
    }

    public void setCantidaddeproductos(int cantidaddeproductos) {
        this.cantidaddeproductos = cantidaddeproductos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
   
   
    
    
    
}
