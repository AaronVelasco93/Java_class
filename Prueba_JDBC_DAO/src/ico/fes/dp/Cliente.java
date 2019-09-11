/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dp;

/**
 *
 * @author jeshc
 */
public class Cliente {
    private String codigo;
    private String empresa;
    private String direccion;
    private String poblacion;
    private int telefono;
    private String responsable;
    private String historial;

    public Cliente() {
    }

    public Cliente(String codigo, String empresa, String direccion, String poblacion, int telefono, String responsable, String historial) {
        this.codigo = codigo;
        this.empresa = empresa;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.telefono = telefono;
        this.responsable = responsable;
        this.historial = historial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
    
    
    
}
