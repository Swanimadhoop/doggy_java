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



public class ScorePanel extends JPanel {
    private GameFrame gameFrame;
    private DefaultListModel<String> scoreListModel;
    private JList<String> scoreList;

    public ScorePanel(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
        scoreListModel = new DefaultListModel<>();
        scoreList = new JList<>(scoreListModel);

        setLayout(new BorderLayout());
        add(new JLabel("High Scores"), BorderLayout.NORTH);
        add(new JScrollPane(scoreList), BorderLayout.CENTER);

        JButton backButton = new JButton("Back to Start");
        backButton.addActionListener(e -> {
            gameFrame.showStartPage();
        });

        add(backButton, BorderLayout.SOUTH);
    }

    public void addScore(String playerName, int playerScore) {
        scoreListModel.addElement(playerName + ": " + playerScore);
    }
}