/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2taller;

import java.util.Scanner;
public class Provedor {
    Scanner n=new Scanner(System.in);
    private String nombre;
    
    private Productosdelprovedor[] productosp;
   private int cantidadp;
   private int cantidadvendida;
   private double dinero;
   private double dinerop;
    
   
   

    public Provedor(String nombre) {
       this.nombre=nombre;
        this.cantidadp=15;
        this.dinero=0.0;
        this.cantidadvendida=0;
        
    }

    public int getCantidadvendida() {
        return cantidadvendida;
    }

    public void setCantidadvendida(int cantidadvendida) {
        this.cantidadvendida = cantidadvendida;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Productosdelprovedor[] getProductosp() {
        
        Productosdelprovedor[] product=new  Productosdelprovedor[15];
        product[0]=new Productosdelprovedor("Huevo", 200, "Proteina");
        product[1]=new Productosdelprovedor("Cerdo", 1600, "Proteina");
        product[2]=new Productosdelprovedor("Pollo", 3100, "Proteina");
        product[3]=new Productosdelprovedor("Bagre",3600, "Proteina");
        product[4]=new Productosdelprovedor("Jamon", 900, "Proteina");
        product[5]=new Productosdelprovedor("Arroz", 500, "Grano");
        product[6]=new Productosdelprovedor("Avena", 800, "Grano");
        product[7]=new Productosdelprovedor("Leche", 2500, "Lacteo");
        product[8]=new Productosdelprovedor("Crush", 400, "Bebida");
        product[9]=new Productosdelprovedor("Fanta", 1500, "Bebida");
        product[10]=new Productosdelprovedor("Cafes", 1300, "Grano");
        product[11]=new Productosdelprovedor("Gomas", 2000, "Dulce");
        product[12]=new Productosdelprovedor("Fresa", 300, "Fruta");
        product[13]=new Productosdelprovedor("Mango", 450, "Carbohidrato");
        product[14]=new Productosdelprovedor("Papel", 1500, "Otros");
        return productosp;
    }

    public void setProductosp(Productosdelprovedor[] productosp) {
        this.productosp = productosp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadp() {
        return cantidadp;
    }

    public void setCantidadp(int cantidadp) {
        this.cantidadp = cantidadp;
    }
    
    public boolean ventadeproducto(int a){
        
          Productosdelprovedor[] product=new  Productosdelprovedor[15];
              product[0]=new Productosdelprovedor("Huevo", 200, "Proteina");
        product[1]=new Productosdelprovedor("Cerdo", 1600, "Proteina");
        product[2]=new Productosdelprovedor("Pollo", 3100, "Proteina");
        product[3]=new Productosdelprovedor("Bagre",3600, "Proteina");
        product[4]=new Productosdelprovedor("Jamon", 900, "Proteina");
        product[5]=new Productosdelprovedor("Arroz", 500, "Grano");
        product[6]=new Productosdelprovedor("Avena", 800, "Grano");
        product[7]=new Productosdelprovedor("Leche", 2500, "Lacteo");
        product[8]=new Productosdelprovedor("Crush", 400, "Bebida");
        product[9]=new Productosdelprovedor("Fanta", 1500, "Bebida");
        product[10]=new Productosdelprovedor("Cafe", 1300, "Grano");
        product[11]=new Productosdelprovedor("Gomas", 2000, "Dulce");
        product[12]=new Productosdelprovedor("Fresa", 300, "Fruta");
        product[13]=new Productosdelprovedor("Mango", 450, "Carbohidrato");
        product[14]=new Productosdelprovedor("Papel", 1500, "Otros");
        
        if (a>=0&&a<this.cantidadp){
            System.out.print("\n");
            System.out.println("Nombre del producto: "+product[a].getNombre()+"\n"+"Precio: "+product[a].getPrecio());
            System.out.print("-Cuantos desea comprar: " );
            int u=n.nextInt();
            
            this.cantidadvendida=u;
            this.dinero=(u*product[a].getPrecio())+this.dinero;
            
            return true;
    
        
        }else{System.out.print("Error");
        return false;}
        
        
    
    }
    
    
}
