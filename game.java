import javax.swing.*;
import java.awt.*;

public class game {

    JFrame frame;

    JPanel dealerPanel;
    JPanel playerPanel;
    JPanel buttonPanel;

    JButton dealButton;
    JButton hitButton;
    JButton standButton;
    JButton quitButton;

    public game() {
        buildFrame();
        buildPanels();
        buildButtons();
        buttonEvents();
        
        frame.setVisible(true);
    }

	public static void main(String[] args){
		new game();
	}

    public void buildFrame() {
        frame = new JFrame("Blackjack");
        frame.setSize(1750, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Color tableGreen = new Color(0, 100, 0);
        frame.getContentPane().setBackground(tableGreen);
    }

    public void buildPanels() {
        dealerPanel = new JPanel();
        playerPanel = new JPanel();
        buttonPanel = new JPanel();

        dealerPanel.setOpaque(false);
        playerPanel.setOpaque(false);
        buttonPanel.setOpaque(false);

        dealerPanel.setBounds(0, 40, 1750, 150);
        playerPanel.setBounds(0, 400, 1750, 150);
        buttonPanel.setBounds(0, 760, 1750, 100);

        dealerPanel.add(buildCard("AS.png"));
        dealerPanel.add(buildCard("10H.png"));

        playerPanel.add(buildCard("KC.png"));
        playerPanel.add(buildCard("7D.png"));
    }

    public void buildButtons() {
        dealButton = new JButton("Deal");
        hitButton = new JButton("Hit");
        standButton = new JButton("Stand");
        quitButton = new JButton("Quit");

        buttonPanel.add(dealButton);
        buttonPanel.add(hitButton);
        buttonPanel.add(standButton);
        buttonPanel.add(quitButton);

        dealButton.setPreferredSize(new Dimension(150, 60));
        hitButton.setPreferredSize(new Dimension(150, 60));
        standButton.setPreferredSize(new Dimension(150, 60));
        quitButton.setPreferredSize(new Dimension(150, 60));

        frame.add(dealerPanel);
        frame.add(playerPanel);
        frame.add(buttonPanel);

        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 75, 20));

        buttonPanel.add(dealButton);
        buttonPanel.add(hitButton);
        buttonPanel.add(standButton);
        buttonPanel.add(quitButton);

        hitButton.setEnabled(false);
        standButton.setEnabled(false);
    }

    public void buttonEvents(){
        dealButton.addActionListener(e -> {
                dealButton.setEnabled(false);
                hitButton.setEnabled(true);
                standButton.setEnabled(true);
            });
        hitButton.addActionListener(e -> {
                
            });
        standButton.addActionListener(e -> {
                
            });
        quitButton.addActionListener(e -> {
              System.exit(0);  
            });
    }
    public JLabel buildCard(String fileName) {
        ImageIcon icon = new ImageIcon("Images/" + fileName);

        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(80, 100, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        return new JLabel(scaledIcon);
    }
}
