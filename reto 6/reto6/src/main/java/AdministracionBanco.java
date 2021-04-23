
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdministracionBanco {
    private String nombreBanco;
    private String nitBanco;
    private String direccion;
    private ArrayList<CuentaAhorro> cuentaAhorro;
    private ArrayList<RegistroHistorial> registroTransaccion;
     
public AdministracionBanco(){

    this.nombreBanco = "Banco San Vicente";
    this.nitBanco = "888902892000";
    this.direccion = "Cra 70 # 56-21";
    this.cuentaAhorro = new ArrayList<CuentaAhorro>();
    this.registroTransaccion = new ArrayList<RegistroHistorial>();

}

 public void  verSaldo()throws ExcepcionUsuarioNoExistente{
     yes :
     while(0==0){
         try{
             
         
  String id;
  boolean k = false;
  
    
  id = JOptionPane.showInputDialog("Ingrese numero de cuenta a la que le desea ver el saldo:");
  long identificacion = Long.parseLong(id);  
    
    
        for (int i = 0; i < cuentaAhorro.size(); i++) {
            long h =0;
            h = cuentaAhorro.get(i).getIdentificadorCuenta();
            if(identificacion == h ){
               System.out.println("EL Saldo Disponible es :" + cuentaAhorro.get(i).getSaldoDisponible()); 
               JOptionPane.showMessageDialog(null,"EL Saldo Disponible: "+ cuentaAhorro.get(i).getSaldoDisponible());
               k=true;
               break yes;
            }
            
         }   
        if (k==false){
             throw new ExcepcionUsuarioNoExistente();
        }
         
         }
         catch (ExcepcionUsuarioNoExistente a) {
             
         }
    
    
  }
    
}


public void registrarCuenta(){
    CuentaAhorro cuenta = new CuentaAhorro(); 
        while (0==0){String id = JOptionPane.showInputDialog("Numero de cuenta a registrar: ");
        long identificacion = Long.parseLong(id);
        cuenta.setIdentificadorCuenta(identificacion); 
            if (identificacion<1000000000 ){
                JOptionPane.showMessageDialog(null,"El numero debe ser minimo de 10 digitos");
        }else{
                 
                break;
            }
        }
        String pais = JOptionPane.showInputDialog("Ingresa Nombre del pais del operador: ");
        String tipoDoc = JOptionPane.showInputDialog("tipo de documento: (CC/PASAPORTE: ");
        
            
        String numeroid = JOptionPane.showInputDialog("Ingrese numero de documento: ");
        String saldo=JOptionPane.showInputDialog("Ingrese saldo inicial");
        double sald = Double.parseDouble(saldo);
        
        String fullNameTitular = JOptionPane.showInputDialog("Digite su nombre completo :");
        String maxtransacc = JOptionPane.showInputDialog("Ingrese el maximo de transacciones diarias");
        int maxtran = Integer.parseInt(maxtransacc);
        maxtran=maxtran-1;
        String montoMax = JOptionPane.showInputDialog("Monto maximo por transaccion: ");
        double montoMaxPorTransaccion = Double.parseDouble(montoMax);
               
               
        cuenta.setPais(pais);
        cuenta.setTipoDoc(tipoDoc);
        cuenta.setFullNameTitular(fullNameTitular);
        cuenta.setMontoMaximoPorTransaccion(montoMaxPorTransaccion);
        cuenta.setSaldoDisponible(sald);
        cuenta.setMaxTransacciones(maxtran);
        cuenta.setNumeroid(numeroid);
        agregarCuenta(cuenta);
        
            
 }
public void realizarRetiro()throws ExcepcionSuperaTransacciones,ExcepcionSuperaMontoMax,ExcepcionTransaccionNegativa,ExcepcionSaldoinsuficiente,ExcepcionUsuarioNoExistente{
 yes:
    while (0==0){
    try {
     boolean k=false;
    String id = JOptionPane.showInputDialog("Ingrese numero de cuenta de retiro:");
    long identificacion= Long.parseLong(id);
    for (int i = 0; i < cuentaAhorro.size(); i++) {
        int contador =cuentaAhorro.get(i).getContadorTransacciones();
        if (identificacion==cuentaAhorro.get(i).getIdentificadorCuenta()){
            k=true;
        
            if(contador <= cuentaAhorro.get(i).getMaxTransacciones()){
                String pais = cuentaAhorro.get(i).getPais();
                String tipoTran = ("Retiro");
                String fecha = JOptionPane.showInputDialog("Ingrese fecha");
                
                String retiro = JOptionPane.showInputDialog("Ingrese cuanto desea retirar :");
                Double retir = Double.parseDouble(retiro);
                if (retir>0){
                    
                    
                            
                            
                    if (retir<=cuentaAhorro.get(i).getMontoMaximoPorTransaccion()){
                    
                
                        if (retir<=cuentaAhorro.get(i).getSaldoDisponible()){
                            RegistroHistorial registro = new RegistroHistorial();
                            registro.setIdentificadorCuenta(identificacion);
                            registro.setDepositoTran(retir);
                            registro.setTipoTransaccion(tipoTran);
                            registro.setPais(pais);
                            registro.setFecha(fecha);
                            agregarCuent(registro);
                             retir=cuentaAhorro.get(i).getSaldoDisponible()-retir;
                            cuentaAhorro.get(i).setSaldoDisponible(retir);
                            contador = contador +1;
                            cuentaAhorro.get(i).setContadorTransacciones(contador);
                             break yes;
                
                        }
                        else{
                            throw new ExcepcionSaldoinsuficiente();
                    
                        }
        
                    }
                    else{ 
                        throw new ExcepcionSuperaMontoMax() ;
                        }
            
              }  
                else {
                     throw new ExcepcionTransaccionNegativa();
                }
            
           
            }
            else{
                throw new ExcepcionSuperaTransacciones();
            }
    }
            
    }
    if (k==false){
        throw new ExcepcionUsuarioNoExistente();
    }
    }
catch (ExcepcionSuperaTransacciones a){
        
    }
 catch(ExcepcionSuperaMontoMax a){
        
    }
 catch (ExcepcionTransaccionNegativa a){
            
        }
 catch (ExcepcionUsuarioNoExistente a){
        
    }
 catch (ExcepcionSaldoinsuficiente a){
     
 }
}
}

public  void realizarDeposito()throws ExcepcionSuperaTransacciones,ExcepcionSuperaMontoMax,ExcepcionTransaccionNegativa,ExcepcionUsuarioNoExistente {  
    yes:
    while (0==0){
    try{
    
     
    
    String id = JOptionPane.showInputDialog("Ingrese numero de cuenta de deposito:");
    long identificacion = Long.parseLong(id);
    boolean k = false;
    
  
    
        for (int i = 0; i < cuentaAhorro.size(); i++) {
            int contador =cuentaAhorro.get(i).getContadorTransacciones();
            if(identificacion == cuentaAhorro.get(i).getIdentificadorCuenta()) {
                k=true;
            
                if(contador <= cuentaAhorro.get(i).getMaxTransacciones()){                    
                    String pais = cuentaAhorro.get(i).getPais();
                    String tipoTran = ("Deposito");
                    String fecha = JOptionPane.showInputDialog("Ingrese fecha");
                    String monto = JOptionPane.showInputDialog("Ingrese el monto del deposito :");
                    double montoDeposito= Double.parseDouble(monto);
                    if (montoDeposito>0){
                        
                    
                    if (montoDeposito> cuentaAhorro.get(i).getMontoMaximoPorTransaccion()){
                       
                       throw new ExcepcionSuperaMontoMax() ;
                    }
                    else{
                        RegistroHistorial registro = new RegistroHistorial();
                        
                        
                        registro.setIdentificadorCuenta(identificacion);
                        registro.setDepositoTran(montoDeposito);
                        registro.setTipoTransaccion(tipoTran);
                        registro.setPais(pais);
                        registro.setFecha(fecha);
                        agregarCuent(registro);
                        
                        montoDeposito = cuentaAhorro.get(i).getSaldoDisponible() + montoDeposito;
                        cuentaAhorro.get(i).setSaldoDisponible(montoDeposito);
                        contador = contador +1;
                        cuentaAhorro.get(i).setContadorTransacciones(contador);

                        
                        break yes;
                       

                                      
                        
                        
                        
                        
                            
                      
                      }  
                        
                    }
                    else{
                        throw new ExcepcionTransaccionNegativa();
                    }
                }
                else{
                  throw new ExcepcionSuperaTransacciones();

                }
            }
            else{
              
            }
    
    
            
          }  
        if (k==false){
            throw new ExcepcionUsuarioNoExistente();
        }
    
    
        
    }
    
        
    catch (ExcepcionSuperaTransacciones a){
        
    }
    catch(ExcepcionSuperaMontoMax a){
        
    }
      catch (ExcepcionTransaccionNegativa a){
            
        }
     
    catch (ExcepcionUsuarioNoExistente a){
        
    }
    
     }  

}

public void mostrarRegistro(){
    for (int i = 0; i < registroTransaccion.size(); i++) {
        
        JOptionPane.showMessageDialog(null,"Cuenta a la que se realizó la transaccion " +(i+1)+":");
        JOptionPane.showMessageDialog(null,"numero de cuenta : "+registroTransaccion.get(i).getIdentificadorCuenta());
        JOptionPane.showMessageDialog(null,"Cantidad : " + registroTransaccion.get(i).getDepositoTran());
        JOptionPane.showMessageDialog(null,"El pais de la cuenta es : "+ registroTransaccion.get(i).getPais());
        JOptionPane.showMessageDialog(null,"Fecha de transaccion: "+registroTransaccion.get(i).getFecha());
        JOptionPane.showMessageDialog(null,"Tipo de transaccion "+registroTransaccion.get(i).getTipoTransaccion());
    }


}
public void agregarCuent(RegistroHistorial registro){
    this.registroTransaccion.add(registro);
    


}


public void agregarCuenta(CuentaAhorro cuenta){
    this.cuentaAhorro.add(cuenta);
    


}

public void eliminarCuenta(long eliminar){
    
    for (int i = 0; i < cuentaAhorro.size(); i++) {
        if(cuentaAhorro.get(i).getIdentificadorCuenta()== eliminar){
            cuentaAhorro.remove(i);
        
        }
    }


}



public void mostrarCuentas(){
    for (int i = 0; i < cuentaAhorro.size(); i++) {
        JOptionPane.showMessageDialog(null,"Cuenta " +(i+1)+":");
        JOptionPane.showMessageDialog(null,"El nombre del titular es : "+cuentaAhorro.get(i).getFullNameTitular());
        JOptionPane.showMessageDialog(null,"El numero de cuenta es: " +cuentaAhorro.get(i).getIdentificadorCuenta());
        JOptionPane.showMessageDialog(null,"El pais de la cuenta es : "+ cuentaAhorro.get(i).getPais());
        JOptionPane.showMessageDialog(null,"Saldo Disponible: "+cuentaAhorro.get(i).getSaldoDisponible());
        JOptionPane.showMessageDialog(null,"El monto maximo por transacción es: "+cuentaAhorro.get(i).getMontoMaximoPorTransaccion());
        JOptionPane.showMessageDialog(null,"El numero de documento es: "+cuentaAhorro.get(i).getNumeroid());
        JOptionPane.showMessageDialog(null,"El numero maximo de transacciones es"+cuentaAhorro.get(i).getMaxTransacciones());
    }


}


    public ArrayList<CuentaAhorro> getCuentaAhorro() {
        return cuentaAhorro;
    }

    public ArrayList<RegistroHistorial> getRegistroTransaccion() {
        return registroTransaccion;
    }

    public void setRegistroTransaccion(ArrayList<RegistroHistorial> registroTransaccion) {
        this.registroTransaccion = registroTransaccion;
    }

    public void setCuentaAhorro(ArrayList<CuentaAhorro> cuentaAhorro) {
        this.cuentaAhorro = cuentaAhorro;
    }

    public  class  ExcepcionUsuarioNoExistente extends Exception {
        
        public ExcepcionUsuarioNoExistente(){
            JOptionPane.showMessageDialog(null,"Usuario no existente");
        }
}
    public class  ExcepcionSaldoinsuficiente extends Exception {
        
        public ExcepcionSaldoinsuficiente(){
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
        }
}
    public class ExcepcionTransaccionNegativa extends Exception {
        
        public ExcepcionTransaccionNegativa(){
            JOptionPane.showMessageDialog(null,"El valor ingresado es negativo");
        }
}
public class ExcepcionSuperaMontoMax extends Exception {
        
        public ExcepcionSuperaMontoMax(){
            JOptionPane.showMessageDialog(null,"El valor supera el monto máximo");
        }
}
public class ExcepcionSuperaTransacciones extends Exception {
        
        public ExcepcionSuperaTransacciones(){
            JOptionPane.showMessageDialog(null,"Ha superado el número limite de transacciones diarias");
        }
}
}