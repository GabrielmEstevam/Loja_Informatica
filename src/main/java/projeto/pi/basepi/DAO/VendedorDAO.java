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
import static projeto.pi.basepi.DAO.PedidoDAO.login;
import static projeto.pi.basepi.DAO.PedidoDAO.senha;
import static projeto.pi.basepi.DAO.PedidoDAO.url;
import projeto.pi.basepi.MODELS.DTO.PedidoDTO;
import projeto.pi.basepi.MODELS.Endereco;
import projeto.pi.basepi.MODELS.Vendedor;

/**
 *
 * @author dudu2
 */
public class VendedorDAO {

    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "Ags0316289";
    
    public static ArrayList<Vendedor> listar(){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Vendedor> lista = new ArrayList<Vendedor>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select * from vendedor order by nome;");

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int id = rs.getInt("idVendedor");
                    String nome = rs.getString("nome");
                    Date nascimento = rs.getDate("dt_Nascimento");
                    String email = rs.getString("email");
                    String sexo = rs.getString("sexo");
                    
                    //Passei os dados do rs para um objeto
                    Vendedor item = new Vendedor(id,nome, nascimento, email, sexo);
                    
                    
                    lista.add(item);
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        
        return lista;
        
        
    }// Fim do listar
    
    public static ArrayList<Vendedor> listarPorNome(String vendedorNome){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Vendedor> lista = new ArrayList<Vendedor>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select * from vendedor where nome like ? order by nome;");
            comandoSQL.setString(1, "%"+vendedorNome+"%");

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int id = rs.getInt("idVendedor");
                    String nome = rs.getString("nome");
                    Date nascimento = rs.getDate("dt_Nascimento");
                    String email = rs.getString("email");
                    String sexo = rs.getString("sexo");
                    
                    //Passei os dados do rs para um objeto
                    Vendedor item = new Vendedor(id,nome, nascimento, email, sexo);
                    
                    
                    lista.add(item);
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        
        return lista;
        
        
    }// Fim do listar
    
    public static ArrayList<Vendedor> listarPorSexo(String vendedorSexo){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Vendedor> lista = new ArrayList<Vendedor>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select * from vendedor where sexo like ? order by nome;");
            comandoSQL.setString(1, vendedorSexo);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int id = rs.getInt("idVendedor");
                    String nome = rs.getString("nome");
                    Date nascimento = rs.getDate("dt_Nascimento");
                    String email = rs.getString("email");
                    String sexo = rs.getString("sexo");
                    
                    //Passei os dados do rs para um objeto
                    Vendedor item = new Vendedor(id,nome, nascimento, email, sexo);
                    
                    
                    lista.add(item);
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        
        return lista;
        
        
    }// Fim do listar
    
    public static boolean salvar(Vendedor vendedor) {
        PreparedStatement comandoSql = null;
        boolean retorno = false;
        Connection conexao = null;
        ResultSet rs = null;

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            try {
             
                conexao = DriverManager.getConnection(url, login, senha);
                
                
              
                comandoSql = conexao.prepareStatement("insert into vendedor(nome,dt_Nascimento,email,sexo,senha) " +
                            "values(?, ?, ?, ?, ?);",
                        PreparedStatement.RETURN_GENERATED_KEYS
                );
                
                comandoSql.setString(1, vendedor.getNome());
                comandoSql.setDate(2, (Date) vendedor.getDataNascimento());
                comandoSql.setString(3, vendedor.getEmail());
                comandoSql.setString(4, vendedor.getSexo());
                comandoSql.setString(5, vendedor.getSenha());

                int linhasAfetdas = comandoSql.executeUpdate();

                if (linhasAfetdas > 0) {

                    rs = comandoSql.getGeneratedKeys();

                    if (rs != null) {
                        while (rs.next()) {

                            int idGerado = rs.getInt(1);
                            vendedor.setIdVendedor(idGerado);
                        }

                    }

                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {

                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }
    
    public static boolean alterar(Vendedor vendedor){
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            //Receita de bolo JDBC
            //Passo 1 - Identificar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2  - Abrir conexao com o banco
            conexao = DriverManager.getConnection(url,
                    login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement(
                    "UPDATE vendedor SET nome = ?, dt_nascimento = ?, email = ?, sexo = ?, senha = ?  WHERE idVendedor = ? "  );
            
            comandoSQL.setString(1, vendedor.getNome());
            comandoSQL.setDate(2, (Date) vendedor.getDataNascimento());
            comandoSQL.setString(3, vendedor.getEmail());
            comandoSQL.setString(4, vendedor.getSexo());          
            comandoSQL.setString(5, vendedor.getSenha());
            comandoSQL.setInt(6, vendedor.getIdVendedor());
            //Passo 4 - Finalmente... Executamos o comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();

            if(linhasAfetadas > 0){
                
                retorno = true;
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return retorno;
    } // Fim do Alterar

    public static boolean excluir(int idExcluir){
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            //Receita de bolo JDBC
            //Passo 1 - Identificar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2  - Abrir conexao com o banco
            conexao = DriverManager.getConnection(url,
                    login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement(
            "DELETE FROM vendedor WHERE idVendedor = ?"  );
            
            comandoSQL.setInt(1, idExcluir);
            
            //Passo 4 - Finalmente... Executamos o comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas > 0){
                
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return retorno;
    }
    
    
   
   
    public static ArrayList<Vendedor> VerificarLogin(String vendedorEmail, String vendedorSenha){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Vendedor> lista = new ArrayList<Vendedor>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select * from vendedor where email like ? and senha = ?;");
            comandoSQL.setString(1, vendedorEmail);
            comandoSQL.setString(2, vendedorSenha);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int id = rs.getInt("idVendedor");
                    String nome = rs.getString("nome");
                    Date nascimento = rs.getDate("dt_Nascimento");
                    String email = rs.getString("email");
                    String sexo = rs.getString("sexo");
                    
                    //Passei os dados do rs para um objeto
                    Vendedor item = new Vendedor(id,nome, nascimento, email, sexo);
                    
                    
                    lista.add(item);
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        
        return lista;
        
        
    }// Fim do Verificar Login
    
    
   
}
