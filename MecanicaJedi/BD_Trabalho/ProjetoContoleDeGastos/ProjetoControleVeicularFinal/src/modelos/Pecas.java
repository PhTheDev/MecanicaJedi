/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author thiago.srodrigues
 */
public class Pecas {
    private int idPeca=0;
    private String descricao=null;
    private double valor=0;
    private int qtdEstoque =0;

    public Pecas() {
    }

    public Pecas(int idPeca, String descricao, double valor, int qtdEstoque)throws Exception{
        if(idPeca<=0) throw new Exception ("Erro ao validar idPeca");
        if(descricao==null) throw new Exception ("Insira uma descricao da Peça");
        if(valor<=0) throw new Exception ("Insira um valor válido para Peça");
        if(qtdEstoque<0) throw new Exception ("Impossivel quantidade de peça negativo");
        
        this.idPeca=idPeca;
        this.descricao=descricao;
        this.valor=valor;
        this.qtdEstoque=qtdEstoque;
    }
    
    public int getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    
   
}
