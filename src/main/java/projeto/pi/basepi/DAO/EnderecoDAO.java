/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.pi.basepi.MODELS.Cliente;
import projeto.pi.basepi.MODELS.Endereco;

/**
 *
 * @author dudu2
 */
public class EnderecoDAO {

    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "Ags0316289";

    public static boolean salvar(Endereco obj) {
        PreparedStatement comandoSql = null;
        boolean retorno = false;
        Connection conexao = null;
        ResultSet rs = null;

        try {
            //Psso1
            Class.forName("com.mysql.cj.jdbc.Driver");

            try {
                //Passo 2- Abrindo a conexão
                conexao = DriverManager.getConnection(url, login, senha);

                //Passo 3 - Preprar o comando
                comandoSql = conexao.prepareStatement("insert into endereco (cep,logradouro,numero,complemento,bairro,cidade,uf) values(?,?,?,?,?,?,?)",
                        PreparedStatement.RETURN_GENERATED_KEYS
                );

                comandoSql.setString(1, obj.getCep());
                comandoSql.setString(2, obj.getLogradouro());
                comandoSql.setString(3, obj.getNumero());
                comandoSql.setString(4, obj.getComplemento());
                comandoSql.setString(5, obj.getBairro());
                comandoSql.setString(6, obj.getCidade());
                comandoSql.setString(7, obj.getUf());

                int linhasAfetdas = comandoSql.executeUpdate();

                if (linhasAfetdas > 0) {

                    rs = comandoSql.getGeneratedKeys();

                    if (rs != null) {
                        while (rs.next()) {

                            int idGerado = rs.getInt(1);
                            obj.setIdEndereco(idGerado);
                        }

                    }

                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {

                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }
    
      public static boolean alterar(Endereco obj) {
        PreparedStatement comandoSql = null;
        boolean retorno = false;
        Connection conexao = null;
        ResultSet rs = null;
                        

        try {
            //Psso1
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            try {
                //Passo 2- Abrindo a conexão
                conexao = DriverManager.getConnection(url, login, senha);
                
                //Passo 3 - Preprar o comando
                comandoSql = conexao.prepareStatement ( ""); 
         
                comandoSql.setString(1, obj.getCep());
                comandoSql.setString(2, obj.getLogradouro());
                comandoSql.setString(3, obj.getNumero());
                comandoSql.setString(3, obj.getComplemento());
                comandoSql.setString(3, obj.getBairro());
                comandoSql.setString(3, obj.getCidade());
                comandoSql.setString(3, obj.getUf());

                

                  
               int linhasAfetdas =    comandoSql.executeUpdate();
                
                if (linhasAfetdas > 0){
                    
                    
                    rs = comandoSql.getGeneratedKeys();
                    
                    if(rs != null ){
                    while(rs.next()){
                    
                            int idGerado = rs.getInt(1);
                            obj.setIdEndereco(idGerado);
                    }
                        
                    }
                
                return true;
                }

                
            } catch (SQLException ex) {
                Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
                
            if(conexao != null){
                    
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;

    }
      
      public static ArrayList<Endereco> Detalhes(int cod){
        
        
        Connection conexao = null;
        PreparedStatement comandoSql= null;
        ResultSet rs = null;
        ArrayList<Endereco> lista = new ArrayList<Endereco>();
        
        try {
         

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            conexao = DriverManager.getConnection(url,login,senha);
            
           
            
            comandoSql = conexao.prepareStatement("select * from endereco where idEndereco = ?;");
            
            comandoSql.setInt(1, cod);
            
            rs = comandoSql.executeQuery();
            
            if( rs!= null ){
            
                    while(rs.next()){
                    int id = rs.getInt("idEndereco");
                    String cep = rs.getString("cep");
                    String logradouro = rs.getString("logradouro");
                    String numero = rs.getString("numero");
                    String complemento = rs.getString("complemento");
                    String bairro = rs.getString("bairro");
                    String cidade = rs.getString("cidade");
                    String uf = rs.getString("uf");

                        
                    Endereco item = new Endereco(id, cep, logradouro, numero, complemento, bairro, cidade, uf);
                        lista.add(item);
                        
                    }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                
            if(conexao != null){
                    
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        return lista;
    }

}


