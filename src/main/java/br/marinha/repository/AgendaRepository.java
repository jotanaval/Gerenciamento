/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.marinha.repository;

import br.marinha.Agenda;
import br.marinha.Dao.GenericDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author junior
 */
@Stateless
public class AgendaRepository extends GenericDao<Agenda>{

    public AgendaRepository() {
        super(Agenda.class);
    }
    
     public void excluir(Agenda Agenda) {
        Agenda Agendadb = manager.find(Agenda.class, Agenda.getId());// precisa desatachar o objeto para que a exlusão ocorra
		this.manager.remove(Agendadb);
    }
     
     public List<Agenda> findAllPorDatas() {
        Query query = manager.createQuery("select a from Agenda a order by  a.id DESC  ", Agenda.class);
         return query.getResultList();
    }
    
    
}
