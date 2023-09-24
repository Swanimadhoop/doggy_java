/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashDog;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author swani
 */



public class StartPanel extends JPanel {
    private GameFrame gameFrame;
    private JTextField nameField;
    private JButton startButton;

    public StartPanel(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
        setLayout(new BorderLayout());

        nameField = new JTextField(20);
        startButton = new JButton("Start Game");

        startButton.addActionListener(e -> {
            String playerName = nameField.getText();
            if (!playerName.isEmpty()) {
                gameFrame.startGame(playerName);
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a name.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter Your Name: "));
        inputPanel.add(nameField);

        add(inputPanel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }
}

    
