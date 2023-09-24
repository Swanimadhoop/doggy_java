/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashDog;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author swani
 */

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private StartPanel startPanel;
    private GamePanel gamePanel;
    private ScorePanel scorePanel;
    private String playerName;
    private int playerScore;

    public GameFrame() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        startPanel = new StartPanel(this);
        gamePanel = new GamePanel(this);
        scorePanel = new ScorePanel(this);

        cardPanel.add(startPanel, "start");
        cardPanel.add(gamePanel, "game");
        cardPanel.add(scorePanel, "score");

        add(cardPanel);
        setTitle("_Doggo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);

        showStartPage();
    }

    public void showStartPage() {
        cardLayout.show(cardPanel, "start");
    }

    public void startGame(String playerName) {
        this.playerName = playerName;
        playerScore = 0;
        gamePanel.resetGame();
        cardLayout.show(cardPanel, "game");
    }

    public void endGame(int score) {
        playerScore = score;
        scorePanel.addScore(playerName, playerScore);
        cardLayout.show(cardPanel, "score");
    }
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

