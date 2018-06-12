/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.herramientas;

<<<<<<< HEAD
import duoc.cl.safe.presentacion.evaluaciones.MantenedorEvaluacion;
=======
import duoc.cl.safe.presentacion.evaluaciones.FormularioEvaluacion;
import duoc.cl.safe.presentacion.evaluaciones.MantenedorEvaluacion;
import duoc.cl.safe.presentacion.evaluaciones.MantenedorEvaluacionEstado;
import duoc.cl.safe.presentacion.evaluaciones.MantenedorEvaluacionParametro;
import duoc.cl.safe.presentacion.evaluaciones.MantenedorEvaluacionTipo;
import duoc.cl.safe.presentacion.evaluaciones.MantenedorParametro;
>>>>>>> Ignacio
import duoc.cl.safe.presentacion.perfiles.MantenedorMenu;
import duoc.cl.safe.presentacion.perfiles.MantenedorPerfil;
import duoc.cl.safe.presentacion.perfiles.MantenedorPerfilVistas;
import duoc.cl.safe.presentacion.perfiles.MantenedorVistas;
import duoc.cl.safe.presentacion.usuarios.Login;
import duoc.cl.safe.presentacion.usuarios.MantenedorEmpresa;
<<<<<<< HEAD
=======
import duoc.cl.safe.presentacion.usuarios.MantenedorPersona;
>>>>>>> Ignacio
import duoc.cl.safe.presentacion.usuarios.MantenedorUsuario;

/**
 *
 * @author yerko
 */
public class FormsController {

    private int idVista;
    private Menu menu;

    public FormsController(int idVista, Menu menu) {
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
<<<<<<< HEAD
    
    
    public void abrirJframe(){
<<<<<<< HEAD
        if(idVista == 2){
=======
        if(idVista == 2 || idVista == 61){
>>>>>>> Ignacio
=======

    public void abrirJframe() {
        if (idVista == 2 || idVista == 61) {
>>>>>>> Ignacio
            MantenedorUsuario mpf = new MantenedorUsuario();
            mpf.setFormsController(this);
            mpf.setVisible(true);
        }
<<<<<<< HEAD
        if(idVista == 5){
=======
        if (idVista == 3) {
            MantenedorEvaluacionTipo mantenedorEvTipo = new MantenedorEvaluacionTipo();
            mantenedorEvTipo.setFormsController(this);
            mantenedorEvTipo.setVisible(true);
        }
        if (idVista == 70) {
            MantenedorEvaluacionParametro mantenedorEvParametro = new MantenedorEvaluacionParametro();
            mantenedorEvParametro.setFormsController(this);
            mantenedorEvParametro.setVisible(true);
        }
<<<<<<< HEAD
        if(idVista == 5 || idVista == 63){
>>>>>>> Ignacio
=======
        if (idVista == 5 || idVista == 63) {
>>>>>>> Ignacio
            MantenedorEmpresa mpp = new MantenedorEmpresa();
            mpp.setFormsController(this);
            mpp.setVisible(true);
        }
<<<<<<< HEAD
<<<<<<< HEAD
        if(idVista == 21){
=======
        if(idVista == 21 || idVista == 65){
>>>>>>> Ignacio
=======
        if (idVista == 21 || idVista == 65) {
>>>>>>> Ignacio
            MantenedorPerfil mpp = new MantenedorPerfil();
            mpp.setFormsController(this);
            mpp.setVisible(true);
        }
<<<<<<< HEAD
<<<<<<< HEAD
        if(idVista == 41){
            MantenedorEvaluacion mantendorEvualcion = new MantenedorEvaluacion();
            mantendorEvualcion.setFormsController(this);
            mantendorEvualcion.setVisible(true);
        }
        if(idVista == 42){
=======
        if(idVista == 41 || idVista == 1){
=======
        if (idVista == 41 || idVista == 1) {
>>>>>>> Ignacio
            MantenedorEvaluacion mantenedorEv = new MantenedorEvaluacion();
            mantenedorEv.setFormsController(this);
            mantenedorEv.setVisible(true);
        }
<<<<<<< HEAD
        if(idVista == 42 || idVista == 64){
>>>>>>> Ignacio
=======
        if (idVista == 42 || idVista == 64) {
>>>>>>> Ignacio
            MantenedorMenu mantendorMenu = new MantenedorMenu();
            mantendorMenu.setFormsController(this);
            mantendorMenu.setVisible(true);
        }
<<<<<<< HEAD
<<<<<<< HEAD
        if(idVista == 43){
=======
        if(idVista == 43 || idVista == 67){
>>>>>>> Ignacio
=======
        if (idVista == 43 || idVista == 67) {
>>>>>>> Ignacio
            MantenedorVistas mantendoVistas = new MantenedorVistas();
            mantendoVistas.setFormsController(this);
            mantendoVistas.setVisible(true);
        }
<<<<<<< HEAD
<<<<<<< HEAD
        if(idVista == 44){
=======
        if(idVista == 44 || idVista == 66){
>>>>>>> Ignacio
=======
        if (idVista == 44 || idVista == 66) {
>>>>>>> Ignacio
            MantenedorPerfilVistas mantendoPerfilesVistas = new MantenedorPerfilVistas();
            mantendoPerfilesVistas.setFormsController(this);
            mantendoPerfilesVistas.setVisible(true);
        }
<<<<<<< HEAD
<<<<<<< HEAD
        if(idVista == 45){
            Login login = new Login();
            login.setVisible(true);
        }
=======
        if(idVista == 45 || idVista == 81){
=======
        if (idVista == 45 || idVista == 81) {
>>>>>>> Ignacio
            Login login = new Login();
            login.setVisible(true);
        }
        if (idVista == 62) {
            MantenedorPersona mantenedorPersona = new MantenedorPersona();
            mantenedorPersona.setFormsController(this);
            mantenedorPersona.setVisible(true);
        }
        if (idVista == 68) {
            FormularioEvaluacion formularioEv = new FormularioEvaluacion();
            formularioEv.setFormsController(this);
            formularioEv.setVisible(true);
        }
        if (idVista == 69) {
            MantenedorEvaluacionEstado mantenedorEstadoEv = new MantenedorEvaluacionEstado();
            mantenedorEstadoEv.setFormsController(this);
            mantenedorEstadoEv.setVisible(true);
        }
        if (idVista == 4) {
            MantenedorParametro mantenedorParametro = new MantenedorParametro();
            mantenedorParametro.setFormsController(this);
            mantenedorParametro.setVisible(true);
        }
>>>>>>> Ignacio
    }
}
