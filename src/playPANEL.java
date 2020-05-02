import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class playPANEL extends JFrame {
    private JPanel mainPanel;
    private JLabel charLabel;
    private JTextField answerField;
    private JButton submitButton;
    private JButton tryAgainButton;
    private JLabel answerLabel;

    Random value = new Random();

    int link = value.nextInt(25);

    public playPANEL(String appName) {
        super(appName);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        String words[] = new String[26];

        words[0] = "Alpha";
        words[1] = "Bravo";
        words[2] = "Charlie";
        words[3] = "Delta";
        words[4] = "Echo";
        words[5] = "Foxtrot";
        words[6] = "Golf";
        words[7] = "Hotel";
        words[8] = "India";
        words[9] = "Juliet";
        words[10] = "Kilo";
        words[11] = "Lima";
        words[12] = "Mike";
        words[13] = "November";
        words[14] = "Oscar";
        words[15] = "Papa";
        words[16] = "Quebec";
        words[17] = "Romeo";
        words[18] = "Sierra";
        words[19] = "Tango";
        words[20] = "Uniform";
        words[21] = "Victor";
        words[22] = "Whiskey";
        words[23] = "X-ray";
        words[24] = "Yankee";
        words[25] = "Zulu";

        charLabel.setText(String.valueOf(words[link].charAt(0)));

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (answerField.getText().equals(words[link])) {
                    answerLabel.setText("Correct answer");
                    answerLabel.setForeground(Color.GREEN);
                } else {
                    answerLabel.setText("Wrong answer");
                    answerLabel.setForeground(Color.RED);
                }

            }
        });
        tryAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                answerLabel.setText(" ");
                answerField.setText("");
                link = value.nextInt(25);

                charLabel.setText(String.valueOf(words[link].charAt(0)));

            }
        });
    }
}
