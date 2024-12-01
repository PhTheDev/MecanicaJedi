/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Gastos {
  //Atributos
  private int id = 0;
  private String dataDoServico = "";
  private float valor = 0;
  private int idVeiculoProprietario = 0;
  private int idServico = 0;
  
  //Metodos
  public Gastos() {
  }
  public Gastos(int id, String dataDoServico, float valor, int idVeiculoProprietario, int idServico) {
    this.id = id;
    this.dataDoServico = dataDoServico;
    this.valor = valor;
    this.idVeiculoProprietario = idVeiculoProprietario;
    this.idServico = idServico;
  }
  public int getIdentificador() {
    return id;
  }
  public void setIdentificador(int identificador) {
    this.id = id;
  }
  public String getDataDoServico() {
    return dataDoServico;
  }
  public void setDataDoServico(String dataDoServico) {
    this.dataDoServico = dataDoServico;
  }
  public float getValor() {
    return valor;
  }
  public void setValor(float valor) {
    this.valor = valor;
  }
  public int getIdVeiculoProprietario() {
    return idVeiculoProprietario;
  }
  public void setIdVeiculoProprietario(int idVeiculoProprietario) {
    this.idVeiculoProprietario = idVeiculoProprietario;
  }
  public int getIdServico() {
    return idServico;
  }
  public void setIdServico(int idServico) {
    this.idServico = idServico;
  }
}
