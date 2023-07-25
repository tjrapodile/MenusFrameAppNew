/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class MenusFrame extends JFrame{
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu viewMenu;
    private JMenu editorsViewSubMenu;
    private JMenu splitViewSubMenu;
    
    private JMenuItem newProjectMenuItem;
    private JMenuItem newFileMenuItem;
    private JMenuItem openProjectMenuItem;
    private JMenuItem openRecentProjectMenuItem;
    private JMenuItem closeAllProjectMenuItem;
    
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;
    
    private JMenuItem sourceMenuItem;
    
    private JMenuItem horizontalMenuItem;
    private JMenuItem verticalMenuItem;
    private JMenuItem clearMenuItem;
    
    public MenusFrame(){
        setTitle("Menus Frame");
        setSize(700,800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        menuBar = new JMenuBar();
        
        fileMenu= new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        editorsViewSubMenu = new JMenu("Editors");
        splitViewSubMenu = new JMenu("Split");
        
        newProjectMenuItem = new JMenuItem("New Project");
        newFileMenuItem = new JMenuItem("New File");
        openProjectMenuItem = new JMenuItem("Open Project");
        openRecentProjectMenuItem = new JMenuItem("Open Recent Project");
        closeAllProjectMenuItem = new JMenuItem("Close All Projects");
        
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cut", new ImageIcon("images/cut.png"));
        copyMenuItem = new JMenuItem("Copy", new ImageIcon("images/copy.png"));
        pasteMenuItem = new JMenuItem("Paste", new ImageIcon("images/paste.png"));
        
        sourceMenuItem = new JMenuItem("Source");
        editorsViewSubMenu.add(sourceMenuItem);
        
        horizontalMenuItem = new JMenuItem("Horizontal");
        verticalMenuItem = new JMenuItem("Vertical");
        clearMenuItem = new JMenuItem("Clear");
        splitViewSubMenu.add(horizontalMenuItem);
        splitViewSubMenu.add(verticalMenuItem);
        splitViewSubMenu.add(clearMenuItem);
        
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentProjectMenuItem);
        fileMenu.add(closeAllProjectMenuItem);
        
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        
        viewMenu.add(editorsViewSubMenu);
        viewMenu.add(splitViewSubMenu);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        setJMenuBar(menuBar);
        
        setVisible(true);
      
    }
}
