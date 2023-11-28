package projeto.pi.basepi.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static projeto.pi.basepi.DAO.PedidoDAO.login;
import static projeto.pi.basepi.DAO.PedidoDAO.senha;
import static projeto.pi.basepi.DAO.PedidoDAO.url;
import static projeto.pi.basepi.DAO.VendedorDAO.login;
import static projeto.pi.basepi.DAO.VendedorDAO.senha;
import static projeto.pi.basepi.DAO.VendedorDAO.url;
import projeto.pi.basepi.MODELS.Cliente;
import projeto.pi.basepi.MODELS.Endereco;
import projeto.pi.basepi.MODELS.ItemPedido;
import projeto.pi.basepi.MODELS.Pedido;
import projeto.pi.basepi.MODELS.Vendedor;


public class ClienteDAO {

    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "Ags0316289";

    public static boolean salvar(Cliente novoCliente, Endereco clienteEndereco) {
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

                    comandoSql.setString(1, clienteEndereco.getCep());
                    comandoSql.setString(2, clienteEndereco.getLogradouro());
                    comandoSql.setString(3, clienteEndereco.getNumero());
                    comandoSql.setString(4, clienteEndereco.getComplemento());
                    comandoSql.setString(5, clienteEndereco.getBairro());
                    comandoSql.setString(6, clienteEndereco.getCidade());
                    comandoSql.setString(7, clienteEndereco.getUf());

                int linhasAfetdas = comandoSql.executeUpdate();

                if (linhasAfetdas > 0) {

                    rs = comandoSql.getGeneratedKeys();

                    if (rs.next()) {
                    //Resgato o id dao Pedido gerado no banco
                    int idEndereco = rs.getInt(1);
                    
                    //Passo 3 - Preprar o comando
                comandoSql = conexao.prepareStatement("insert into cliente (nome,email,cliente_cpf,idEndereco,dt_nascimento,sexo,telefone) values(?,?,?,?,?,?,?)",
                        PreparedStatement.RETURN_GENERATED_KEYS
                );

                comandoSql.setString(1, novoCliente.getNome());
                comandoSql.setString(2, novoCliente.getEmail());
                comandoSql.setString(3, novoCliente.getCPF());
                comandoSql.setInt(4, idEndereco);
                comandoSql.setDate(5, (Date) novoCliente.getDataNascimento());
                comandoSql.setString(6, novoCliente.getGenero());
                comandoSql.setString(7, novoCliente.getTelefone());

                        int linhasAfetadasCliente = comandoSql.executeUpdate();
                        if(linhasAfetadasCliente > 0){
                           retorno = true;
                        }
                    }

                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {

                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }
    

    
    public static boolean alterar(Cliente novoCliente, Endereco clienteEndereco) {
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
                comandoSql = conexao.prepareStatement("UPDATE endereco SET cep = ?, logradouro = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?  WHERE idEndereco = ? "
                    );

                    comandoSql.setString(1, clienteEndereco.getCep());
                    comandoSql.setString(2, clienteEndereco.getLogradouro());
                    comandoSql.setString(3, clienteEndereco.getNumero());
                    comandoSql.setString(4, clienteEndereco.getComplemento());
                    comandoSql.setString(5, clienteEndereco.getBairro());
                    comandoSql.setString(6, clienteEndereco.getCidade());
                    comandoSql.setString(7, clienteEndereco.getUf());
                    comandoSql.setInt(8, clienteEndereco.getIdEndereco());

                int linhasAfetdas = comandoSql.executeUpdate();
                
                comandoSql = conexao.prepareStatement("UPDATE cliente SET nome = ?, email = ?, cliente_Cpf = ?, idEndereco = ?, dt_nascimento = ?, sexo = ?, telefone = ?  WHERE idCliente = ? "
                    );

                    comandoSql.setString(1, novoCliente.getNome());
                    comandoSql.setString(2, novoCliente.getEmail());
                    comandoSql.setString(3, novoCliente.getCPF());
                    comandoSql.setInt(4, clienteEndereco.getIdEndereco());
                    comandoSql.setDate(5, (Date) novoCliente.getDataNascimento());
                    comandoSql.setString(6, novoCliente.getGenero());
                    comandoSql.setString(7, novoCliente.getTelefone());
                    comandoSql.setInt(8, novoCliente.getIdCliente());

                int linhasAfetdas2 = comandoSql.executeUpdate();

                if (linhasAfetdas > 0 && linhasAfetdas2 > 0) {

                   retorno = true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {

                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }
     
    public static ArrayList<Cliente> listar() {
        Connection conexao = null;
        PreparedStatement comandoSql = null;
        ResultSet rs = null;
        ArrayList<Cliente> listar = new ArrayList<Cliente>();

        try {
     
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            
            comandoSql = conexao.prepareStatement("select * from cliente");
            rs = comandoSql.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String cpf = rs.getString("cliente_cpf");
                    Date data = rs.getDate("dt_nascimento");
                    String genero = rs.getString("sexo");
                    String telefone = rs.getString("telefone");

                    Cliente item = new Cliente(id,nome, email, cpf, data, genero, telefone);
                    listar.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listar;
    }
    
    public static ArrayList<Cliente> buscarPorNome(String nomeBuscar){
        
        
        Connection conexao = null;
        PreparedStatement comandoSql= null;
        ResultSet rs = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try {
         

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            conexao = DriverManager.getConnection(url,login,senha);
            
           
            
            comandoSql = conexao.prepareStatement("select * from cliente where nome = ?;");
            
            comandoSql.setString(1, nomeBuscar);
            
            rs = comandoSql.executeQuery();
            
            if( rs!= null ){
            
                    while(rs.next()){
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String cpf = rs.getString("cliente_cpf");
                    Date data = rs.getDate("dt_nascimento");
                    String genero = rs.getString("sexo");
                    String telefone = rs.getString("telefone");

                        
                   Cliente item = new Cliente(id,nome, email, cpf, data, genero, telefone);
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
     
    public static ArrayList<Cliente> buscarPorCPF(String cpfBuscar){
        
        
        Connection conexao = null;
        PreparedStatement comandoSql= null;
        ResultSet rs = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try {
         

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            conexao = DriverManager.getConnection(url,login,senha);
            
           
            
            comandoSql = conexao.prepareStatement("select * from cliente where cliente_cpf = ?;");
            
            comandoSql.setString(1, cpfBuscar);
            
            rs = comandoSql.executeQuery();
            
            if( rs!= null ){
            
                    while(rs.next()){
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String cpf = rs.getString("cliente_cpf");
                    Date data = rs.getDate("dt_nascimento");
                    String genero = rs.getString("sexo");
                    String telefone = rs.getString("telefone");

                        
                   Cliente item = new Cliente(id, nome, email, cpf, data, genero, telefone);
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
    
    public static ArrayList<Cliente> Detalhes(int cod){
        
        
        Connection conexao = null;
        PreparedStatement comandoSql= null;
        ResultSet rs = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try {
         

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            conexao = DriverManager.getConnection(url,login,senha);
            
           
            
            comandoSql = conexao.prepareStatement("select * from cliente where idCliente = ?;");
            
            comandoSql.setInt(1, cod);
            
            rs = comandoSql.executeQuery();
            
            if( rs!= null ){
            
                    while(rs.next()){
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String cpf = rs.getString("cliente_cpf");
                    Date data = rs.getDate("dt_nascimento");
                    String genero = rs.getString("sexo");
                    String telefone = rs.getString("telefone");
                    int idEndereco = rs.getInt("idEndereco");

                        
                   Cliente item = new Cliente(id, nome, email, cpf, data, genero, telefone,idEndereco);
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
     
     
    public static boolean excluir(int idExcluirCliente, int idExcluirEndereco) {
        PreparedStatement comandoSql = null;
        boolean retorno = false;
        Connection conexao = null;
        ResultSet rs = null;
                        

        try {
       
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            try {
             
               conexao = DriverManager.getConnection(url, login, senha);

               
               comandoSql = conexao.prepareStatement ( "delete from cliente where idCliente = ?"); 

               comandoSql.setInt(1, idExcluirCliente);
                  
               int linhasAfetdas1 = comandoSql.executeUpdate();
               comandoSql = conexao.prepareStatement ( "delete from endereco where idEndereco = ?"); 

                comandoSql.setInt(1, idExcluirEndereco);

                int linhasAfetdas2 = comandoSql.executeUpdate();
                
               if(linhasAfetdas1 > 0 && linhasAfetdas2 > 0){
  
                    retorno = true;
                 
                 
               }
                
               
                
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
                
            if(conexao != null){
                    
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;

    }

}
