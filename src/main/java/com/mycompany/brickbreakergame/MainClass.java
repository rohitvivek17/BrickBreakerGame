package com.mycompany.brickbreakergame;

import javax.swing.JFrame;

/** @author VIVEK */
public class MainClass {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        GamePlay gamePlay=new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Brick Breaker Game"+"   "+"[Use Left & Right Arrow Keys]");
        
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}
