/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.MODELS;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rodri
 */
public class Pedido {
     private int idPedido;
     private int idVendedor;
     private int idCliente;
     private Date dataPedido;
     private double total;
     private ArrayList<ItemPedido> listaItens = null;

    public Pedido() {
    }

      
    
      
    public Pedido(int idPedido, int idVendedor, int idCliente) {
        this.idPedido = idPedido;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
    }
     
     

    public Pedido(int idPedido, int idVendedor, int idCliente,Date dataPedido, double total) {
        this.idPedido = idPedido;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.dataPedido = dataPedido;
        this.total = total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }
    
    
    
    
    
}
