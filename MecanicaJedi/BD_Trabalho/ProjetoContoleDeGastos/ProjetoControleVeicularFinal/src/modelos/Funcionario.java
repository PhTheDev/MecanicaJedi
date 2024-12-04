/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
//testea
/**
 *
 * @author thiago.srodrigues
 */
public class Funcionario {
    private int idFuncionario =0;
    private String cpf = "";
    private String nome = "";
    private String funcao = "";

    private Login login;

    public Funcionario() {}

    public Funcionario(int idFuncionario, String cpf, String nome, String funcao, Login login) throws Exception {
        if (idFuncionario <= 0) throw new Exception("ID do funcionário deve ser maior que zero.");
        if (cpf == null || !cpf.matches("\\d{11}")) throw new Exception("CPF inválido.");
        if (nome == null || nome.isEmpty() || nome.length() < 3) throw new Exception("Nome inválido.");
        if (funcao == null || funcao.isEmpty()) throw new Exception("Função não pode ser vazia.");
        if (login == null) throw new Exception("Login não pode ser nulo.");

        this.idFuncionario = idFuncionario;
        this.cpf = cpf;
        this.nome = nome;
        this.funcao = funcao;
        this.login = login;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
    
}
