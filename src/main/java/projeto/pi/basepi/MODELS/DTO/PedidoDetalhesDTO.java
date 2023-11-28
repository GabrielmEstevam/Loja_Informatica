/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.MODELS.DTO;

import java.sql.Date;

/**
 *
 * @author athyla
 */
public class PedidoDetalhesDTO {
    private int cod;
    private Date dtPedido;
    private double total;
    private String marca;
    private int idProduto;
    private String produto;
    private int qtd;
    private double preco;
    private String vendedor;
    private String cliente;
    private String clienteCpf;

    public PedidoDetalhesDTO() {
    }

    public PedidoDetalhesDTO(int cod, Date dtPedido, double total, String marca, int idProduto, String produto, int qtd, double preco, String vendedor, String cliente, String clienteCpf) {
        this.cod = cod;
        this.dtPedido = dtPedido;
        this.total = total;
        this.marca = marca;
        this.idProduto = idProduto;
        this.produto = produto;
        this.qtd = qtd;
        this.preco = preco;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.clienteCpf = clienteCpf;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

   

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }
    
    
    
    
}
