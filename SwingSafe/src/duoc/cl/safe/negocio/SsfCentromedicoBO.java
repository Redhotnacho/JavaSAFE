/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.negocio;

import duoc.cl.safe.entity.SsfCentromedico;
import duoc.cl.safe.persistencia.SsfCentromedicoDAO;
import java.util.List;

/**
 *
 * @author Nacho
 */
public class SsfCentromedicoBO {
    private SsfCentromedicoDAO centromedicoDAO;

    public SsfCentromedicoBO() {
        this.centromedicoDAO = new SsfCentromedicoDAO();
    }
    
    public boolean add(SsfCentromedico centromedico){
        return this.centromedicoDAO.add(centromedico);
    }
    
    public boolean update(SsfCentromedico centromedico){
        return this.centromedicoDAO.update(centromedico);
    }
    
    public boolean remove(int id){
        return this.centromedicoDAO.remove(id);
    }
    
    public SsfCentromedico find(int id){
        return this.centromedicoDAO.find(id);
    }
    
    public List<SsfCentromedico> getAll(){
        return this.centromedicoDAO.getAll();
    }
}
