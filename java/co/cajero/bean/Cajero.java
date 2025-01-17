package co.cajero.bean;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author BELSOFT
 */
public class Cajero implements Serializable{

    private List<Cliente> clientes=new LinkedList<>();
    
    /**
     * 
     * @param documento
     * @param contrasena
     * @return El cliente que corresponde a un usuario y contrasena determinado
     */
    public Cliente login(String documento, String contrasena){
        Cliente clienteLogueado=null;
        for(Cliente cliente: clientes){
            if (cliente.getNumeroDeCedula().equals(documento)){
                if (contrasena.equals(cliente.getContrasena())){
                    clienteLogueado=cliente;
                }
                break;
            }
        }
        return clienteLogueado;
    }
    
    /**
     * 
     * @param cliente
     * @param retiro
     * @return Verdadero si se pudo retirar un monto de la cuenta del cliente
     */
    public boolean retirar(Cliente cliente, float retiro){
        boolean sw=false;
        if (cliente.getSaldo()>=retiro){
            cliente.setSaldo(cliente.getSaldo()-retiro);
            sw=true;
        }
        return sw;
    }
    
    /**
     * 
     * @param cliente
     * @return El saldo de un Cliente
     */
    public float consultarSaldo(Cliente cliente){
        return cliente.getSaldo();
    }
    
    /**
     * 
     * @param cliente
     * @param dinero
     * @return El saldo actual del cliente, es decir el resultado de haber
     * consignado un monto de dinero
     */
    public float depositarDinero(Cliente cliente, float dinero){
        cliente.setSaldo(cliente.getSaldo()+dinero);
        return cliente.getSaldo();
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    
}
