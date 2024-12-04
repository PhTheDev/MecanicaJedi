/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Calendar;

/**
 *
 * @author thiago.srodrigues
 */
public class Veiculo {
    private int idVeiculo = 0;
    private String primeiraEntrada = null;
    private int ano = 0;
    private String placa = null;
    private String chassi = null;
    private int kilometragem = 0;
    private int numPatrimonio = 0;
    
    // Relação com Modelo e Marca
    private Modelo modelo;
    private Marca marca;

    Calendar cal = Calendar.getInstance();
    int anoAtual = cal.get(Calendar.YEAR);
    int anoMsz = anoAtual + 1;
    public Veiculo() {
    }

    public Veiculo(int idVeiculo, String primeiraEntrada, int ano, String placa, String chassi, int kilometragem, int numPatrimonio, Modelo modelo, Marca marca) throws Exception {
        if (idVeiculo <= 0) throw new Exception("ID do veículo deve ser maior que zero.");
        if (primeiraEntrada == null || primeiraEntrada.isEmpty()) throw new Exception("Primeira entrada não pode ser vazia.");
        if (ano < 1886) throw new Exception("Ano inválido. Deve ser maior que 1886.");
        if (placa == null || placa.length() != 7) throw new Exception("Placa inválida. Esperado 7 caracteres.");
        if (chassi == null || chassi.length() != 17) throw new Exception("Chassi inválido. Deve ter exatamente 17 caracteres.");
        if (kilometragem < 0) throw new Exception("Kilometragem não pode ser negativa.");
        if (numPatrimonio <= 0) throw new Exception("Número de patrimônio deve ser maior que zero.");

        this.idVeiculo = idVeiculo;
        this.primeiraEntrada = primeiraEntrada;
        this.ano = ano;
        this.placa = placa;
        this.chassi = chassi;
        this.kilometragem = kilometragem;
        this.numPatrimonio = numPatrimonio;
        this.modelo = modelo;
        this.marca = marca;
    }
    public Modelo getModelo() {
        return modelo;
    }

    public Marca getMarca() {
        return marca;
    }
    
    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPrimeiraEntrada() {
        return primeiraEntrada;
    }

    public void setPrimeiraEntrada(String primeiraEntrada) {
        this.primeiraEntrada = primeiraEntrada;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public int getNumPatrimonio() {
        return numPatrimonio;
    }

    public void setNumPatrimonio(int numPatrimonio) {
        this.numPatrimonio = numPatrimonio;
    }

}


