import javax.swing.*;
import java.awt.*;

class GUI {
     static Horse horse = new Horse('L',"Leon",0.5);
     static Horse horse1 = new Horse('H',"Humphrey",0.5);
     static Horse horse2 = new Horse('G',"Greg",0.5);
     public static void Title() {
         JFrame frame = new JFrame("HorseRace");
         frame.setVisible(true);
         frame.setSize(601, 601);
         frame.setResizable(false);
         frame.setTitle("HorseRace");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setBackground(new Color(111, 111, 255));

         JLabel label = new JLabel("HorseRace");
         label.setHorizontalAlignment(SwingConstants.CENTER);
         label.setVerticalTextPosition(JLabel.CENTER);
         label.setForeground(Color.white);
         frame.getContentPane().add(label);
         label.setText("pick a horse");
         label.setFont(label.getFont().deriveFont(16.0f));
         label.setBounds(0, 200, 600, 200);

         JPanel panel1 = new JPanel();
         panel1.setBackground(new Color(0, 111, 255));
         frame.getContentPane().add(panel1);
         panel1.setLayout(null);
         panel1.setBounds(0, 0, 200, 200);

         JPanel panel2 = new JPanel();
         panel2.setBackground(new Color(111, 0, 255));
         frame.getContentPane().add(panel2);
         panel2.setLayout(null);
         panel2.setBounds(200, 0, 200, 200);

         JPanel panel3 = new JPanel();
         panel3.setBackground(new Color(0, 0, 255));
         frame.getContentPane().add(panel3);
         panel3.setLayout(null);
         panel3.setBounds(400, 0, 200, 200);

         JPanel panel4 = new JPanel();
         panel4.setBackground(new Color(90, 90, 141));
         frame.getContentPane().add(panel4);
         panel4.setLayout(null);
         panel4.setBounds(0, 200, 600, 200);

         JPanel panel5 = new JPanel();
         panel5.setBackground(new Color(23, 23, 69));
         frame.getContentPane().add(panel5);
         panel5.setLayout(null);
         panel5.setBounds(0, 400, 200, 200);


         JPanel panel6 = new JPanel();
         panel6.setBackground(new Color(145, 145, 171));
         frame.getContentPane().add(panel6);
         panel6.setLayout(null);
         panel6.setBounds(200, 400, 200, 200);


         JPanel panel7 = new JPanel();
         panel7.setBackground(new Color(15, 42, 214));
         frame.getContentPane().add(panel7);
         panel7.setLayout(null);
         panel7.setBounds(400, 400, 200, 200);

        JPanel panel8 = new JPanel();
        panel8.setBackground(new Color(23, 23, 69));
        frame.getContentPane().add(panel8);
        panel8.setLayout(null);
        panel8.setBounds(600, 0, 1, 600);
        JPanel panel9 = new JPanel();
        panel9.setBackground(new Color(145, 145, 171));
        frame.getContentPane().add(panel9);
        panel9.setLayout(null);
        panel9.setBounds(0, 600, 600, 1);




        JLabel label_1 = new JLabel("Horse");
        label_1.setText("Horse stats:"+horse1.getName());
        label_1.setForeground(Color.white);
        panel5.add(label_1);
         label_1.setBounds(0, -50, 200, 200);

         JLabel label_11 = new JLabel("Horse");
         label_11.setText("Confidence: "+horse1.getConfidence());
         label_11.setForeground(Color.white);
         panel5.add(label_11);
         label_11.setBounds(0, -30, 200, 200);

        JLabel label_2 = new JLabel("Horse2");
        label_2.setText("Horse stats:"+"\n"+horse2.getName());
        label_2.setForeground(Color.white);
        panel6.add(label_2);
        label_2.setBounds(0, -50, 200, 200);

         JLabel label_21 = new JLabel("Horse");
         label_21.setText("Confidence: "+horse1.getConfidence());
         label_21.setForeground(Color.white);
         panel6.add(label_21);
         label_21.setBounds(0, -30, 200, 200);

        JLabel label_3 = new JLabel("Horse3");
        label_3.setText("Horse stats:"+"\n"+horse.getName());
        label_3.setForeground(Color.white);
        panel7.add(label_3);
        label_3.setBounds(0, -50, 200, 200);

         JLabel label_31 = new JLabel("Horse");
         label_31.setText("Confidence: "+horse1.getConfidence());
         label_31.setForeground(Color.white);
         panel7.add(label_31);
         label_31.setBounds(0, -30, 200, 200);

         JButton button = new JButton("Humphrey");
         button.setBounds(0, 0, 200, 200);
         button.addActionListener(e -> RunGame.selectedHorse("Humphrey"));
         button.addActionListener(e -> GUI.Gameplay());
         button.addActionListener(e -> frame.dispose());
         button.addActionListener(e -> panel1.setBackground(new Color(0, 111, 255)));
         button.setFocusable(Boolean.FALSE);
         panel1.add(button);

         JButton button2 = new JButton("Greg");
         button2.setBounds(0, 0, 200, 200);
         button2.addActionListener(e -> RunGame.selectedHorse("Greg"));
         button2.addActionListener(e -> GUI.Gameplay());
         button2.addActionListener(e -> frame.dispose());
         button.addActionListener(e -> panel2.setBackground(new Color(111, 0, 255)));
         button2.setFocusable(Boolean.FALSE);
         panel2.add(button2);

         JButton button3 = new JButton("Leon");
         button3.setBounds(0, 0, 200, 200);
         button3.addActionListener(e -> RunGame.selectedHorse("Leon"));
         button3.addActionListener(e -> GUI.Gameplay());
         button3.addActionListener(e -> frame.dispose());
         button.addActionListener(e ->  panel3.setBackground(new Color(0, 0, 255)));
         button3.setFocusable(Boolean.FALSE);
         panel3.add(button3);

     }
     public static void horseChosen(String horse) {
         JOptionPane.showMessageDialog(null, horse +" Chosen");
     }
     public static void Gameplay() {
         JFrame frame = new JFrame("Race");
         frame.setVisible(true);
         frame.setSize(601, 601);
         frame.setResizable(false);
         frame.setTitle("Race");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setBackground(new Color(111, 111, 255));
     }
 }