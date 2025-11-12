package com.jp.calculadora;

import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI extends JFrame{
    private JTextField pantalla;
    private JPanel panelBotones;
    private JButton[] botonesNumeros;
    private JButton btnSuma, btnResta, btnMulti, btnDiv;
    private JButton btnIgual, btnPunto, btnLimpiar;

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar layout de la ventana
        setLayout(new BorderLayout());

        // Crear pantalla
        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        add(pantalla, BorderLayout.NORTH);
        pantalla.setPreferredSize(new Dimension(0, 60));
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));

        // Crea el panel
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Array de botones numericos
        botonesNumeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botonesNumeros[i] = new JButton(String.valueOf(i));
        }

        // Crea botones de operacion
        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMulti = new JButton("x");
        btnDiv = new JButton("÷");
        btnIgual = new JButton("=");
        btnPunto = new JButton(".");
        btnLimpiar = new JButton("C");

        // Estilizar botones
        estilizarBoton(btnSuma, new Color(255, 152, 0), Color.WHITE);
        estilizarBoton(btnResta, new Color(255, 152, 0), Color.WHITE);
        estilizarBoton(btnMulti, new Color(255, 152, 0), Color.WHITE);
        estilizarBoton(btnDiv, new Color(255, 152, 0), Color.WHITE);
        estilizarBoton(btnIgual, new Color(255, 152, 0), Color.WHITE);
        estilizarBoton(btnLimpiar, new Color(255, 152, 0), Color.WHITE);

        for (JButton btn : botonesNumeros) {
            estilizarBoton(btn, Color.WHITE, Color.BLACK);
        }
        estilizarBoton(btnPunto, Color.WHITE, Color.BLACK);

        // Agrega botones al panel en orden
        // Fila 0
        agregarBoton(btnLimpiar, 0, 0, 1, 1);
        agregarBoton(btnDiv, 3, 0, 1, 1);

        // Fila 1
        agregarBoton(botonesNumeros[7], 0, 1, 1, 1);
        agregarBoton(botonesNumeros[8], 1, 1, 1, 1);
        agregarBoton(botonesNumeros[9], 2, 1, 1, 1);
        agregarBoton(btnMulti, 3, 1, 1, 1);

        // Fila 2
        agregarBoton(botonesNumeros[4], 0, 2, 1, 1);
        agregarBoton(botonesNumeros[5], 1, 2, 1, 1);
        agregarBoton(botonesNumeros[6], 2, 2, 1, 1);
        agregarBoton(btnResta, 3, 2, 1, 1);

        // Fila 3
        agregarBoton(botonesNumeros[1], 0, 3, 1, 1);
        agregarBoton(botonesNumeros[2], 1, 3, 1, 1);
        agregarBoton(botonesNumeros[3], 2, 3, 1, 1);
        agregarBoton(btnSuma, 3, 3, 1, 1);

        // Fila 4
        agregarBoton(botonesNumeros[0], 0, 4, 2, 1);
        agregarBoton(btnPunto, 2, 4, 1, 1);
        agregarBoton(btnIgual, 3, 4, 1, 1);
        add(panelBotones, BorderLayout.CENTER);
    }

    private void estilizarBoton(JButton btn, Color fondo, Color texto) {
        btn.setFont(new Font("Arial", Font.BOLD, 18));
        btn.setBackground(fondo);
        btn.setForeground(texto);
        btn.setFocusPainted(false);
    }

    private void agregarBoton(JButton btn, int x, int y, int width, int height) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = width;
        gbc.gridheight = height;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelBotones.add(btn, gbc);
    }

    public static void main(String[] args) {
        new CalculadoraGUI().setVisible(true);
    }
}
