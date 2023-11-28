/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.MODELS;

/**
 *
 * @author rodri
 */
public class ItemPedido {
   private  int idProdutoPedido;
    private int idPedido;
    private int idProduto;
    private int qntd;
    private double preco;

    public ItemPedido() {
    }

    public ItemPedido(int idProdutoPedido, int idPedido, int idProduto, int qntd, double preco) {
        this.idProdutoPedido = idProdutoPedido;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.qntd = qntd;
        this.preco = preco;
    }
    
    
    

    public int getIdProdutoPedido() {
        return idProdutoPedido;
    }

    public void setIdProdutoPedido(int idProdutoPedido) {
        this.idProdutoPedido = idProdutoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
    
}
