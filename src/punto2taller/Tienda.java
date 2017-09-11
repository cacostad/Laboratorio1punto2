
package punto2taller;
import java.util.Scanner;

public class Tienda {
    
   Scanner j= new Scanner(System.in);
  private double egresos;
  private double ingresos;
   private int numerodecompras;
  private int numerodeventas;
  private double deudas;
    private int nit;
    private String nombre;
  private Producto[] productos;
  private int cantidad;
  private Double dinero;
  private Provedor proveedor;
  private double ganancias;
   private double perdidas;
private int contadordeudas;
private int cantidadd;
    public Tienda(String nombre, int nit) {
        
        this.egresos=0.0;
        this.ingresos=0.0;
       this.productos=new Producto[15];
        this.nit = nit;
        this.nombre = nombre;
        this.cantidad=15;
        this.dinero=0.0;
        this.ganancias=0.0;
         this.perdidas=0.0;
         this.contadordeudas=0;
         this.cantidadd=5;
         this.deudas=0.0;
         this.numerodeventas=0;
          this.numerodecompras=0;
          
   
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public int getNumerodeventas() {
        return numerodeventas;
    }

    public int getNumerodecompras() {
        return numerodecompras;
    }

    public void setNumerodecompras(int numerodecompras) {
        this.numerodecompras = numerodecompras;
    }

    public void setNumerodeventas(int numerodeventas) {
        this.numerodeventas = numerodeventas;
    }

    public int getCantidadd() {
        return cantidadd;
    }

    public void setCantidadd(int cantidadd) {
        this.cantidadd = cantidadd;
    }

    public int getContadordeudas() {
        return contadordeudas;
    }

    public void setContadordeudas(int contadordeudas) {
        this.contadordeudas = contadordeudas;
    }

    public double getDeudas() {
        return deudas;
    }

    public void setDeudas(double deudas) {
        this.deudas = deudas;
    }



   
    
    

    public double getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(double perdidas) {
        this.perdidas = perdidas;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public Provedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Provedor proveedor) {
        this.proveedor = proveedor;
    }

    
    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }
    
    

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto[] getProducto() {
        return productos;
    }

    public void setProducto(Producto[] producto) {
        this.productos = producto;
    }
  
   Provedor proved = new Provedor("Tiendadeallado");
    
    public void darinformacióndelproducto(int a){
        
   productos[0]= new Producto("Huevo", 300, "Proteina",productos[0].getCantidaddeproductos(),productos[0].getContador(),10);
        productos[1]= new Producto("Cerdo", 2000, "Proteina",productos[1].getCantidaddeproductos(),productos[1].getContador(),8);
        productos[2]= new Producto("Pollo", 3500, "Proteina",productos[2].getCantidaddeproductos(),productos[2].getContador(),8);
        productos[3]= new Producto("Bagre",4000, "Proteina",productos[3].getCantidaddeproductos(),productos[3].getContador(),9);
        productos[4]= new Producto("Jamon", 1200, "Proteina",productos[4].getCantidaddeproductos(),productos[4].getContador(),10);
        productos[5]= new Producto("Arroz", 900, "Grano",productos[5].getCantidaddeproductos(),productos[5].getContador(),12);
        productos[6]= new Producto("Avena", 1100, "Grano",productos[6].getCantidaddeproductos(),productos[6].getContador(),10);
        productos[7]= new Producto("Leche", 3000, "Lacteo",productos[7].getCantidaddeproductos(),productos[7].getContador(),15);
        productos[8]= new Producto("Crush", 800, "Bebida",productos[8].getCantidaddeproductos(),productos[8].getContador(),7);
        productos[9]= new Producto("Fanta", 1900, "Bebida",productos[9].getCantidaddeproductos(),productos[9].getContador(),11);
        productos[10]= new Producto("Cafes", 1500, "Grano",productos[10].getCantidaddeproductos(),productos[10].getContador(),15);
        productos[11]= new Producto("Gomas", 2200, "Dulce",productos[11].getCantidaddeproductos(),productos[11].getContador(),7);
        productos[12]= new Producto("Fresa", 500, "Fruta",productos[12].getCantidaddeproductos(),productos[12].getContador(),10);
        productos[13]= new Producto("Mango", 650, "Carbohidrato",productos[13].getCantidaddeproductos(),productos[13].getContador(),10);
        productos[14]= new Producto("Papel", 1700, "Otros",productos[14].getCantidaddeproductos(),productos[14].getContador(),10);
    
        if(a<this.cantidad&&a>=0){
        
    
        System.out.println("Nombre del producto: "+productos[a].getNombre()+"\n"+"Precio: "+productos[a].getPrecio()+"$"+"             "+"Unidades disponibles: "+productos[a].getCantidaddeproductos());
        
        
    }else{System.out.println("Error");}
    
    
    }
    
    
    
    
    
    
    
    
    
    public boolean venderproducto(int a,int b){
        
         if(a<this.cantidad&&a>=0&&b<=productos[a].getCantidaddeproductos()){
             
             
             
             this.dinero=(b*productos[a].getPrecio())+this.dinero;
             this.ingresos=(b*productos[a].getPrecio()+this.ingresos);
             productos[a].setCantidaddeproductos(productos[a].getCantidaddeproductos()-b);
             productos[a].setContador(productos[a].getContador()+b);
             
             System.out.print("                Existencias: "+productos[a].getCantidaddeproductos()+"\n");
             System.out.print("                Contador:    "+productos[a].getContador()+"\n");       
             System.out.print("                Ganancia:    "+(b*productos[a].getPrecio())+"$"+"\n")  ; 
             
                  
                     
                     
             System.out.print("Venta exitosa\n");
             
             return true;
        
    
        
        
        
      
    }else{System.out.println("Error"); return false;}
        
        
    
        
    
    
    
    }
    
    
    public boolean hacerpedido(int a){
        
           
        
            
            proved.ventadeproducto(a);
            
            productos[a].setCantidaddeproductos(productos[a].getCantidaddeproductos()+proved.getCantidadvendida());
              
     this.deudas=proved.getDinero()+this.deudas;
     
          System.out.print("LLeva una deuda de: "+ this.deudas+"$");
                    
       
            
            
            
            this.egresos=proved.getDinero()+this.egresos;
            
            System.out.print("                Existencias: "+productos[a].getCantidaddeproductos()+"\n");
            System.out.print("                Gasto:    "+proved.getDinero()+"$"+"\n")  ; 
            
            
            
       return true;
       
            
        
    }
    
  public boolean pagardeudas1(double a ){
      
      if ( a>=this.deudas){
          a=this.deudas;
          this.deudas=this.deudas-a;
          this.dinero=this.dinero-a;
          
          System.out.println("Gracias por pagar :3");
  return true;
  
  }else{System.out.println("\n");
  System.out.println("........No tienes dinero para pagar"); 
  
  return false;}

}
  
   public boolean pagardeudas2(double a ){
      
      if ( a<this.deudas){
          
          this.deudas=this.deudas-a;
          this.dinero=this.dinero-a;
          
          System.out.println("Gracias por pagar :3");
  return true;
  
  }else{System.out.println("\n");
  System.out.println("........No tienes dinero para pagar"); 
  
  return false;}

}
   
   
   public boolean balance(){
       
       System.out.print(" \n");
               System.out.println("                                   ACTIVIDAD DE LOS PRODUCTOS");
        System.out.println("      Producto      "+"   Unidades vendidas    "+ "     Unidades en posecion    "+"      Unidades totales          \n");
   for (int w=0;w<15;w++){
   
   System.out.println( "       "+ productos[w].getNombre() +  "                  "+ productos[w].getContador() + "                           "+  productos[w].getCantidaddeproductos() + "                          "+( productos[w].getCantidaddeproductos()+productos[w].getContador() ));
   
   }
       this.numerodeventas=0;
    for (int i=0;i<15;i++){
        
    this.numerodeventas=productos[i].getContador()+this.numerodeventas;
    
     } 
    
    this.numerodecompras= proved.getCantidadvendida()+this.numerodecompras;
    proved.setCantidadvendida(0);
     System.out.println("\n");
    System.out.print("-Numero de ventas: "+this.numerodeventas+"\n");
    System.out.print("-Numero de compras: "+this.numerodecompras+"\n");
  
    int u=0;
    int mayor=0;
    for(int y=0;y<15;y++){
    
        
        if(productos[y].getContador()>mayor){
        mayor=productos[y].getContador();
        u=y;
        }
  
    
    }
        System.out.print("-El producto mas vendido fue: "+productos[u].getNombre()+"\n");
    
        System.out.print("-Es necesario solicitar mas unidades de: ");
        
      for(int p=0;p<15;p++){
    
        
        if(productos[p].getCantidaddeproductos()<=productos[p].getMinimo()){
        System.out.print(", "+productos[p].getNombre());
        }
  
    
    }      System.out.print("\n");
        System.out.println("-Los ingresos por las ventas de productos fueron de: " +this.ingresos+"$");
        System.out.println("-Los egresos por las compras de productos fueron de: " +this.egresos+"$");
        System.out.println("-La ganancia fue de: " +(this.ingresos-this.egresos)+"$");
        System.out.println ("-Tiene un deuda por un valor de: " +this.deudas+"$");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   return true;
   }
       
    }
    
    

  