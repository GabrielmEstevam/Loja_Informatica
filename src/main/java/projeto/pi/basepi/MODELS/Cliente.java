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
public class Cliente {
    private int idCliente;
     private String nome;
     private String email;
     private String CPF;
     private Date dataNascimento;
     private String genero;
     private String telefone;
     private int idEndereco;

    public Cliente(int idCliente, String nome, String email, String CPF, Date dataNascimento, String genero, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.telefone = telefone;
    }

    public Cliente(int idCliente, String nome, String email, String CPF, Date dataNascimento, String genero, String telefone, int idEndereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.telefone = telefone;
        this.idEndereco = idEndereco;
    }
     
     
     
     

    public Cliente(int idCliente, String nome, String email, String CPF, Date dataNascimento, String genero) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    
    
    public Cliente( String nome, String email, String CPF, Date dataNascimento, String genero , String telefone) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.telefone = telefone;
    }
    
     public Cliente( String nome, String email, String CPF, String telefone) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.telefone = telefone;
    }



    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    
    

    
    
    
    
    
}
