/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author HP OMEN
 */
public class Bandera extends JFrame{
    
    private JPanel jPanel1;
    private JPanel jPanelBandera;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelBanderaList;
     
   public Bandera (String title) {
        super(title);
        this.setSize(400, 200);
        this.setLocation(250, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

   public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarBandera();
        this.iniciarEtiquetas();
   }
   
   public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.WHITE);
       this.jPanel1.setLayout(new BorderLayout());
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       for(var i=0;i<6;i++){
           this.jLabelList.add(new JLabel());
           this.jLabelList.get(i).setHorizontalAlignment(SwingConstants.CENTER);
           this.jLabelList.get(i).setBorder(BorderFactory.createTitledBorder(""));
           this.jLabelList.get(i).setOpaque(true);
       }
       
       
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setText("Button1");
       this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
       
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setText("Long-Named Button 4");    
       this.jPanel1.add(this.jLabelList.get(1),BorderLayout.SOUTH);
       
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setText("Button 5");      
       this.jPanel1.add(this.jLabelList.get(2),BorderLayout.EAST);
       
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setText("2");
       this.jPanel1.add(this.jPanelBandera,BorderLayout.CENTER);
       
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setText("Button 3");      
       this.jPanel1.add(this.jLabelList.get(4),BorderLayout.WEST);
       
   }
   
   public void iniciarBandera(){
       this.jPanelBandera = new JPanel();
       this.jPanelBandera.setLayout(new java.awt.GridLayout(5,8));
       this.jLabelBanderaList = new ArrayList<>();
       
       for(var i=0;i<40;i++){
           this.jLabelBanderaList.add(new JLabel());
           this.jLabelBanderaList.get(i).setOpaque(true);
       }     
       
       this.jLabelBanderaList.get(0).setBackground(Color.RED);
       this.jLabelBanderaList.get(0).setOpaque(true);
       this.jLabelBanderaList.get(1).setBackground(Color.RED);
       this.jLabelBanderaList.get(1).setOpaque(true);
       this.jLabelBanderaList.get(2).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(2).setOpaque(true);
       this.jLabelBanderaList.get(3).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(3).setOpaque(true);
       this.jLabelBanderaList.get(4).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(4).setOpaque(true);
       this.jLabelBanderaList.get(5).setBackground(Color.RED);
       this.jLabelBanderaList.get(5).setOpaque(true);
       this.jLabelBanderaList.get(6).setBackground(Color.RED);
       this.jLabelBanderaList.get(6).setOpaque(true);
       this.jLabelBanderaList.get(7).setBackground(Color.RED);
       this.jLabelBanderaList.get(7).setOpaque(true);
       this.jLabelBanderaList.get(8).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(8).setOpaque(true);
       this.jLabelBanderaList.get(9).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(9).setOpaque(true);
       this.jLabelBanderaList.get(10).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(10).setOpaque(true);
       this.jLabelBanderaList.get(11).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(11).setOpaque(true);
       this.jLabelBanderaList.get(12).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(12).setOpaque(true);
       this.jLabelBanderaList.get(13).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(13).setOpaque(true);
       this.jLabelBanderaList.get(14).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(14).setOpaque(true);
       this.jLabelBanderaList.get(15).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(15).setOpaque(true);
       this.jLabelBanderaList.get(16).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(16).setOpaque(true);
       this.jLabelBanderaList.get(17).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(17).setOpaque(true);
       this.jLabelBanderaList.get(18).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(18).setOpaque(true);
       this.jLabelBanderaList.get(19).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(19).setOpaque(true);
       this.jLabelBanderaList.get(20).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(20).setOpaque(true);
       this.jLabelBanderaList.get(21).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(21).setOpaque(true);
       this.jLabelBanderaList.get(22).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(22).setOpaque(true);
       this.jLabelBanderaList.get(23).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(23).setOpaque(true);
       this.jLabelBanderaList.get(24).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(24).setOpaque(true);
       this.jLabelBanderaList.get(25).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(25).setOpaque(true);
       this.jLabelBanderaList.get(26).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(26).setOpaque(true);
       this.jLabelBanderaList.get(27).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(27).setOpaque(true);
       this.jLabelBanderaList.get(28).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(28).setOpaque(true);
       this.jLabelBanderaList.get(29).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(29).setOpaque(true);
       this.jLabelBanderaList.get(30).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(30).setOpaque(true);
       this.jLabelBanderaList.get(31).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(31).setOpaque(true);
       this.jLabelBanderaList.get(32).setBackground(Color.RED);
       this.jLabelBanderaList.get(32).setOpaque(true);
       this.jLabelBanderaList.get(33).setBackground(Color.RED);
       this.jLabelBanderaList.get(33).setOpaque(true);
       this.jLabelBanderaList.get(34).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(34).setOpaque(true);
       this.jLabelBanderaList.get(35).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(35).setOpaque(true);
       this.jLabelBanderaList.get(36).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(36).setOpaque(true);
       this.jLabelBanderaList.get(37).setBackground(Color.RED);
       this.jLabelBanderaList.get(37).setOpaque(true);
       this.jLabelBanderaList.get(38).setBackground(Color.RED);
       this.jLabelBanderaList.get(38).setOpaque(true);
       this.jLabelBanderaList.get(39).setBackground(Color.RED);
       this.jLabelBanderaList.get(39).setOpaque(true);
       
       for(var i=0;i<40;i++)
           this.jPanelBandera.add(this.jLabelBanderaList.get(i));
           
        }         
    
}