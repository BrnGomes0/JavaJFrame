import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args){

        Janela janela = new Janela("Titulo");
        Rotulo label = new Rotulo();
        CampoTexto campoTexto = new CampoTexto();
        Botao botao = new Botao("Botão");

        botao.addActionListener(e -> label.setText(campoTexto.getText()));

        janela.add(label);
        janela.add(campoTexto);
        janela.add(botao);

        janela.setVisible(true);
    }
}
