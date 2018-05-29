/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.marinha.repository;

import br.marinha.Dao.GenericDao;
import br.marinha.Parck;
import java.util.List;
import javax.ejb.Stateless;
import mar.mil.br.usuario.Usuario;

/**
 *
 * @author junior
 */
@Stateless
public class ParckRepository extends GenericDao<Parck>{

    public ParckRepository() {
        super(Parck.class);
    }

    public void excluir(Parck p) {
        Parck pdb = manager.find(Parck.class, p.getId());// precisa desatachar o objeto para que a exlusão ocorra
		this.manager.remove(pdb);
    }

    public Usuario buscarModificador(String login) {
        String jpql = "select u from Usuario u where u.login =:login";
            return this.manager
                       .createQuery(jpql, Usuario.class)
                    .setParameter("login", login)
                    .getSingleResult();
    }
    public List<Parck> buscarPorOM(String om) {
        String jpql = "select p from Parck p where p.om =:om";
            return this.manager
                    .createQuery(jpql, Parck.class)
                    .setParameter("om", om)
                    .getResultList();
    }
    //RELATÓRIOS 
    
    public Integer buscarTotalSistemas(String sistemaOperacional, String om) {
        String jpql = "select COUT(p.sistemaOperacional) from Parck p where p.sistemaOperacional =:sistemaOperacional and p.om =: om";
            return this.manager
                    .createQuery(jpql, Usuario.class)
                    .setParameter("sistemaOperacional", sistemaOperacional)
                    .setParameter("om", om)
                    .getFirstResult();
    }
}
