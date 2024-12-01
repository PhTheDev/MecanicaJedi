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
  private int identificador = 0;
  private String placa = "";
  private String marca = "";
  private String modelo = "";
  private String nomeProprietario = "";
  private String cpf = "";

  public VeiculoProprietario() {
  }
  public VeiculoProprietario( int identificador, String placa,
                              String marca, String modelo,
                              String nomeProprietario, String cpf) {
    this.identificador = identificador;
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.nomeProprietario = nomeProprietario;
    this.cpf = cpf;
  }

  public int getIdentificador() {
    return identificador;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
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
    return identificador + "-" + placa + " => " + modelo + " => " + nomeProprietario;
  }
  
  
}
