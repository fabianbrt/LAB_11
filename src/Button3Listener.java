import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Button3Listener implements ActionListener {
    JPanel panel1;
    JPanel panel2;

    public Button3Listener(JPanel panel1, JPanel panel2) {
        this.panel1 = panel1;
        this.panel2 = panel2;
    }

    private Color setNewColor(int i){
        switch (i){
            case 0:
                return Color.RED;
                case 1:
                    return Color.GREEN;
                    case 2:
                        return Color.BLUE;
                        case 3:
                            return Color.YELLOW;
             default:
                return Color.BLACK;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random rand = new Random();
        panel1.setBackground(setNewColor(rand.nextInt(4)));
        panel2.setBackground(setNewColor(rand.nextInt(4)));
    }

}
