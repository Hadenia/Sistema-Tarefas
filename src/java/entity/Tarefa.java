/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author hadenia
 */
@Entity
@Table (name = "tb_tarefa")
@ManagedBean
@SessionScoped
public class Tarefa implements Serializable {
   
    public static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable = false)
    private Long id;     
    
    @Column
    private String titulo;
    
    @Column
    private String descricao;
    
    @Column
    private String responsavel;
    
    @Column
    private String prioridade;
    
    @Column
    private String deadline;
    
    @Column
    private String situacao;

    public Tarefa() {
    }

    public Tarefa(Long id, String titulo, String descricao, String responsavel, String prioridade, String deadline, String situacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.deadline = deadline;
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", responsavel=" + responsavel + ", prioridade=" + prioridade + ", deadline=" + deadline + ", situacao=" + situacao + '}';
    }      
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
}
