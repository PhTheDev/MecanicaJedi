/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author thiago.srodrigues
 */
public class Cliente {
    private int idCliente=0;
    private String nome=null;
    private String endereco=null;
    private String email=null;
    private String cpf=null;
    private int inscricaoEstadual=0;
    private String contato=null;
    private String cnpj=null;

    // Relação com VeiculoProprietario
    private List<VeiculoProprietario> veiculos = new ArrayList<>();
    
    public Cliente() {
    }

    // Pessoa Física
    public Cliente(int idCliente, String nome, String email, String cpf, String endereco) throws Exception {
        if (idCliente <= 0) 
            throw new Exception("ID do cliente deve ser maior que zero.");
        if (nome == null || nome.isEmpty() || nome.length() < 3) 
            throw new Exception("Nome inválido. Deve conter pelo menos 3 caracteres.");
        if (email == null || !email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) 
            throw new Exception("Email inválido.");
        if (cpf == null || !cpf.matches("\\d{11}")) 
            throw new Exception("CPF inválido. Deve conter exatamente 11 dígitos.");
        if (endereco == null || endereco.isEmpty()) 
            throw new Exception("Endereço não pode ser vazio.");

        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }


    // Pessoa Jurídica
    public Cliente(int idCliente, String nome, String email, int inscricaoEstadual, String contato, String cnpj, String endereco) throws Exception {
        if (idCliente <= 0) 
            throw new Exception("ID do cliente deve ser maior que zero.");
        if (nome == null || nome.isEmpty() || nome.length() < 3) 
            throw new Exception("Nome inválido. Deve conter pelo menos 3 caracteres.");
        if (email == null || !email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) 
            throw new Exception("Email inválido.");
        if (inscricaoEstadual <= 0) 
            throw new Exception("Inscrição estadual deve ser maior que zero.");
        if (contato == null || contato.isEmpty()) 
            throw new Exception("Contato não pode ser vazio.");
        if (cnpj == null || !cnpj.matches("\\d{14}")) 
            throw new Exception("CNPJ inválido. Deve conter exatamente 14 dígitos.");
        if (endereco == null || endereco.isEmpty()) 
            throw new Exception("Endereço não pode ser vazio.");

        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

     public void addVeiculoProprietario(VeiculoProprietario veiculo) {
        veiculos.add(veiculo);
    }

    public List<VeiculoProprietario> getVeiculos() {
        return veiculos;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getInscricaoEstadunal() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadunal(int inscricaoEstadunal) {
        this.inscricaoEstadual = inscricaoEstadunal;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
