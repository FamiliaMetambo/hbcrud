package modelo;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Makhene
 */
@Entity
public class Pessoa implements Serializable{
    
    private String nome;
    private int idade;
    @Temporal(TemporalType.DATE)
    private Date dataDeNacimento;
//    @Id
//    @GeneratedValue
//    private Integer id;
    @Id
    @GeneratedValue
    private Integer id;

    public Pessoa(String nome, int idade, Date dataDeNacimento) {
        this.nome = nome;
        this.idade = idade;
        this.dataDeNacimento = dataDeNacimento;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataDeNacimento() {
        return dataDeNacimento;
    }

    public void setDataDeNacimento(Date dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
}
