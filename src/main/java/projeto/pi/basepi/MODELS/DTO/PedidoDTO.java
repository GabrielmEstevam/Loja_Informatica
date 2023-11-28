/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.MODELS.DTO;

import java.sql.Date;

/**
 * Classe para listar pedidos na view Base aba pedidos
 * @author athyla
 * @since 04/11/2023
 */
public class PedidoDTO {
    private int cod;
    private String cliente;
    private String cpf;
    private double valor;
    private Date dt_pedido;

    public PedidoDTO() {
    }
    
    
    
    public PedidoDTO(int cod, String cliente, String cpf, double valor, Date dt_pedido) {
        this.cod = cod;
        this.cliente = cliente;
        this.cpf = cpf;
        this.valor = valor;
        this.dt_pedido = dt_pedido;
    }
    
    public PedidoDTO(int cod, String cliente, double valor, Date dt_pedido) {
        this.cod = cod;
        this.cliente = cliente;
        this.valor = valor;
        this.dt_pedido = dt_pedido;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDt_pedido() {
        return dt_pedido;
    }

    public void setDt_pedido(Date dt_pedido) {
        this.dt_pedido = dt_pedido;
    }
    
    
}
