/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.MODELS;

import java.util.Date;

/**
 *
 * @author rodri
 */
public class Vendedor {

    private int idVendedor;
    private String nome;
    private Date dataNascimento;
    private String email;
    private String sexo;
    private String senha;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Vendedor() {
    }
    
    

    public Vendedor(int idVendedor, String nome, Date dataNascimento, String email, String sexo) {
        this.idVendedor = idVendedor;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.sexo = sexo;
    }

    public Vendedor(String nome, Date dataNascimento, String email, String sexo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.sexo = sexo;
    }

    public Vendedor(int idVendedor, String nome, Date dataNascimento, String email, String sexo, String senha) {
        this.idVendedor = idVendedor;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.sexo = sexo;
        this.senha = senha;
    }
    
    

    public Vendedor(String nome, Date dataNascimento, String email, String sexo, String senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.sexo = sexo;
        this.senha = senha;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
