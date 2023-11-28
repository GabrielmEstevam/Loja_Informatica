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
import javax.xml.crypto.Data;
import projeto.pi.basepi.MODELS.DTO.PedidoDTO;
import projeto.pi.basepi.MODELS.DTO.PedidoDetalhesDTO;
import projeto.pi.basepi.MODELS.ItemPedido;
import projeto.pi.basepi.MODELS.Pedido;


public class PedidoDAO {

    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "Ags0316289";

    
    public static ArrayList<PedidoDTO> listar(){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<PedidoDTO> lista = new ArrayList<PedidoDTO>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select pedido.idPedido, cliente.nome, cliente.cliente_Cpf, " +
            "pedido.valor_Total,pedido.data_pedido " +"from pedido inner join cliente using(idCliente);");

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int cod = rs.getInt("pedido.idPedido");
                    String cliente = rs.getString("cliente.nome");
                    String cpf = rs.getString("cliente.cliente_Cpf");
                    double valor = rs.getDouble("pedido.valor_Total");
                    Date dt_pedido = rs.getDate("pedido.data_pedido");
                    
                    //Passei os dados do rs para um objeto
                    PedidoDTO item = new PedidoDTO(cod, cliente,cpf,valor,dt_pedido);
                    
                    lista.add(item);
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        
    public static ArrayList<PedidoDTO> buscarPorCod(int codBuscar){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<PedidoDTO> lista = new ArrayList<PedidoDTO>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select pedido.idPedido, cliente.nome, cliente.cliente_Cpf, " +
            "pedido.valor_Total,pedido.data_pedido " +"from pedido inner join cliente using(idCliente) where pedido.idPedido = ?;");
//                    +"where pedido.idPedido = ?");
            comandoSQL.setInt(1, codBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int cod = rs.getInt("pedido.idPedido");
                    String cliente = rs.getString("cliente.nome");
                    String cpf = rs.getString("cliente.cliente_Cpf");
                    double valor = rs.getDouble("pedido.valor_Total");
                    Date dt_pedido = rs.getDate("pedido.data_pedido");
                    
                    //Passei os dados do rs para um objeto
                    PedidoDTO item = new PedidoDTO(cod, cliente,cpf,valor,dt_pedido);
                    
                    lista.add(item);
                    
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
    }
    
    public static ArrayList<PedidoDTO> buscarPorCliente(String clienteBuscar){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<PedidoDTO> lista = new ArrayList<PedidoDTO>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select pedido.idPedido, cliente.nome, cliente.cliente_Cpf, " +
            "pedido.valor_Total,pedido.data_pedido " +"from pedido inner join cliente using(idCliente) where cliente.nome like ?;");
            
            comandoSQL.setString(1, "%"+clienteBuscar+"%");

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int cod = rs.getInt("pedido.idPedido");
                    String cliente = rs.getString("cliente.nome");
                    String cpf = rs.getString("cliente.cliente_Cpf");
                    double valor = rs.getDouble("pedido.valor_Total");
                    Date dt_pedido = rs.getDate("pedido.data_pedido");
                    
                    //Passei os dados do rs para um objeto
                    PedidoDTO item = new PedidoDTO(cod, cliente,cpf,valor,dt_pedido);
                    
                    lista.add(item);
                    
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
    }

      
    public static ArrayList<PedidoDTO> buscarPorCpf(String cpfBuscar){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<PedidoDTO> lista = new ArrayList<PedidoDTO>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select pedido.idPedido, cliente.nome, cliente.cliente_Cpf, " +
            "pedido.valor_Total,pedido.data_pedido " +"from pedido inner join cliente using(idCliente) where cliente.cliente_Cpf = ?;");
            
            comandoSQL.setString(1, cpfBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int cod = rs.getInt("pedido.idPedido");
                    String cliente = rs.getString("cliente.nome");
                    String cpf = rs.getString("cliente.cliente_Cpf");
                    double valor = rs.getDouble("pedido.valor_Total");
                    Date dt_pedido = rs.getDate("pedido.data_pedido");
                    
                    //Passei os dados do rs para um objeto
                    PedidoDTO item = new PedidoDTO(cod, cliente,cpf,valor,dt_pedido);
                    
                    lista.add(item);
                    
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
    }
      
    public static ArrayList<PedidoDTO> buscarPorValor(double valorT){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<PedidoDTO> lista = new ArrayList<PedidoDTO>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select pedido.idPedido, cliente.nome, cliente.cliente_Cpf, " +
            "pedido.valor_Total,pedido.data_pedido " +"from pedido inner join cliente using(idCliente) where pedido.valor_Total = ?;");
            
            comandoSQL.setDouble(1, valorT);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int cod = rs.getInt("pedido.idPedido");
                    String cliente = rs.getString("cliente.nome");
                    String cpf = rs.getString("cliente.cliente_Cpf");
                    double valor = rs.getDouble("pedido.valor_Total");
                    Date dt_pedido = rs.getDate("pedido.data_pedido");
                    
                    //Passei os dados do rs para um objeto
                    PedidoDTO item = new PedidoDTO(cod, cliente,cpf,valor,dt_pedido);
                    
                    lista.add(item);
                    
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
    }
    
    public static ArrayList<Pedido> PegandoOsIdPedidosDoCliente(int idCliente){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Pedido> lista = new ArrayList<Pedido>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select * from pedido where idCliente = ?;");
//                    +"where pedido.idPedido = ?");
            comandoSQL.setInt(1, idCliente);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int cod = rs.getInt("idPedido");
                    Pedido p = new Pedido();
                    p.setIdPedido(cod);
                    
                    //Passei os dados do rs para um objeto
                    Pedido item = p;
                    
                    lista.add(item);
                    
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
    }
          
    public static ArrayList<PedidoDTO> buscarPorData(Date dt){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<PedidoDTO> lista = new ArrayList<PedidoDTO>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select pedido.idPedido, cliente.nome, cliente.cliente_Cpf, " +
            "pedido.valor_Total,pedido.data_pedido " +"from pedido inner join cliente using(idCliente) where pedido.data_pedido = ?;");
            
            comandoSQL.setDate(1, dt);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int cod = rs.getInt("pedido.idPedido");
                    String cliente = rs.getString("cliente.nome");
                    String cpf = rs.getString("cliente.cliente_Cpf");
                    double valor = rs.getDouble("pedido.valor_Total");
                    Date dt_pedido = rs.getDate("pedido.data_pedido");
                    
                    //Passei os dados do rs para um objeto
                    PedidoDTO item = new PedidoDTO(cod, cliente,cpf,valor,dt_pedido);
                    
                    lista.add(item);
                    
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
    }
    
    
    public static ArrayList<PedidoDetalhesDTO> detalhes(int idpedido){
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<PedidoDetalhesDTO> pedDetalhes = new ArrayList<PedidoDetalhesDTO>();
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select pedido.idPedido, vendedor.nome, cliente.nome," 
                    +"cliente.cliente_Cpf, pedido.data_pedido, pedido.valor_Total," +
                    "produto.idProduto, marca.marca, produto.nome," +
                    "item_pedido.qtd, produto.preco from pedido " +
                    "inner join vendedor using(idVendedor) " +
                    "inner join cliente using(idCliente) " +
                    "inner join item_pedido using(idPedido) " +
                    "inner join produto using(idProduto) " +
                    "inner join marca using(idMarca) where pedido.idPedido = ?;");

            //Passo 4 - Executar o comando SQL
            comandoSQL.setDouble(1, idpedido);
            rs = comandoSQL.executeQuery();
            
            if(rs !=null){
                
                //Ler linha por linha do ResultSet
                while(rs.next()){
                    int cod = rs.getInt("pedido.idPedido");
                    String vendendor = rs.getString("vendedor.nome");
                    String cliente = rs.getString("cliente.nome");
                    String clienteCpf = rs.getString("cliente.cliente_Cpf");
                    Date dtPedido = rs.getDate("pedido.data_pedido");
                    int idProduto = rs.getInt("produto.idProduto");
                    String marca = rs.getString("marca.marca");
                    String produto = rs.getString("produto.nome");
                    double total = rs.getDouble("pedido.valor_Total");
                    int qtd = rs.getInt("item_pedido.qtd");
                    double preco = rs.getDouble("produto.preco");
                    
                    //Passei os dados do rs para um objeto
                    PedidoDetalhesDTO item = new PedidoDetalhesDTO(cod, dtPedido, total, marca, idProduto, produto, qtd, preco, vendendor, cliente, clienteCpf);
                    pedDetalhes.add(item);
                    
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        
        return pedDetalhes;
        
        
    }// Fim do listar
    
    public static boolean salvar(Pedido novoPedido) {
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO pedido (idCliente,idVendedor,data_pedido,valor_total) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, novoPedido.getIdCliente());
            comandoSQL.setInt(2, novoPedido.getIdVendedor());
            comandoSQL.setDate(3,(Date) novoPedido.getDataPedido());
            comandoSQL.setDouble(4, novoPedido.getTotal());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if (linhasAfetadas > 0) {
                //Recuperando o id gerado do Pedido
                ResultSet rs = comandoSQL.getGeneratedKeys();
                
                if (rs.next()) {
                    //Resgato o id dao Pedido gerado no banco
                    int idNovoPedido = rs.getInt(1);
                    
                    for (ItemPedido item : novoPedido.getListaItens()) {
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO item_pedido (idPedido,idProduto,qtd,valorUnit) VALUES (?,?,?,?)");
                        comandoSQLItem.setInt(1, idNovoPedido);
                        comandoSQLItem.setInt(2, item.getIdProduto());
                        comandoSQLItem.setInt(3, item.getQntd());
                        comandoSQLItem.setDouble(4, item.getPreco());

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
                        if(linhasAfetadasItem > 0){
                            retorno = true;
                        }
                    }
                }
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return retorno;
        
    }
    
    public static ArrayList<PedidoDTO> relatorioSintetico(Date inicio, Date fim) {

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<PedidoDTO> lista = new ArrayList<PedidoDTO>();

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("select idPedido, sum(pedido.valor_total) as total, data_pedido, nome from pedido"
                    + " inner join cliente on cliente.idCliente = pedido.idCliente where data_pedido between ? and ? group by data_pedido,nome,idPedido;");

            //Passo 4 - Executar o comando SQL
            comandoSQL.setDate(1, inicio);
            comandoSQL.setDate(2, fim);
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Ler linha por linha do ResultSet
                while (rs.next()) {
                    int id = rs.getInt("idPedido");
                    String cliente = rs.getString("cliente.nome");
                    double valor = rs.getDouble("total");
                    Date dt_pedido = rs.getDate("pedido.data_pedido");

                    //Passei os dados do rs para um objeto
                    PedidoDTO item = new PedidoDTO(id, cliente, valor, dt_pedido);

                    lista.add(item);

                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return lista;

    }// Fim do listar
    
    
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
            "DELETE FROM item_pedido WHERE idPedido = ?"  );
            
            comandoSQL.setInt(1, idExcluir);
            
            //Passo 4 - Finalmente... Executamos o comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            
            comandoSQL = conexao.prepareStatement(
            "DELETE FROM pedido WHERE idPedido = ?"  );
            
            comandoSQL.setInt(1, idExcluir);
            
            //Passo 4 - Finalmente... Executamos o comando SQL
            int linhasAfetadas2 = comandoSQL.executeUpdate();
            
            
            if(linhasAfetadas > 0 && linhasAfetadas2 > 0){
                
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return retorno;
    }
    
    
    
}
