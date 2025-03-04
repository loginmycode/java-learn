package com.learn.features.java8.lambda;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow {

	public static void main(String[] args) {
		
		// Create a new window (JFrame)
        JFrame frame = new JFrame("My Window");

        // Create a JLabel to display text
        JLabel label = new JLabel("Hello, Java Swing!", JLabel.CENTER);
        JButton button = new JButton("Click me");
        frame.add(button);
//        label.setFont(new Font("Arial", Font.BOLD, 20)); // Set font size and style
//
//        // Add the label to the frame
//        frame.add(label);

        // Set frame properties
        frame.setSize(400, 300); // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close window on exit
        frame.setVisible(true); // Show the window
	}
}
