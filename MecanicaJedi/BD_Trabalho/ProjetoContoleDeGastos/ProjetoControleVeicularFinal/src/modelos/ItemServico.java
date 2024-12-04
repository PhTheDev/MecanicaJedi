/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author thiago.srodrigues
 */
public class ItemServico {
    private int idItemServico=0;
    private double valorUnitario=0;
    private double valorTotal=0;
    private Servicos servico;
    
    public ItemServico() {
    }

    public ItemServico(int idItemServico, double valorUnitario, double valorTotal, Servicos servico) throws Exception {
        if (idItemServico <= 0) throw new Exception("ID do item de serviço deve ser maior que zero.");
        if (valorUnitario <= 0) throw new Exception("Valor unitário inválido.");
        if (valorTotal <= 0) throw new Exception("Valor total inválido.");
        if (servico == null) throw new Exception("Serviço não pode ser nulo.");

        this.idItemServico = idItemServico;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.servico = servico;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }
    
    public int getIdItemServico() {
        return idItemServico;
    }

    public void setIdItemServico(int idItemServico) {
        this.idItemServico = idItemServico;
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
