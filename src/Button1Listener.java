import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Button1Listener implements ActionListener {
    private int count;
    JLabel label;
    public Button1Listener(JLabel label) {
        this.label = label;
        count = 0;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        this.label.setText(Integer.toString(count));
    }
}
