
package rh.controlo;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import rh.modelo.Departamento;
import dao.DepartamentoDAO;


@Named(value = "departamentoCDIBean")
@RequestScoped
public class DepartamentoCDIBean {

    Departamento departamento = new Departamento();
    DepartamentoDAO dao = new DepartamentoDAO();
    
    
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
    
    
    
}
