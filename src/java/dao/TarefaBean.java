/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
/**
 *
 * @author haden
 * 
 * teste
 */
import entity.Carro;
import entity.Tarefa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TarefaBean {
     
    private Tarefa tarefa = new Tarefa();
    private List<Tarefa> listTarefas = new ArrayList<>();
    
    public void adicionar(){
        tarefa.setSituacao("Em andamento");
        listTarefas.add(tarefa);
        tarefa = new Tarefa();
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public List<Tarefa> getListTarefas() {
        return listTarefas;
    }

    public void setListTarefas(List<Tarefa> listTarefas) {
        this.listTarefas = listTarefas;
    }

 
 }
