package com.globant.twitter.entity;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name = "TwitterFacade", mappedName = "TwitterADF_v2-Model-TwitterFacade")
public class TwitterFacadeBean implements TwitterFacade, TwitterFacadeLocal {
    @PersistenceContext(unitName="Model")
    private EntityManager em;

    public TwitterFacadeBean() {
    }

    public Object queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public MentionsBean persistMentionsBean(MentionsBean mentionsBean) {
        em.persist(mentionsBean);
        return mentionsBean;
    }

    public MentionsBean mergeMentionsBean(MentionsBean mentionsBean) {
        return em.merge(mentionsBean);
    }

    public void removeMentionsBean(MentionsBean mentionsBean) {
        mentionsBean = em.find(MentionsBean.class, mentionsBean.getId());
        em.remove(mentionsBean);
    }

    /** <code>select o from MentionsBean o</code> */
    public List<MentionsBean> getMentionsBeanFindAll() {
        return em.createNamedQuery("MentionsBean.findAll").getResultList();
    }

    /** <code>select o from Graph_v1 o</code> */
    public List<Graph_v1> getGraph_v1FindAllNamed() {
        return em.createNamedQuery("Graph_v1.findAllNamed").getResultList();
    }
}
