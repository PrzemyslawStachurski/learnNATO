import javax.swing.*;

public class learnNATOGUI extends JFrame {
    private JPanel mainPanel;

    public learnNATOGUI(String appName) {
        super(appName);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new learnNATOGUI("MAIN MENU");
        frame.setVisible(true);
    }
}