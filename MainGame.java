import javax.swing.*;
import java.awt.*;
class MainGame {

    public static void Gameplay() {
        JFrame frame = new JFrame("Race");
        frame.setVisible(true);
        frame.setSize(601, 601);
        frame.setResizable(false);
        frame.setTitle("Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(111, 111, 255));
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setBackground(new Color(111, 111, 255));
        panel.setLayout(null);
        panel.setBounds(0, 400, 600, 200);
        Race race = new Race(20);
        race.addHorse(GUI.horse1,1);
        race.addHorse(GUI.horse2,2);
        race.addHorse(GUI.horse,3);
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setEditable(false);
        frame.add(editorPane);
        editorPane.setText(race.printRace());
        new Thread(() -> {
            for (String states : race.startRace()) {

                SwingUtilities.invokeLater(() -> editorPane.setText(states));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {

                    ex.printStackTrace();
                }
            }
            SwingUtilities.invokeLater(() -> {
                JLabel label = new JLabel();
                panel.add(label);
                label.setBounds(0, 0, 100, 20);
                label.setText(race.getWinner()+" won!");
                JButton button = new JButton();
                button.setText("Main Menu");
                panel.add(button);
                button.setBounds(100, 0, 100, 20);
                button.addActionListener(e -> GUI.Title());
                button.addActionListener(e -> frame.dispose());
            });
        }).start();

    }
}
