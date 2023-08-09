import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    // Creating a Constructor
    Janela (String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(null); // Te da liberdade de personalizar o local dos componentes
        setBackground(Color.gray);
    }
}
