import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class interface_grafique {

    public static void main(String[] args) {
        JFrame frame = new JFrame("interface_grafique");
        frame.setContentPane(new interface_grafique().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel panel1;

       private JButton button1;
       private JTextField textBonjour ;

    public interface_grafique() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textBonjour.setText("coucou c'est nous");

            }
        });
    }

}
