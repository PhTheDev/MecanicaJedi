/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.util.ArrayList;
import modelos.IVeiculoProprietarioCRUD;
import modelos.VeiculoProprietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ferramentas.ConexaoBD;
import modelos.Servicos;
/**
 *
 * @author ejmcc
 */
public class VeiculosProprietariosDAO implements IVeiculoProprietarioCRUD{
  //Conexao com o banco
  private Connection conexao = null;

  public VeiculosProprietariosDAO() throws Exception{
    conexao = ConexaoBD.getConexao();
    if(conexao == null) throw new Exception("ERRO DE CONEXAO PROPRIETARIOS");
  }
  
  @Override
  public ArrayList<VeiculoProprietario> obterListaDeVeiculoProprietarios() throws Exception {
    ArrayList<VeiculoProprietario> listaDeVeiculosProprietarios = new ArrayList<>();
        String sql = "select * from veicprop order by idveicprop";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
                VeiculoProprietario objVeiculoProprietario = new VeiculoProprietario();
                objVeiculoProprietario.setIdentificador(rs.getInt("idveicprop"));
                objVeiculoProprietario.setPlaca(rs.getString("placa"));
                objVeiculoProprietario.setMarca(rs.getString("marca"));
                objVeiculoProprietario.setModelo(rs.getString("modelo"));
                objVeiculoProprietario.setNomeProprietario(rs.getString("nomeprop"));
                objVeiculoProprietario.setCpf(rs.getString("cpf"));
                listaDeVeiculosProprietarios.add(objVeiculoProprietario);
            }
            return listaDeVeiculosProprietarios;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
  }

  @Override
  public void incluir(VeiculoProprietario objVeiculosProprietarios) throws Exception {
    try {
      String sql = "insert into veicprop(placa, marca, modelo, nomeprop, cpf)values(?,?,?,?,?);";
      PreparedStatement preparedStatement = conexao.prepareStatement(sql);
      preparedStatement.setString(1, objVeiculosProprietarios.getPlaca());
      preparedStatement.setString(2, objVeiculosProprietarios.getMarca());
      preparedStatement.setString(3, objVeiculosProprietarios.getModelo());
      preparedStatement.setString(4, objVeiculosProprietarios.getNomeProprietario());
      preparedStatement.setString(5, objVeiculosProprietarios.getCpf());
      preparedStatement.executeUpdate();
    } catch (SQLException erro) {
        //Erro do comando SQL - chave, coluna, nome da tabela, ...
        throw new Exception("SQL Erro: "+ erro.getMessage());
    } catch(Exception erro){
          throw new Exception("Incluir Persistencia: " + erro);
    } 
  }

  @Override
  public void alterar(VeiculoProprietario objVeiculosProprietarios) throws Exception {
try {
      String sql = "update veicprop set placa = ? , marca = ?, modelo = ?,"
              + "nomeprop = ?, cpf = ?"
              + "where idveicprop = ?";
      PreparedStatement preparedStatement = conexao.prepareStatement(sql);
      preparedStatement.setString(1, objVeiculosProprietarios.getPlaca());
      preparedStatement.setString(2, objVeiculosProprietarios.getMarca());
      preparedStatement.setString(3, objVeiculosProprietarios.getModelo());
      preparedStatement.setString(4, objVeiculosProprietarios.getNomeProprietario());
      preparedStatement.setString(5, objVeiculosProprietarios.getCpf());
      preparedStatement.setInt(6, objVeiculosProprietarios.getIdentificador());
      preparedStatement.executeUpdate();
    } catch (SQLException erro) {
        //Erro do comando SQL - chave, coluna, nome da tabela, ...
        throw new Exception("SQL Erro: "+ erro.getMessage());
    } catch(Exception erro){
          throw new Exception("Alterar Veiculos Persistencia: " + erro);
    }     }
  
}
