package modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago.srodrigues
 */
public class Acessorio {
    private int idAcessorio = 0;
    private String nomeAcessorio = null;
    private String descricao = null;

    public Acessorio() {
    }
    
    public Acessorio(int idAcessorio, String nomeAcessorio, String descricao)throws Exception{
        if (idAcessorio <= 0) throw new Exception("ID do Acessorio deve ser maior que zero.");
        if (nomeAcessorio == null || nomeAcessorio.length()!=7) throw new Exception("Insira um nome do acessório");
        this.idAcessorio = idAcessorio;
        this.nomeAcessorio = nomeAcessorio;
        this.descricao = descricao;
    }

    public int getIdAcessorio() {
        return idAcessorio;
    }

    public void setIdAcessorio(int idAcessorio) {
        this.idAcessorio = idAcessorio;
    }

    public String getNomeAcessorio() {
        return nomeAcessorio;
    }

    public void setNomeAcessorio(String nomeAcessorio) {
        this.nomeAcessorio = nomeAcessorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
