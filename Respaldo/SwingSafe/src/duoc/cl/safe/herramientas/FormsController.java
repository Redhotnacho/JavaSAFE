/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.herramientas;

import duoc.cl.safe.forms.MantenedorEmpresa;
import duoc.cl.safe.forms.MantenedorPerfil;
import duoc.cl.safe.forms.MantenedorUsuario;

/**
 *
 * @author yerko
 */
public class FormsController {
    private int idVista;
    private Menu menu;

    public FormsController(int idVista,Menu menu) {
        this.menu = menu;
        this.idVista = idVista;
    }      
    
    public int getIdVista() {
        return idVista;
    }

    public void setIdVista(int idVista) {
        this.idVista = idVista;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    
    public void abrirJframe(){
        System.out.println(idVista);
        if(idVista == 2){
            MantenedorUsuario mpf = new MantenedorUsuario();
            mpf.setFormsController(this);
            mpf.setVisible(true);
        }
        if(idVista == 5){
            MantenedorEmpresa mpp = new MantenedorEmpresa();
            mpp.setFormsController(this);
            mpp.setVisible(true);
        }
        if(idVista == 21){
            MantenedorPerfil mpp = new MantenedorPerfil();
            mpp.setFormsController(this);
            mpp.setVisible(true);
        }
    }
}
