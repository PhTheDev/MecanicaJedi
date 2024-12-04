/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;
import java.util.ArrayList;
import modelos.VeiculoProprietario;

/**
 *
 * @author ejmcc
 */
public interface IVeiculoProprietarioCRUD {
  public ArrayList<VeiculoProprietario> obterListaDeVeiculoProprietarios() throws Exception;
  public void incluir(VeiculoProprietario objVeiculosProprietarios) throws Exception;
  public void alterar(VeiculoProprietario objVeiculosProprietarios) throws Exception;  
}
