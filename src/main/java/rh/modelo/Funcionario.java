
package rh.modelo;

import java.util.Date;


public class Funcionario {
    
    String nome;
    String sobrenome;    
    private Departamento departamento;
    private Date dataNascimento;
    private double salario;    
    private String casa;
    private String rua;
    private String bairro;
    private Municipio municipio;
    

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String departamento, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        //this.departamento = departamento;
        this.salario = salario;
    }

    public Funcionario(String nome, String sobrenome, String departamento, double salario, String casa, String rua, String bairro, String municipio) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        //this.departamento = departamento;
        this.salario = salario;
        this.casa = casa;
        this.rua = rua;
        this.bairro = bairro;
        //this.municipio = municipio;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    
    
    
    
}
