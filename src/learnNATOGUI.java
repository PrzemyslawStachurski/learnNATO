import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class learnNATOGUI extends JFrame {
    private JPanel mainPanel;
    private JButton cheatSheetButton;
    private JButton playButton;

    public learnNATOGUI(String appName) {
        super(appName);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                playPANEL learn = new playPANEL("Learning NATO");
                learn.setVisible(true);
            }
        });
        cheatSheetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cheatSheetPANEL names = new cheatSheetPANEL("Cheat Sheet");
                names.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new learnNATOGUI("MAIN MENU");
        frame.setVisible(true);
    }
}