import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JFrame {
    public ImageDisplay () {
        super("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0, 800, 800);

        ImageIcon icon = new ImageIcon("image\\oi.jfif");
        JLabel label = new JLabel(icon);
        add(label);
        setVisible(true);

    }

    public static void main(String[] args){
        new ImageDisplay();
    }
}
