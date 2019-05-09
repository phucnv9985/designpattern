package com.learn.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class SwingObserverExample {
    public static void main(String [] args) {
    	SwingObserverExample example = new SwingObserverExample();
	example.go();
    }

    private void go() {
    	JFrame frame = new JFrame();
	JButton button = new JButton("Should I do it?");
	button.addActionListener(new AngelListener());
	button.addActionListener(new DevilListener());
	frame.getContentPane().add(BorderLayout.CENTER, button);
	frame.setVisible(true);
    }



class AngelListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
    	System.out.println("Don't do it, you might regret it!");
    }
}

class DevilListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
    	System.out.println("Come on, do it!");
    }
}
}
