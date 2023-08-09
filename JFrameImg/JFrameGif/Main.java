import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Exemplo Imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,800,800);

        ImageIcon iconeAmpliado = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\reviewJava\\JFrameImg\\JFrameGif\\image\\suits.gif");
        iconeAmpliado.setImage(iconeAmpliado.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT)); // Deixa a escala padrão

        JLabel label = new JLabel(iconeAmpliado);
        frame.add(label);
        frame.setVisible(true);
    }
}
