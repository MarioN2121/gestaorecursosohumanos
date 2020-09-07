
package rh.controlo;

import dao.FuncionarioDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import rh.modelo.Funcionario;

/**
 *
 * @author Ary
 */
@Named(value = "funcionarioCDIBean")
@SessionScoped
public class FuncionarioCDIBean implements Serializable{

    Funcionario funcionario1 = new Funcionario("Mário","Novais","Informática",77000.00);
    Funcionario funcionario2 = new Funcionario("Pedro","Silva","Gestor",77000.00);
    Funcionario funcionario3 = new Funcionario("Walter","Miranda","Contabilidade",77000.00);
    
        
    Funcionario funcionario = new Funcionario(); 
    FuncionarioDAO dao = new FuncionarioDAO();
    
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
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    /*
    public String guardar(){
        funcionarios.add(funcionario);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        funcionario = new Funcionario();
        String meuNome="Mário Novais";
        //criação da mensagem
        FacesMessage faceMessage=new FacesMessage(null, "Funcionario Guardado com sucesso!"+" "+meuNome);
        facesContext.addMessage(null, faceMessage);
        
        return "lista-funcionarios";
    }*/

    
     public String save(){
        dao.save(funcionario);
        funcionario = new Funcionario();
        return "funcionario";
    }
    
    
    
    
}
