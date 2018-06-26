/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.jpa;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import duoc.cl.safe.entity.SsfExamen;
import duoc.cl.safe.entity.SsfFichamedica;
import duoc.cl.safe.entity.SsfUsuario;
import duoc.cl.safe.jpa.exceptions.NonexistentEntityException;
import duoc.cl.safe.jpa.exceptions.PreexistingEntityException;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Nacho
 */
public class SsfFichamedicaJpaController implements Serializable {

    public SsfFichamedicaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SsfFichamedica ssfFichamedica) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SsfExamen idExamen = ssfFichamedica.getIdExamen();
            if (idExamen != null) {
                idExamen = em.getReference(idExamen.getClass(), idExamen.getId());
                ssfFichamedica.setIdExamen(idExamen);
            }
            SsfUsuario idAtencionmedica = ssfFichamedica.getIdAtencionmedica();
            if (idAtencionmedica != null) {
                idAtencionmedica = em.getReference(idAtencionmedica.getClass(), idAtencionmedica.getId());
                ssfFichamedica.setIdAtencionmedica(idAtencionmedica);
            }
            em.persist(ssfFichamedica);
            if (idExamen != null) {
                idExamen.getSsfFichamedicaList().add(ssfFichamedica);
                idExamen = em.merge(idExamen);
            }
            if (idAtencionmedica != null) {
                idAtencionmedica.getSsfFichamedicaList().add(ssfFichamedica);
                idAtencionmedica = em.merge(idAtencionmedica);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSsfFichamedica(ssfFichamedica.getId()) != null) {
                throw new PreexistingEntityException("SsfFichamedica " + ssfFichamedica + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SsfFichamedica ssfFichamedica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SsfFichamedica persistentSsfFichamedica = em.find(SsfFichamedica.class, ssfFichamedica.getId());
            SsfExamen idExamenOld = persistentSsfFichamedica.getIdExamen();
            SsfExamen idExamenNew = ssfFichamedica.getIdExamen();
            SsfUsuario idAtencionmedicaOld = persistentSsfFichamedica.getIdAtencionmedica();
            SsfUsuario idAtencionmedicaNew = ssfFichamedica.getIdAtencionmedica();
            if (idExamenNew != null) {
                idExamenNew = em.getReference(idExamenNew.getClass(), idExamenNew.getId());
                ssfFichamedica.setIdExamen(idExamenNew);
            }
            if (idAtencionmedicaNew != null) {
                idAtencionmedicaNew = em.getReference(idAtencionmedicaNew.getClass(), idAtencionmedicaNew.getId());
                ssfFichamedica.setIdAtencionmedica(idAtencionmedicaNew);
            }
            ssfFichamedica = em.merge(ssfFichamedica);
            if (idExamenOld != null && !idExamenOld.equals(idExamenNew)) {
                idExamenOld.getSsfFichamedicaList().remove(ssfFichamedica);
                idExamenOld = em.merge(idExamenOld);
            }
            if (idExamenNew != null && !idExamenNew.equals(idExamenOld)) {
                idExamenNew.getSsfFichamedicaList().add(ssfFichamedica);
                idExamenNew = em.merge(idExamenNew);
            }
            if (idAtencionmedicaOld != null && !idAtencionmedicaOld.equals(idAtencionmedicaNew)) {
                idAtencionmedicaOld.getSsfFichamedicaList().remove(ssfFichamedica);
                idAtencionmedicaOld = em.merge(idAtencionmedicaOld);
            }
            if (idAtencionmedicaNew != null && !idAtencionmedicaNew.equals(idAtencionmedicaOld)) {
                idAtencionmedicaNew.getSsfFichamedicaList().add(ssfFichamedica);
                idAtencionmedicaNew = em.merge(idAtencionmedicaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = ssfFichamedica.getId();
                if (findSsfFichamedica(id) == null) {
                    throw new NonexistentEntityException("The ssfFichamedica with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(BigDecimal id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SsfFichamedica ssfFichamedica;
            try {
                ssfFichamedica = em.getReference(SsfFichamedica.class, id);
                ssfFichamedica.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ssfFichamedica with id " + id + " no longer exists.", enfe);
            }
            SsfExamen idExamen = ssfFichamedica.getIdExamen();
            if (idExamen != null) {
                idExamen.getSsfFichamedicaList().remove(ssfFichamedica);
                idExamen = em.merge(idExamen);
            }
            SsfUsuario idAtencionmedica = ssfFichamedica.getIdAtencionmedica();
            if (idAtencionmedica != null) {
                idAtencionmedica.getSsfFichamedicaList().remove(ssfFichamedica);
                idAtencionmedica = em.merge(idAtencionmedica);
            }
            em.remove(ssfFichamedica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<SsfFichamedica> findSsfFichamedicaEntities() {
        return findSsfFichamedicaEntities(true, -1, -1);
    }

    public List<SsfFichamedica> findSsfFichamedicaEntities(int maxResults, int firstResult) {
        return findSsfFichamedicaEntities(false, maxResults, firstResult);
    }

    private List<SsfFichamedica> findSsfFichamedicaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SsfFichamedica.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public SsfFichamedica findSsfFichamedica(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SsfFichamedica.class, id);
        } finally {
            em.close();
        }
    }

    public int getSsfFichamedicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SsfFichamedica> rt = cq.from(SsfFichamedica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
