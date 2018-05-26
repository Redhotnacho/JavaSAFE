/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.herramientas;

import duoc.cl.safe.presentacion.evaluaciones.MantenedorEvaluacion;
import duoc.cl.safe.presentacion.perfiles.MantenedorMenu;
import duoc.cl.safe.presentacion.perfiles.MantenedorPerfil;
import duoc.cl.safe.presentacion.perfiles.MantenedorPerfilVistas;
import duoc.cl.safe.presentacion.perfiles.MantenedorVistas;
import duoc.cl.safe.presentacion.usuarios.Login;
import duoc.cl.safe.presentacion.usuarios.MantenedorEmpresa;
import duoc.cl.safe.presentacion.usuarios.MantenedorUsuario;

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
        if(idVista == 41){
            MantenedorEvaluacion mantendorEvualcion = new MantenedorEvaluacion();
            mantendorEvualcion.setFormsController(this);
            mantendorEvualcion.setVisible(true);
        }
        if(idVista == 42){
            MantenedorMenu mantendorMenu = new MantenedorMenu();
            mantendorMenu.setFormsController(this);
            mantendorMenu.setVisible(true);
        }
        if(idVista == 43){
            MantenedorVistas mantendoVistas = new MantenedorVistas();
            mantendoVistas.setFormsController(this);
            mantendoVistas.setVisible(true);
        }
        if(idVista == 44){
            MantenedorPerfilVistas mantendoPerfilesVistas = new MantenedorPerfilVistas();
            mantendoPerfilesVistas.setFormsController(this);
            mantendoPerfilesVistas.setVisible(true);
        }
        if(idVista == 45){
            Login login = new Login();
            login.setVisible(true);
        }
    }
}
