/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh.controlo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import rh.modelo.Funcionario;

/**
 *
 * @author Ary
 */
@Named(value = "funcionarioCDIBean")
@RequestScoped
public class FuncionarioCDIBean {

    Funcionario funcionario1 = new Funcionario("Mário","Novais","Informática",40,77000.00);
    Funcionario funcionario2 = new Funcionario("Pedro","Silva","Gestor",40,77000.00);
    Funcionario funcionario3 = new Funcionario("Walter","Miranda","Contabilidade",40,77000.00);
    
    //Funcionario(String nome, String sobrenome, String departamento, int idade, double salario)
    List<Funcionario> funcionarios = new ArrayList<>();
    
    @PostConstruct
    public void init(){
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);                
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
}
