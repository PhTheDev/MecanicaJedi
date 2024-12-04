/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ejmcc
 */
public class Servicos {
  //Atributos
  private int idServico = 0;
  private String descricao = null;
  private double valor=0;
  //Metodos

  public Servicos() {
  }
  public Servicos(int identificador, String descricao, double valor) throws Exception{
    if(idServico<=0) throw new Exception("Falha ao definir idServico");
    if(descricao==null)throw new Exception("Insira uma descrição de serviço");
    if(valor<=0)throw new Exception("Insira um valor valido para o serviço");
      
    this.idServico = identificador;
    this.descricao = descricao;
    this.valor=valor;
  }

  public int getIdServico() {
    return idServico;
  }

  public void setIdServico(int idServico) {
    this.idServico = idServico;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return idServico + "-" + descricao;
  }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
  
  
  
}
