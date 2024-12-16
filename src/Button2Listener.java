import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Button2Listener implements ActionListener {
    private final JTextField textField;
    private JLabel label;
    private String text;

    public Button2Listener(JTextField textField, JLabel label) {
        this.textField = textField;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text = textField.getText();
        label.setText(text);
    }

}
