/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author thiago.srodrigues
 */
public class Modelo {
    private int idModelo=0;
    private String descricao=null;

    public Modelo() {
    }

    public Modelo(int idModelo, String descricao)throws Exception{
        if(idModelo<=0)throw new Exception("Falha ao obter idModelo");
        if(descricao==null)throw new Exception("Insira uma descrição para modelo");
        this.idModelo=idModelo;
        this.descricao=descricao;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
   
}
