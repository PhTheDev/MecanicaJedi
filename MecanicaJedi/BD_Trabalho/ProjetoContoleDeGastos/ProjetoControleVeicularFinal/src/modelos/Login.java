/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 * Classe que representa o Login do sistema.
 */
public class Login {
    private String login;
    private String senha;
    private String tipoUsuario;

    // Construtor padrão
    public Login() {}

    // Construtor com validações
    public Login(String login, String senha, String tipoUsuario) throws Exception {
        setLogin(login);
        setSenha(senha);
        setTipoUsuario(tipoUsuario);
    }

    // Getters e Setters com validações
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws Exception {
        if (login == null || login.isEmpty()) {
            throw new Exception("Login não pode ser vazio ou nulo.");
        }
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if (senha == null || senha.length() < 6) {
            throw new Exception("Senha deve ter pelo menos 6 caracteres.");
        }
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) throws Exception {
        if (tipoUsuario == null || tipoUsuario.isEmpty()) {
            throw new Exception("Tipo de usuário não pode ser vazio ou nulo.");
        }
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Login{" +
                "login='" + login + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}

