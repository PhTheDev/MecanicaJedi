/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;
import java.util.ArrayList;
import modelos.Gastos;

public interface IGastosCRUD {
  public void incluir(Gastos objServico) throws Exception;
  public ArrayList<Gastos> obterListaDeGastos() throws Exception;
}
