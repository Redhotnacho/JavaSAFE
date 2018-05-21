/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.presentacion;

import duoc.cl.safe.entity.SsfMenu;
import duoc.cl.safe.entity.SsfVista;
import duoc.cl.safe.negocio.SsfMenuBO;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author yerko
 */
public class Menu {
    
    private JMenuBar menuBar;
    private JMenu menu, submenu;
    private JMenuItem menuItem;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;

    public Menu() {
    } 
    
    public JMenuBar menu(int perfil_id){
        SsfMenuBO menubo = new SsfMenuBO();
        List<SsfMenu> menuList = menubo.getAllSP();
        
        menuBar = new JMenuBar();
        
        for (SsfMenu ssfmenu : menuList) {
            menu = new JMenu(ssfmenu.getNombre());
            
            for (SsfVista ssfvista : ssfmenu.getSsfVistaList()) {
                menuItem = new JMenuItem(new AbstractAction(ssfvista.getNombre()){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("Clicked Action Menu item");
                    }
                });
                menu.add(menuItem);
            }
            menuBar.add(menu);
        }        
        return this.menuBar;
        

        //Build the first menu.
        
        //menu.setMnemonic(KeyEvent.VK_A);
//        menu.getAccessibleContext().setAccessibleDescription(
//                "The only menu in this program that has menu items");
       
        
        //a group of JMenuItems
//        menuItem = new JMenuItem(new AbstractAction("Menu Item Clickeable"){
//            public void actionPerformed(ActionEvent e){
//                System.out.println("Clicked Action Menu item");
//            }
//        });
//        menuItem.setAccelerator(KeyStroke.getKeyStroke( //acceso rapido
//                KeyEvent.VK_1, ActionEvent.ALT_MASK));
//        menuItem.getAccessibleContext().setAccessibleDescription(
//                "This doesn't really do anything");
//        menu.add(menuItem);
//        menu.addSeparator();
//        menuItem = new JMenuItem("Both text and icon"/*,new ImageIcon("images/middle.gif")*/);
//        menuItem.setMnemonic(KeyEvent.VK_B);
//        menu.add(menuItem);
//
//        menuItem = new JMenuItem("Prueba"/*new ImageIcon("images/middle.gif")*/);
//        menuItem.setMnemonic(KeyEvent.VK_D);
//        menu.add(menuItem);
//        
//        
//        //a submenu
//        menu.addSeparator();
//        submenu = new JMenu("A submenu");
//        submenu.setMnemonic(KeyEvent.VK_S);
//
//        menuItem = new JMenuItem("An item in the submenu");
//        menuItem.setAccelerator(KeyStroke.getKeyStroke(
//                KeyEvent.VK_2, ActionEvent.ALT_MASK));
//        submenu.add(menuItem);
//
//        menuItem = new JMenuItem("Another item");
//        submenu.add(menuItem);
//        menu.add(submenu);
        
        
    }
}
