/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.marinha.Controller;


import br.marinha.Parck;
import br.marinha.repository.ParckRepository;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import mar.mil.br.usuario.Usuario;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author junior
 */
@ManagedBean
@RequestScoped
public class ParckController {
    
    @EJB
    ParckRepository repository;
    
    private List<Parck>ps = new ArrayList<Parck>();
    private List<Parck>parckPorOm = new ArrayList<Parck>();
   // private Integer parckPorOmESO ;
    
    private Parck p = new Parck();
    String login = SecurityContextHolder.getContext().getAuthentication().getName();

    
    
    
        
    public String salvar(){
        if (p.getId() == null) {
            this.p.setCadastrante(login);
            Usuario u = repository.buscarModificador(login);
            this.p.setOm(u.getOm());
            this.repository.save(p);
            FacesMessage msg =  new FacesMessage("Cadastrado com sucesso!");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }else{
            this.repository.update(p);
            FacesMessage msg =  new FacesMessage("Alteração realizada com sucesso!");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        
        return "subordinadas/administracaoParck";
    }
    public String alterar(){
        return "cadastroParck";
    }
    
    public String excluir(){
        this.repository.excluir(p);
        this.ps = null;  
        FacesMessage msg =  new FacesMessage("Remoção realizada com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return null;
                       
    }  

    public List<Parck> getPs() {
        this.ps = this.repository.findAll();
        return ps;
    }

    public List<Parck> getParckPorOm() {
        Usuario u = repository.buscarModificador(login);
        String om = u.getOm();
        this.parckPorOm = repository.buscarPorOM(om);
        return parckPorOm;
    }

//    public Integer getParckPorOmESO() {
//        
//        Usuario u = repository.buscarModificador(login);
//        String om = u.getOm();
//        String sistemaOperacional = p.getSistemaOperacional();
//        this.parckPorOmESO = repository.buscarTotalSistemas(sistemaOperacional,om);
//        return parckPorOmESO;
//    }
    
    

    public Parck getP() {
        return p;
    }

    public void setP(Parck p) {
        this.p = p;
    }

    
    
    
    
}
