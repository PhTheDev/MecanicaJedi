/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author thiago.srodrigues
 */

public class OrdemDeServico {
    private int idOS;
    private String status;
    private Date data;
    private double valorTotalOS;
   
    private List<ItemServico> itensServico = new ArrayList<>();
    private List<ItemPeca> itensPeca = new ArrayList<>();
    
    // Construtor padrão
    public OrdemDeServico() {
    }

    // Construtor com validações
    public OrdemDeServico(int idOS, String status, Date data, double valorTotalOS) throws Exception {
        setIdOS(idOS);
        setStatus(status);
        setData(data);
        setValorTotalOS(valorTotalOS);
    }

    public void addItemServico(ItemServico item) {
        itensServico.add(item);
    }

    public void addItemPeca(ItemPeca item) {
        itensPeca.add(item);
    }

    public List<ItemServico> getItensServico() {
        return itensServico;
    }

    public List<ItemPeca> getItensPeca() {
        return itensPeca;
    }
    
    // Getters e Setters com validações
    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) throws Exception {
        if (idOS <= 0) {
            throw new Exception("ID da OS deve ser maior que zero.");
        }
        this.idOS = idOS;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws Exception {
        if (status == null || status.isEmpty()) {
            throw new Exception("Status não pode ser vazio ou nulo.");
        }
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) throws Exception {
        if (data == null) {
            throw new Exception("Data não pode ser nula.");
        }
        this.data = data;
    }

    public double getValorTotalOS() {
        return valorTotalOS;
    }

    public void setValorTotalOS(double valorTotalOS) throws Exception {
        if (valorTotalOS < 0) {
            throw new Exception("O valor total da OS não pode ser negativo.");
        }
        this.valorTotalOS = valorTotalOS;
    }

    // Método para exibir informações da OS
    @Override
    public String toString() {
        return "OrdemDeServico{" +
                "idOS=" + idOS +
                ", status='" + status + '\'' +
                ", data=" + data +
                ", valorTotalOS=" + valorTotalOS +
                '}';
    }
}

