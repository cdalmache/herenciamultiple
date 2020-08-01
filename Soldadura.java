/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.herenciamultipletarea1;

/**
 * @author User Almache Cristian 
 */

interface Soldadura_fsw{
    
         
    default String Soldar(String nombre){
        return " Indetificar forma de la pieza  "+nombre+" en riel  para soldar";
    }
}
interface Soldadura_frw{
    default String Soldar(String nombre){
        return " Ubicar pieza"+nombre+" en area de inercia para soldar";
}
}
    interface Soldadura_arco{
     default String Soldar(String nombre){
        return "Conectar la pieza "+nombre+" con masa  para soldar";
       }
    }
    
public  class Soldadura implements Soldadura_fsw,Soldadura_frw,Soldadura_arco{
    
    public static void Encabezado(){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("----------- ESPE-------------------");
        System.out.println("Nombre: Almache Cristian");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Gerra");
        System.out.println("Herencia Multiple Tarea 1 ");
         System.out.println("_________________________________________________________________");
         System.out.println("_________________________________________________________________");
    }
  @Override
  public String Soldar(String nombre){
      System.out.println("Ha Elegido Soldadura_fsw ");
      return Soldadura_fsw.super.Soldar( nombre);
  }
  
    /*
   @Override
  public String Soldar(String nombre){
   System.out.println("Ha Elegido Soldadura_frw ");
      return Soldadura_frw.super.Soldar( nombre);
  }
  */
  /*
  @Override
  public String Soldar(String nombre){
   System.out.println("Ha Elegido Soldadura_arco ");
      return Soldadura_arco.super.Soldar( nombre);
  }
  */
  
        public static void main(String[] args) {
            Encabezado();
            Soldadura soldadura=new Soldadura();
            System.out.println(soldadura.Soldar("\n Esperar el proceso"));
       
    }
    
}
