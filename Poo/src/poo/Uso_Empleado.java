/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Aaron
 */
public class Uso_Empleado {
    
    public static void main(String[] args) {
        
        
      
       
       Jefatura jefe_RRHH = new Jefatura("Felipe", 55000, 2018, 12, 21);
       
       jefe_RRHH.estableceIncentivo(2570);
       
       
       Empleado [] misEmpleados= new Empleado[6];
       
       misEmpleados[0] = new Empleado("Aaron", 85000, 2018, 05, 12);
       misEmpleados[1] = new Empleado("Ana", 56000, 2017, 06, 02);
       misEmpleados[2] = new Empleado("Jona", 58000, 2013, 12, 25);
       misEmpleados[3] = new Empleado("Aaron Velasco");
       misEmpleados[5] = new Jefatura("Maria",95000, 1999, 5, 26);
       
       misEmpleados[4] = jefe_RRHH;
      
      
       Jefatura jefa_Finanzas =(Jefatura) misEmpleados[5];
       jefa_Finanzas.estableceIncentivo(55000);

        System.out.println(jefa_Finanzas.tomar_decisiones("Todos pueden descansar"));
        
        System.out.println("El jefe. "+jefa_Finanzas.dameNombre()+" tiene un bonus de: "+jefa_Finanzas.establece_bonus(667));
        
        System.out.println(misEmpleados[3].dameNombre()+" Tiene un bonus de:"+misEmpleados[3].establece_bonus(200));
        
       /* for (int i=0 ; i<3;i++){//se usa una aareglo para recorrer la informacion
       
           misEmpleados[i].subeSueldo(i);
       }*/
       
        System.out.println("");
     
        for (Empleado e: misEmpleados){//for mejorado
       
            e.subeSueldo(6);
       }
       
       /*for(int i=0 ; i<3; i++ ){
    
            System.out.println("Dame Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "+misEmpleados[i].dameSueldo()
                    +" Dame Alta Contrato: "+misEmpleados[i].dameFechaContrato());
        }*/
       
       
      Arrays.sort(misEmpleados);
       
        for (Empleado e : misEmpleados) {//for mejorado
              System.out.println("Dame Nombre: "+ e.dameNombre()+" Sueldo: "+ e.dameSueldo()
                    +" Dame Alta Contrato: "+ e .dameFechaContrato());  
            
        }
       
       
    }
    
}

class Empleado implements Comparable, Trabajadores{
  
    
   
    public Empleado( String nom, double sue,int agno, int mes, int dia ){//Contructor para dar estadio inicial a los objetos
         nombre=nom;
         
         sueldo=sue;
         
         GregorianCalendar calendario = new  GregorianCalendar(agno, mes-1, dia);// metodo no un variable
         
         altaContrato=calendario.getTime();
         ++IdSiguiente;
         Id=IdSiguiente;
    
    }
    
    @Override
    public double establece_bonus(double gratificacion){
    
        return Trabajadores.bonus_base+gratificacion;
    }
    
    public Empleado(String nom){//Contructor sobrecargado, segundo contructor
        
        this(nom,30000,2000,01,01);//llama a el otro constructor
        
    
    }
    
    public String dameNombre(){//getter
    
        //return nombre;
        return nombre +" Id: "+Id;
    }
    
    public double dameSueldo(){//getter
    
        return sueldo;
    }
    
    public Date dameFechaContrato(){//getter
    
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje){//setter
        
        double aumento = sueldo*porcentaje/100;
            
        sueldo+=aumento;
    }
    
    @Override
    public int compareTo(Object miObjeto){
        
        Empleado otroEmpleado=(Empleado) miObjeto;
        
        if (this.sueldo<otroEmpleado.sueldo){
            return -1;
        }
        
        if(this.sueldo>otroEmpleado.sueldo){
            return 1;
        }
        
        return 0;
    }
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int Id;
    static int IdSiguiente;                                              
    }

class Jefatura extends Empleado implements Jefes {//implementa la interface Jefes

            
            
    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom,sue,agno,mes,dia);//llama al primer constructor
    
        
    }
    
    
    @Override
    public String tomar_decisiones (String decision){//intrface
        
        return "Un miembro de la direccion a tomado la decision de: "+decision;
    }
    
    @Override
    public double establece_bonus(double gratificacion){
        
        double prima=2000;//privilejio del jefe 
        return Trabajadores.bonus_base+gratificacion+prima;
    }
    
    public void estableceIncentivo(double b){//setter
        incentivo=b;
    }
    
    @Override
    public double dameSueldo() {//metodo sobrecargado
        double sueldoJefe=super.dameSueldo();//con super usamoa el metodos de la clase padre
        
        return sueldoJefe+incentivo;
    }
    
    private double incentivo;
    
   
    

   
}