/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practico6Lab1c2.entidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;



/**
 *
 * @author jez_3
 */
public class EscritorioPersonalizado extends JDesktopPane {
    private BufferedImage img;

    public EscritorioPersonalizado() {
        try{
        img = ImageIO.read(getClass().getResourceAsStream("/imagen/Supermercado.jpg/"));
        }catch(Exception ex){
        ex.printStackTrace();
        }
    }
    @Override
     public void paintComponent(Graphics g){
     super.paintComponent(g);
     g.drawImage(img, 0, 0, 400, 280, null);
     }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
    
    
}
