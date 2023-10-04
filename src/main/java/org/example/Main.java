package org.example;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        Main mainBank = new Main();
        mainBank.run();
    }

    public void run() {
        JFrame bankFrame = new JFrame();
        JButton button = new JButton("Swag");

        bankFrame.setSize(600, 800); //Sets frame window size
        bankFrame.setLayout(null); //Using no layout managers
        bankFrame.setVisible(true); // Makes frame visible
        bankFrame.setResizable(false);

        //Set the x-axis and y-axis, width, and height
        button.setBounds(250, 100, 100, 40);

        //Add button to JFrame
        bankFrame.add(button);


    }



    }
