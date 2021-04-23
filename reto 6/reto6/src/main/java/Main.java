/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Scanner;
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) throws AdministracionBanco.ExcepcionSuperaTransacciones, AdministracionBanco.ExcepcionSuperaMontoMax, AdministracionBanco.ExcepcionTransaccionNegativa, AdministracionBanco.ExcepcionUsuarioNoExistente, AdministracionBanco.ExcepcionSaldoinsuficiente {
        
        
        int h=0;
        int select = -1;
        AdministracionBanco obj1 = new AdministracionBanco() {};
        while(select != 0){
			
			try{
				String lectura = JOptionPane.showInputDialog(null,"********\nElige opción:\n1.- Banquero" +
						"\n2.- Usuario\n" +
						
						"0.- Salir\n**********");
				
				select = Integer.parseInt(lectura); 
		
				
                                s1:
				switch(select){
                                    case 1: 
                                        int select2 = -1;
                                        while(select2 != 0){
			
			try{
                                 
				String lectur = JOptionPane.showInputDialog(null,"********\nElige opción:\n1.- Agregar cuenta" +
						"\n2.- Eliminar cuenta\n" +"\n3.- Mostrar cuentas\n"+"\n4.- Mostrar registro\n" +
						
						"0.- Salir\n**********");
				
				select2 = Integer.parseInt(lectur); 
		
                                s2:
				switch(select2){
                                   
				case 1: 
                                    
                                    int m=20;
                                    
                                    sw:
                                    while (m!=0){
                                     String lec=JOptionPane.showInputDialog(null,"Escriba 1 si desea agregar una cuenta o 0 si desea salir");
                                    m=Integer.parseInt(lec);   
                                    
                                    if (m!=0){
                                        
                                    
                                    
                                        JOptionPane.showMessageDialog(null,"Ingresar cuenta " + (++h) +": ");
                                            obj1.registrarCuenta();
            
             }else{
                        break sw;              
                                    }
		}			
                                        
					
					
					
					break ;
                                        
				case 2: 
                                    Long eli;
                                    String el=JOptionPane.showInputDialog(null,"Ingrese numero de cuenta que desea eliminar");
                                    eli=Long.parseLong(el);
                                    obj1.eliminarCuenta(eli);
                                    
					
					
					
					break ;
                                case 3:
                                    obj1.mostrarCuentas();
                                    
                                    break ;
                                case 4:
                                    obj1.mostrarRegistro();
                                    
                                    break ;
				
				case 0: 
					
					break ;
				default:
					JOptionPane.showMessageDialog(null,"Número no reconocido");break;
				}
					
				
					
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}
                                        
					
					
					
					break s1;
				
                                    
                                    case 2: 
                                        int select3=-1;
                                        while(select3 != 0){
			
			try{
				String lectur = JOptionPane.showInputDialog(null,"********\nElige opción:\n1.- Ver saldo" +
						"\n2.- Realizar deposito\n" +"\n3.- Retirar\n"+
						
						"0.- Salir\n**********");
				
				select3 = Integer.parseInt(lectur); 
		
                                s3:
				switch(select3){
				case 1: 
                                    obj1.verSaldo();
					
                                        
					
					
					
					break ;
				case 2: 
					obj1.realizarDeposito();
					
					
					break ;
                                case 3:
                                    obj1.realizarRetiro();
                                    break ;
				
				case 0: 
					
                                        break ;
					
				default:
					JOptionPane.showMessageDialog(null,"Número no reconocido");break;
				}
					
				
					
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}
					
                                        
					
					
					
					break s1 ;
				
				
				case 0: 
					JOptionPane.showMessageDialog(null,"Adios!");
					break s1 ;
				default:
					JOptionPane.showMessageDialog(null,"Número no reconocido");break s1;
				}
					
				
					
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}
	
        
        
        
        
        
        
                
  
        
        

       
        
        
        
    }    
}
