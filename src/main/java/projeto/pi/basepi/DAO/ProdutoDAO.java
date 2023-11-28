/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static projeto.pi.basepi.DAO.ClienteDAO.login;
import static projeto.pi.basepi.DAO.ClienteDAO.senha;
import static projeto.pi.basepi.DAO.ClienteDAO.url;
import projeto.pi.basepi.MODELS.Cliente;
import projeto.pi.basepi.MODELS.Produto;

/**
 *
 * @author dudu2
 */
public class ProdutoDAO {

    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "Ags0316289";

    public static boolean salvar(Produto obj) {
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
                comandoSql = conexao.prepareStatement("insert into produto (idMarca, nome, qtdEstoque, preco, descricao) values (?,?,?,?,?);",
                        PreparedStatement.RETURN_GENERATED_KEYS
                );

                comandoSql.setInt(1, obj.getMarca());
                comandoSql.setString(2, obj.getNome());
                comandoSql.setInt(3, obj.getQntd());
                comandoSql.setDouble(4, obj.getPreco());
                comandoSql.setString(5, obj.getDescricao());

                int linhasAfetdas = comandoSql.executeUpdate();

                if (linhasAfetdas > 0) {

                    rs = comandoSql.getGeneratedKeys();

                    if (rs != null) {
                        while (rs.next()) {

                            int idGerado = rs.getInt(1);
                            obj.setIdProduto(idGerado);
                        }

                    }

                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {

                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }

    public static ArrayList<Produto> listar() {

        Connection conexao = null;
        PreparedStatement comandoSql = null;
        ResultSet rs = null;
        ArrayList<Produto> listar = new ArrayList<Produto>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSql = conexao.prepareStatement("select produto.idProduto, marca.marca, produto.nome, produto.descricao, produto.preco, produto.qtdEstoque\n"
                    + "from produto inner join marca on marca.idMarca = produto.idMarca");
            rs = comandoSql.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto item = new Produto();

                    item.setIdProduto(rs.getInt("produto.idProduto"));
                    item.setNomeMarca(rs.getString("marca.marca"));
                    item.setNome(rs.getString("produto.nome"));
                    item.setDescricao(rs.getString("produto.descricao"));
                    item.setPreco(rs.getDouble("produto.preco"));
                    item.setQntd(rs.getInt("produto.qtdEstoque"));

                    listar.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listar;
    }

    public static boolean alterar(Produto obj) {
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
                comandoSql = conexao.prepareStatement("UPDATE produto\n"
                        + "INNER JOIN marca ON marca.idMarca = produto.IdMarca\n"
                        + "SET \n"
                        + "    produto.nome = ?,\n"
                        + "    produto.descricao = ?,\n"
                        + "    produto.preco = ?,\n"
                        + "    produto.qtdEstoque = ?,\n"
                        + "    produto.idMarca =?\n"
                        + "WHERE produto.idProduto = ?;");

                comandoSql.setString(1, obj.getNome());
                comandoSql.setString(2, obj.getDescricao());
                comandoSql.setDouble(3, obj.getPreco());
                comandoSql.setInt(4, obj.getQntd());
                comandoSql.setInt(5, obj.getMarca());
                comandoSql.setInt(6, obj.getIdProduto());

                int linhasAfetdas = comandoSql.executeUpdate();

                if (linhasAfetdas > 0) {

                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {

                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;

    }

    public static boolean excluir(int idExcluir) {
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
                comandoSql = conexao.prepareStatement("delete from produto where idProduto = ?");
                comandoSql.setInt(1, idExcluir);

                int linhasAfetdas = comandoSql.executeUpdate();

                if (linhasAfetdas > 0) {

                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {

                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;

    }

    public static ArrayList<Produto> adicionarNaTabelaNovoPedido(int codProduto) {
        Connection conexao = null;
        PreparedStatement comandoSql = null;
        ResultSet rs = null;
        ArrayList<Produto> listar = new ArrayList<Produto>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSql = conexao.prepareStatement("select * from produto where idProduto = ?;");
            comandoSql.setInt(1, codProduto);

            rs = comandoSql.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto item = new Produto();

                    item.setIdProduto(rs.getInt("idProduto"));
                    item.setMarca(rs.getInt("idMarca"));
                    item.setNome(rs.getString("nome"));
                    item.setDescricao(rs.getString("descricao"));
                    item.setPreco(rs.getDouble("preco"));
                    item.setQntd(rs.getInt("qtdEstoque"));

                    listar.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listar;
    }

    public static ArrayList<Produto> listarMarca(String marca) {

        Connection conexao = null;
        PreparedStatement comandoSql = null;
        ResultSet rs = null;
        ArrayList<Produto> listar = new ArrayList<Produto>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSql = conexao.prepareStatement("select produto.idProduto, marca.marca, produto.nome, produto.descricao, produto.preco, produto.qtdEstoque\n"
                    + "from produto inner join marca on marca.idMarca = produto.idMarca where marca.marca = ?");
            comandoSql.setString(1, marca);

            rs = comandoSql.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto item = new Produto();

                    item.setIdProduto(rs.getInt("produto.idProduto"));
                    item.setNomeMarca(rs.getString("marca.marca"));
                    item.setNome(rs.getString("produto.nome"));
                    item.setDescricao(rs.getString("produto.descricao"));
                    item.setPreco(rs.getDouble("produto.preco"));
                    item.setQntd(rs.getInt("produto.qtdEstoque"));

                    listar.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listar;
    }

    public static ArrayList<Produto> listarProcessador(String processador) {

        Connection conexao = null;
        PreparedStatement comandoSql = null;
        ResultSet rs = null;
        ArrayList<Produto> listar = new ArrayList<Produto>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            comandoSql = conexao.prepareStatement("select produto.idProduto, marca.marca, produto.nome, produto.descricao, produto.preco, produto.qtdEstoque\n"
                    + "from produto inner join marca on marca.idMarca = produto.idMarca where produto.nome = ?;");
            comandoSql.setString(1, processador);

            rs = comandoSql.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto item = new Produto();

                    item.setIdProduto(rs.getInt("produto.idProduto"));
                    item.setNomeMarca(rs.getString("marca.marca"));
                    item.setNome(rs.getString("produto.nome"));
                    item.setDescricao(rs.getString("produto.descricao"));
                    item.setPreco(rs.getDouble("produto.preco"));
                    item.setQntd(rs.getInt("produto.qtdEstoque"));

                    listar.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listar;
    }
}
