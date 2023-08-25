// java swing project that shows content of a file in a text area
// use JFileChooser to select file
// use BufferedReader to read file

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;



public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("File Reader");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Select File");
        JTextArea textArea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int response = fileChooser.showOpenDialog(null);
                if (response == JFileChooser.APPROVE_OPTION) {
                    String fileName = fileChooser.getSelectedFile().getAbsolutePath();
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(fileName));
                        String line = reader.readLine();
                        while (line != null) {
                            textArea.append(line + "\n");
                            line = reader.readLine();
                        }
                        reader.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        frame.add(button);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}