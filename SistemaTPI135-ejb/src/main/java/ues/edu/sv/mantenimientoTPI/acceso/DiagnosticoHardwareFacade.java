/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.mantenimientoTPI.acceso;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ues.edu.sv.tpi135.entidades.DiagnosticoHardware;

/**
 *
 * @author kevin
 */
@Stateless
public class DiagnosticoHardwareFacade extends AbstractFacade<DiagnosticoHardware> implements DiagnosticoHardwareFacadeLocal {

    @PersistenceContext(unitName = "ues.edu.sv.tpi135_SistemaTPI135-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiagnosticoHardwareFacade() {
        super(DiagnosticoHardware.class);
    }
    
}
