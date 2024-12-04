/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ejmcc
 */
public class VeiculoProprietario {
  //Atributos
  private int idProprietario = 0;
  private String placa = "";
  private String marca = "";
  private String modelo = "";
  private String nomeProprietario = "";
  private String cpf = "";
  private Cliente cliente;
  private Veiculo veiculo;

  public VeiculoProprietario() {
  }
  public VeiculoProprietario(int idProprietario, Cliente cliente, Veiculo veiculo) throws Exception {
        if (idProprietario <= 0) throw new Exception("ID do proprietário deve ser maior que zero.");
        if (cliente == null) throw new Exception("Cliente não pode ser nulo.");
        if (veiculo == null) throw new Exception("Veículo não pode ser nulo.");

        this.idProprietario = idProprietario;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }
  public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    
  public int getIdProprietario() {
    return idProprietario;
  }

  public void setIdProprietario(int idProprietario) {
    this.idProprietario = idProprietario;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getNomeProprietario() {
    return nomeProprietario;
  }

  public void setNomeProprietario(String nomeProprietario) {
    this.nomeProprietario = nomeProprietario;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return idProprietario + "-" + placa + " => " + modelo + " => " + nomeProprietario;
  }
  
  
}
