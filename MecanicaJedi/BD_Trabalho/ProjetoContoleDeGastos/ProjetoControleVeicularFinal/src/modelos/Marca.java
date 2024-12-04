/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author thiago.srodrigues
 */
public class Marca {
    private int idMarca=0;
    private String nome=null;

    public Marca() {
    }
    
    public Marca(int idMarca, String nome)throws Exception{
        if(idMarca<=0) throw new Exception("ID da marca inválido");
        if(nome==null) throw new Exception ("Insira o nome da marca");
        
        this.idMarca=idMarca;
        this.nome=nome;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
