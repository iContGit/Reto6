/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class CuentaAhorro {
    private int maxTransacciones;
    private int contadorTransacciones;
    private long identificadorCuenta;
    private String pais;
    private String tipoDoc;
    private String fullNameTitular;
    private double SaldoDisponible;
    private double montoMaximoPorTransaccion;
    private double montoTransaccion;
    private String numeroid;
    
    
    



    
public CuentaAhorro(){
    this.maxTransacciones =0;
    this.contadorTransacciones=0;
    this.identificadorCuenta=0;
    this.pais="";
    this.tipoDoc="";
    this.fullNameTitular ="";
    this.SaldoDisponible=200000;
    this.montoMaximoPorTransaccion =0.0;
    this.numeroid="";
    this.montoTransaccion =0.0;
    
    
   
}
      


    public int getContadorTransacciones() {
        return contadorTransacciones;
    }

    public void setContadorTransacciones(int contadorTransacciones) {
        this.contadorTransacciones = contadorTransacciones;
    }

    public long getIdentificadorCuenta() {
        return identificadorCuenta;
    }

    public void setIdentificadorCuenta(long identificadorCuenta) {
        this.identificadorCuenta = identificadorCuenta;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumeroid() {
        return numeroid;
    }

    public void setNumeroid(String numeroid) {
        this.numeroid = numeroid;
    }

    public String getFullNameTitular() {
        return fullNameTitular;
    }

    public void setFullNameTitular(String fullNameTitular) {
        this.fullNameTitular = fullNameTitular;
    }

    public double getSaldoDisponible() {
        return SaldoDisponible;
    }

    public void setSaldoDisponible(double SaldoDisponible) {
        this.SaldoDisponible = SaldoDisponible;
    }

    public double getMontoMaximoPorTransaccion() {
        return montoMaximoPorTransaccion;
    }

    public void setMontoMaximoPorTransaccion(double montoMaximoPorTransaccion) {
        this.montoMaximoPorTransaccion = montoMaximoPorTransaccion;
    }

    public int getMaxTransacciones() {
        return maxTransacciones;
    }

    public void setMaxTransacciones(int maxTransacciones) {
        this.maxTransacciones = maxTransacciones;
    }

    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    

    
    
    
    
}

