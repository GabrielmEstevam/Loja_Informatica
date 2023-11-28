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

import projeto.pi.basepi.MODELS.Cliente;
import projeto.pi.basepi.MODELS.Marca;

/**
 *
 * @author Athyla
 */
public class MarcaDAO {
    
    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "Ags0316289";
    public static ArrayList<Marca> PegarMarca(int id_Marca){
        
        
        Connection conexao = null;
        PreparedStatement comandoSql= null;
        ResultSet rs = null;
        ArrayList<Marca> lista = new ArrayList<Marca>();
        
        try {
         

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            conexao = DriverManager.getConnection(url,login,senha);
            
           
            
            comandoSql = conexao.prepareStatement("select * from marca where idMarca = ?;");
            
            comandoSql.setInt(1, id_Marca);
            
            rs = comandoSql.executeQuery();
            
            if( rs!= null ){
            
                    while(rs.next()){
                    int id = rs.getInt("idMarca");
                    String nomeMarca = rs.getString("marca");


                        
                    Marca item = new Marca(id_Marca, nomeMarca);
                    lista.add(item);
                        
                    }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                
            if(conexao != null){
                    
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        return lista;
    }
}
