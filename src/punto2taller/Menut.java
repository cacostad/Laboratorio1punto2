/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2taller;

import java.util.Scanner;
public class Menut {
    
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        
    
        
       Tienda t=new Tienda("Señorapedidora",990705);
       
     
                    
       int bandera=1;
       Producto[] productos=new Producto[15];
       productos[0]= new Producto("Huevo", 300, "Proteina",30,0,10);
        productos[1]= new Producto("Cerdo", 2000, "Proteina",20,0,8);
        productos[2]= new Producto("Pollo", 3500, "Proteina",20,0,8);
        productos[3]= new Producto("Bagre",4000, "Proteina",15,0,9);
        productos[4]= new Producto("Jamon", 1200, "Proteina",30,0,10);
        productos[5]= new Producto("Arroz", 900, "Grano",30,0,12);
        productos[6]= new Producto("Avena", 1100, "Grano",30,0,10);
        productos[7]= new Producto("Leche", 3000, "Lacteo",30,0,15);
        productos[8]= new Producto("Crush", 800, "Bebida",15,0,7);
        productos[9]= new Producto("Fanta", 1900, "Bebida",21,0,11);
        productos[10]= new Producto("Cafes", 1500, "Grano",40,0,15);
        productos[11]= new Producto("Gomas", 2200, "Dulce",14,0,7);
        productos[12]= new Producto("Fresa", 500, "Fruta",20,0,10);
        productos[13]= new Producto("Mango", 650, "Carbohidrato",20,0,10);
        productos[14]= new Producto("Papel", 1700, "Otros",30,0,10);
        t.setProducto(productos);
       
       while(bandera==1){
           
       
       System.out.println(                  "Tienda de la señora de la entrevista\n");
              System.out.println("-Que desea hacer:");
              System.out.println("      1.Vender.");
              System.out.println("      2.Hacer pedidos.");
              System.out.println("      3.Ver balance del dia.");
              System.out.println("      4.Pagar Deudas.");
              System.out.println("      5.Cerrar la tienda.");
              System.out.println("                        Dinero: "+t.getDinero()+"$");
               System.out.println("                        Opcion:");
               
              int g=o.nextInt();
       o.nextLine();
              
       switch(g){
       
   
           case 1:{
               
        int caso1=1;
  while (caso1==1){
      System.out.println("Que esta comprando el cliente:"+"\n")  ;
      System.out.println("0.Huevo.");
        System.out.println("1.Cerdo.");
  System.out.println("2.Pollo.");    
  System.out.println("3.Bagre.");  
    System.out.println("4.Jamon.");
      System.out.println("5.Arroz.");
        System.out.println("6.Avena.");
          System.out.println("7.Leche.");
            System.out.println("8.Crush.");
              System.out.println("9.Fanta.");
                System.out.println("10.Cafes.");
                  System.out.println("11.Gomas.");
                    System.out.println("12.Fresa.");
                      System.out.println("13.Mango.");
                        System.out.println("14.Papel.");
                                                System.out.print("               Opcion: ");
                        
                     System.out.print("\n");
                      int l=o.nextInt();
                       
                      t.darinformacióndelproducto(l);
                      System.out.println("\n");
                     System.out.print("Cuantas unidades desea comprar: ");
                     int m=o.nextInt();
                  
        t.venderproducto(l, m);
        
        
        System.out.print("\n");
        System.out.println("-Si desea seguir comprando oprima 1 de lo contrario oprima 0");
        int boton=o.nextInt();
        
        if(boton==0){caso1=0;}
      
        
           }
         break;
       }
           case 2:{
              int caso2=1;
  while (caso2==1){
              System.out.println("\n");
           System.out.println("-Cual producto desea pedir:");
           System.out.println("0.Huevo.");
        System.out.println("1.Cerdo.");
  System.out.println("2.Pollo.");    
  System.out.println("3.Bagre.");  
    System.out.println("4.Jamon.");
      System.out.println("5.Arroz.");
        System.out.println("6.Avena.");
          System.out.println("7.Leche.");
            System.out.println("8.Crush.");
              System.out.println("9.Fanta.");
                System.out.println("10.Cafes.");
                  System.out.println("11.Gomas.");
                    System.out.println("12.Fresa.");
                      System.out.println("13.Mango.");
                        System.out.println("14.Papel.");
                                                System.out.print("               Opcion: ");
           int e=o.nextInt();
           
           t.hacerpedido(e);
           
             System.out.print("\n");
        System.out.println("-Si desea seguir comprando oprima 1 de lo contrario oprima 0");
        int boton2=o.nextInt();
        
        if(boton2==0){caso2=0;}
           
           
           
           }
           break;
           }    
     
           case 3:{
               
                 int caso3=1;
  while (caso3==1){
               
               System.out.print(" \n");
               System.out.println("Balance del día:");
               t.balance();
               
               
            
               System.out.println("\n");
        System.out.println("-Si desea seguir mirando oprima 1 de lo contrario oprima 0");
        int boton3=o.nextInt();
        
        if(boton3==0){caso3=0;}
               
  }
               
          break; 
           }     
           
           
           
           
           case 4:{
               
               int caso4=1;
  while (caso4==1){
               t.getDeudas();
               if(t.getDeudas()>0){
           System.out.println("Deudas\n");
            System.out.println("Actualmente tiene una deuda de:"+t.getDeudas()+"$");
            System.out.println("Que desea hacer:");
                    System.out.println("        1.Pagar toda la deuda");
                    System.out.println("        2.Abonar una parte");
                    int deuda=o.nextInt();
                    
                 if(deuda==1){
                     
     
                 t.pagardeudas1( t.getDinero());
                 
                 System.out.println("Deuda actual :"+t.getDeudas()+"$");
                 
                 }else{if(deuda==2){
                     
                     System.out.println("Cuanto dinero desea ingresar :");
                     double din=o.nextDouble();
                     
                     if(din<t.getDinero()){
                     
                     t.pagardeudas2(din);
                     System.out.println("Deuda actual :"+t.getDeudas()+"$");
                     }else{System.out.println("\n");
                     System.out.println("......No tienes ese dinero");}
                     
                 }else{System.out.println("Error");}}
           }else{System.out.println("No tienes deudas");}
               
               
               
        System.out.print("-Si desea seguir oprima 1 de lo contrario oprima 0");
        int boton4=o.nextInt();
        
        if(boton4==0){caso4=0;}
           
           }
                    
                    
                    
                    
                    
          
          
           
           
           
           
           break;
           } 
           
    }
    
    
    }
       
    }
    
           }
