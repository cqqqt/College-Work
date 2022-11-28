import javax.swing.*;

public class Forma extends JFrame{
    private JButton кнопка1Button;
    private JButton кнопка9Button;
    private JButton кнопка2Button;
    private JButton кнопка3Button;
    private JButton кнопка4Button;
    private JButton кнопка5Button;
    private JButton кнопка6Button;
    private JButton кнопка7Button;
    private JButton кнопка8Button;
    private JTextArea областьТекстаTextArea;
    private JRadioButton выбор1RadioButton;
    private JRadioButton выбор2RadioButton;
    private JRadioButton выбор3RadioButton;
    private JRadioButton выбор4RadioButton;
    private JRadioButton выбор5RadioButton;
    private JRadioButton выбор6RadioButton;
    private JRadioButton выбор7RadioButton;
    private JRadioButton выбор8RadioButton;
    private JRadioButton выбор9RadioButton;
    private JButton кнопкаButton;
    private JButton кнопкаButton1;
    private JPasswordField passwordField1;
    private JButton кнопкаButton2;
    private JPanel panel;

    public Forma(String name){
        super(name);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        pack();
        ButtonGroup bg = new ButtonGroup();
        bg.add(выбор1RadioButton);
        bg.add(выбор2RadioButton);
        bg.add(выбор3RadioButton);
        bg.add(выбор4RadioButton);
        bg.add(выбор5RadioButton);
        bg.add(выбор6RadioButton);
        bg.add(выбор7RadioButton);
        bg.add(выбор8RadioButton);
        bg.add(выбор9RadioButton);
    }

    public static void main(String[] args) {
        JFrame frame=new Forma("KURYSHEV");

        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
