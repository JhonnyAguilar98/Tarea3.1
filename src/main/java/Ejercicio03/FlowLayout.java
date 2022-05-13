/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author HP OME
 */

public class FlowLayout extends JFrame{

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    
   public FlowLayout(String title) {
        super(title);
        this.setSize(400, 100);
        this.setLocation(500, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

   public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
   }
   
   public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       //this.jPanel1.setLayout(new java.awt.GridLayout(1,5));
       this.jPanel1.setBackground(Color.GRAY);
       //this.jPanel1 = new JPanel();
       //this.jPanel1.setBackground(Color.GRAY);
       //this.jPanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.setLayout(new java.awt.FlowLayout());
       
   }
   
   public void iniciarEtiquetas(){
       
       this.jLabelList = new ArrayList<>();
       for(var i=0;i<5;i++)
           this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(0).setText("Button 1");
       this.jLabelList.get(0).setBorder(BorderFactory.createLineBorder(Color.WHITE));
       this.jLabelList.get(0).setHorizontalAlignment(SwingConstants.CENTER);
       
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("2");
       this.jLabelList.get(1).setBorder(BorderFactory.createLineBorder(Color.WHITE));
       this.jLabelList.get(1).setHorizontalAlignment(SwingConstants.CENTER);
       
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("Button 3");
       this.jLabelList.get(2).setBorder(BorderFactory.createLineBorder(Color.WHITE));
       this.jLabelList.get(2).setHorizontalAlignment(SwingConstants.CENTER);
       
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("Long-Namend Button 4");
       this.jLabelList.get(3).setBorder(BorderFactory.createLineBorder(Color.WHITE));
       this.jLabelList.get(3).setHorizontalAlignment(SwingConstants.CENTER);
       
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("Button 5");
       this.jLabelList.get(4).setBorder(BorderFactory.createLineBorder(Color.WHITE));
       this.jLabelList.get(4).setHorizontalAlignment(SwingConstants.CENTER);
       
       for(var i=0;i<5;i++)
           this.jPanel1.add(this.jLabelList.get(i));
   }

   
}

