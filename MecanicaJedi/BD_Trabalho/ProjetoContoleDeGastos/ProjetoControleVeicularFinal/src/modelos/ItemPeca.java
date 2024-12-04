package modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago.srodrigues
 */
public class ItemPeca {
    private int idItemPeca=0;
    private int quantidade=0;
    private double valorUnitario=0;
    private double valorTotal=0;

    private Pecas peca;

    public ItemPeca() {}

    public ItemPeca(int idItemPeca, int quantidade, double valorUnitario, double valorTotal, Pecas peca) throws Exception {
        if (idItemPeca <= 0) throw new Exception("ID do item de peça deve ser maior que zero.");
        if (quantidade <= 0) throw new Exception("Quantidade inválida.");
        if (valorUnitario <= 0) throw new Exception("Valor unitário inválido.");
        if (valorTotal <= 0) throw new Exception("Valor total inválido.");
        if (peca == null) throw new Exception("Peça não pode ser nula.");

        this.idItemPeca = idItemPeca;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.peca = peca;
    }

    public Pecas getPeca() {
        return peca;
    }

    public void setPeca(Pecas peca) {
        this.peca = peca;
    }
    
    public int getIdItemPeca() {
        return idItemPeca;
    }

    public void setIdItemPeca(int idItemPeca) {
        this.idItemPeca = idItemPeca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
