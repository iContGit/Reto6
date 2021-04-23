/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class RegistroHistorial {
    private String fecha;
    private String tipoTransaccion;
    private long identificadorCuenta;
    private double DepositoTran;
    private String Pais;
public RegistroHistorial(){
    this.fecha = "";
    this.tipoTransaccion="";
    this.identificadorCuenta=0;
    this.DepositoTran=0;
    this.Pais="";
}

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public long getIdentificadorCuenta() {
        return identificadorCuenta;
    }

    public void setIdentificadorCuenta(long identificadorCuenta) {
        this.identificadorCuenta = identificadorCuenta;
    }

    public double getDepositoTran() {
        return DepositoTran;
    }

    public void setDepositoTran(double DepositoTran) {
        this.DepositoTran = DepositoTran;
    }

}