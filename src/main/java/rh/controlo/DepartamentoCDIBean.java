
package rh.controlo;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import rh.modelo.Departamento;
import dao.DepartamentoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;


@Named(value = "departamentoCDIBean")
@RequestScoped
public class DepartamentoCDIBean {

    Departamento departamento;// = new Departamento();
    DepartamentoDAO dao = new DepartamentoDAO();
    
    List<Departamento> departamentos = new ArrayList<>();
    
    @PostConstruct
    public void init(){
        departamento = new Departamento();
        departamentos = new ArrayList<>();
        departamentos = dao.listaDepartamentos();
    }
    
    public String save(){
        dao.save(departamento);
        departamento = new Departamento();
        return "departamento";
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Departamento> getDepartamentos() {
       return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;        
    }
    
    
    
    
}
