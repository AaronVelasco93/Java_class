/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

/**
 *
 * @author S1PC1
 */
public class Coche {

    //Declaracion de variables con encapsulamiento
    private int ruedas;
    private String Color;
    private int pesoPlataforma;
    private int pesoTotal;
    private boolean asientosCuero, climaticador;

    // Constructor por defecto
    public Coche() {//Esta vacio sin parametros
        Color="Gris Basico";
        pesoTotal=1800;
        ruedas=4;
    }

    //Constructor sobrecargado por que admite valores por el usuario

    public Coche(int ruedas, String Color, boolean asientosCuero) {
        this.ruedas = ruedas;
        this.Color = Color;
        this.asientosCuero = asientosCuero;
    }

    //Metodos de Acceso
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPesoPlataforma() {
        return pesoPlataforma;
    }

    public void setPesoPlataforma(int pesoPlataforma) {
        this.pesoPlataforma = pesoPlataforma;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public boolean isAsientosCuero() {
        return asientosCuero;
    }

    public void setAsientosCuero(boolean asientosCuero) {
        this.asientosCuero = asientosCuero;
    }

    public boolean isClimaticador() {
        return climaticador;
    }

    public void setClimaticador(boolean climaticador) {
        this.climaticador = climaticador;
    }

    //Metodo de Uso General
    public int preciCoche() {

        int precio_final = 100000;
        if (asientosCuero == true) {//Si el coche tiene asiento de cuero se eleva el precio
            precio_final += 3500;
        }
        if (climaticador == true) {// si el coche tiene climatizador se eleva el precio
            precio_final += +4500;
        }

        return precio_final;
    }

      //Configuracion de coche  
    public void configura_asientos(String asientos_cuero) {//setter
        //nombre del arugumentos es igual al de la variable

        /*Compara la cadena de texto contra un objeto ignorando mayúsculas y minúsculas. 
         * Devolverá true si las cadenas comparadas son iguales. En caso contrario devolverá false.
         */
        if (asientos_cuero.equalsIgnoreCase("si")) {

            this.asientosCuero = true;//le asigna un valor true a la variable asientosCuero
        } else {
            this.asientosCuero = false;
        }

    }
    
    public  String DatosCoche(){
        return "\n Color :"+Color+"\n PesoTotal: "+pesoTotal+"\n Ruedas:"+ruedas;
        
    }
    

}
