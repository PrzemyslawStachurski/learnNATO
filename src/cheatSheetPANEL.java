import javax.swing.*;

public class cheatSheetPANEL extends JFrame {
    private JPanel mainPanel;
    private JLabel cheatSheetLabel;

    public cheatSheetPANEL(String appName) {
        super(appName);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        cheatSheetLabel.setIcon(new ImageIcon(
                "C:\\Users\\przem\\OneDrive\\Desktop\\projektyJava\\src\\cheatSheetPic.jpg"));
    }

}
