/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferramentas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ejmcc
 */
public class ConexaoBD {
  private static Connection conexao = null;  
  private ConexaoBD(){}
  public static Connection getConexao() throws Exception{
    try{
      if(conexao == null){
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/mecanica_jedi";
        String user = "postgres";
        String password = "0202";
                  
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, user, password);
      }
               
    }
    catch(ClassNotFoundException erro){
      //Erro de não encontrar o drive do banco no projeto
      throw new Exception("Erro no drive: "+erro.getMessage());
    }
    catch(SQLException erro){
      //Erro no banco de dados: usuario, senha ou banco de dados 
      throw new Exception("Erro no Banco de dados: " + erro.getMessage());
    } 
    return conexao;
        
  }
}
