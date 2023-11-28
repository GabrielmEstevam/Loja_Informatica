/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.MODELS;

/**
 *
 * @author rodri
 */
public class Produto {
   private  int idProduto;
   private  int marca;
   private  String nome;
   private  int qntd;
   private  double preco;
   private  String descricao;
   private String nomeMarca;

    public Produto(int idProduto, String nome, int qntd, double preco, String descricao, String nomeMarca) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.qntd = qntd;
        this.preco = preco;
        this.descricao = descricao;
        this.nomeMarca = nomeMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Produto(int idProduto, int marca, String nome, int qntd, double preco, String descricao) {
        this.idProduto = idProduto;
        this.marca = marca;
        this.nome = nome;
        this.qntd = qntd;
        this.preco = preco;
        this.descricao = descricao;
    }
    
    
    public Produto(int idProduto, int marca, String nome,  String descricao,  double preco, int qntd) {
        this.idProduto = idProduto;
        this.marca = marca;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qntd = qntd;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto(int marca, String nome, int qntd, double preco, String descricao) {
        this.marca = marca;
        this.nome = nome;
        this.qntd = qntd;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Produto() {
    }

  
}
