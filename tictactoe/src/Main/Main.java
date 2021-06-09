package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import funcionamiento.Funcionamiento;
import funcionamiento.Tresraya;
import java.util.concurrent.TimeUnit;

public class Main extends JFrame implements ActionListener {
    private static final long serialVersionUID = -8607840679907132575L;
    public static JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, reiniciar, salir;
    public static Icon equis = new ImageIcon("C:\\Programación\\tictactoe\\Imagenes\\equis.jpg");
    public static boolean jugador = true;
    JLabel label;
    public static int usado1, usado2, usado3, usado4, usado5, usado6, usado7, usado8, usado9;
    public static int boton, cuenta = 0;

    public Main() {
        setLayout(null);

        uno = new JButton();
        dos = new JButton();
        tres = new JButton();
        cuatro = new JButton();
        cinco = new JButton();
        seis = new JButton();
        siete = new JButton();
        ocho = new JButton();
        nueve = new JButton();
        reiniciar = new JButton("Reiniciar");
        salir = new JButton("Salir");

        label = new JLabel();
        label.setSize(100, 100);
        label.setLocation(200, 350);
        label.setVisible(false);
        add(label);

        uno.setBounds(10, 10, 100, 100);
        dos.setBounds(140, 10, 100, 100);
        tres.setBounds(270, 10, 100, 100);
        cuatro.setBounds(10, 140, 100, 100);
        cinco.setBounds(140, 140, 100, 100);
        seis.setBounds(270, 140, 100, 100);
        siete.setBounds(10, 270, 100, 100);
        ocho.setBounds(140, 270, 100, 100);
        nueve.setBounds(270, 270, 100, 100);
        reiniciar.setBounds(380, 300, 90, 30);
        salir.setBounds(380, 340, 90, 30);

        uno.addActionListener(this);
        dos.addActionListener(this);
        tres.addActionListener(this);
        cuatro.addActionListener(this);
        cinco.addActionListener(this);
        seis.addActionListener(this);
        siete.addActionListener(this);
        ocho.addActionListener(this);
        nueve.addActionListener(this);
        reiniciar.addActionListener(this);
        salir.addActionListener(this);

        add(uno);
        add(dos);
        add(tres);
        add(cuatro);
        add(cinco);
        add(seis);
        add(siete);
        add(ocho);
        add(nueve);
        add(reiniciar);
        add(salir);

    }

    // Esta funcion hace que el boton donde des salga como ocupado y aumenta la
    // cuenta hasta que pare
    public void Ocupados() {
        switch (Funcionamiento.numero) {
            case 1:
                usado1 = 1;
                break;
            case 2:
                usado2 = 2;
                break;
            case 3:
                usado3 = 3;
                break;
            case 4:
                usado4 = 4;
                break;
            case 5:
                usado5 = 5;
                break;
            case 6:
                usado6 = 6;
                break;
            case 7:
                usado7 = 7;
                break;
            case 8:
                usado8 = 8;
                break;
            case 9:
                usado9 = 9;
                break;
        }
        if (cuenta <= 9) {
            cuenta++;
        }
    }

    // Imagen pone las fichas del jugador
    public void Label() {
        if (Tresraya.resultado == 1) {
            label.setForeground(Color.BLUE);
            label.setPreferredSize(new Dimension(100, 30));
            label.setVisible(true);
            label.setText("¡Has ganado!");
            cuenta = 9;
        } else if (Tresraya.resultado == 2) {
            label.setForeground(Color.RED);
            label.setPreferredSize(new Dimension(100, 30));
            label.setText("¡Perdiste!");
            label.setVisible(true);
            cuenta = 10;
        }
    }

    public void Imagen() {
        if (jugador == true)
            switch (boton) {
                case 1:
                    uno.setIcon(equis);
                    break;
                case 2:
                    dos.setIcon(equis);
                    break;
                case 3:
                    tres.setIcon(equis);
                    break;
                case 4:
                    cuatro.setIcon(equis);
                    break;
                case 5:
                    cinco.setIcon(equis);
                    break;
                case 6:
                    seis.setIcon(equis);
                    break;
                case 7:
                    siete.setIcon(equis);
                    break;
                case 8:
                    ocho.setIcon(equis);
                    break;
                case 9:
                    nueve.setIcon(equis);
                    break;
            }

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == uno) {
            if (usado1 == 1) {
            } else if (cuenta <= 9) {
            usado1 = 1;
            boton = 1;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();
            Label();
            }
        }if(e.getSource() == dos){
            if(usado2 == 2){
            }else if(cuenta <= 9){
            usado2 = 2;
            boton = 2;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();    
            Label();       
            }
        }if(e.getSource() == tres){
            if(usado3 == 3){
            }else if(cuenta <= 9){
            usado3 = 3;
            boton = 3;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();
            Label();
            }
        }if(e.getSource() == cuatro){
            if(usado4 == 4){
            }else if(cuenta <= 9){
            usado4 = 4;
            boton = 4;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();
            Label();
            }
        }if(e.getSource() == cinco){
            if(usado5 == 5){
            }else if(cuenta <= 9){
            usado5 = 5;
            boton = 5;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();
            Label();
            }
        }if(e.getSource() == seis){
            if(usado6 == 6){
            }else if(cuenta <= 9){
            usado6 = 6;
            boton = 6;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();
            Label();
            }
        }if(e.getSource() == siete){
            if(usado7 == 7 || usado7 == 10){
            }else if(cuenta <= 9){
            usado7 = 7;
            boton = 7;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();
            Label();
            }
        }if(e.getSource() == ocho){
            if(usado8 == 8){
            }else if(cuenta <= 9){
            usado8 = 8;
            boton = 8;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();
            Label();
            }
        }if(e.getSource() == nueve){
            if(usado9 == 9){
            }else if(cuenta <= 9){
            usado9 = 9;
            boton = 9;
            Imagen();
            jugador = false;
            Ocupados();
            Funcionamiento.Maquina();
            Ocupados();
            Tresraya.TresRaya();
            Label();
            }
        }if(e.getSource() == reiniciar){
            cuenta = 0; boton = 0; usado1 = 0; usado2 = 0; usado3 = 0; usado4 = 0; usado5 = 0; usado6 = 0; usado7 = 0; usado8 = 0; usado9 = 0; 
            jugador = true;
            uno.setIcon(null);
            dos.setIcon(null);
            tres.setIcon(null);
            cuatro.setIcon(null);
            cinco.setIcon(null);
            seis.setIcon(null);
            siete.setIcon(null);
            ocho.setIcon(null);
            nueve.setIcon(null);
            Funcionamiento.usado1 = 0; Funcionamiento.usado2 = 0; Funcionamiento.usado3 = 0; 
            Funcionamiento.usado4 = 0; Funcionamiento.usado5 = 0; Funcionamiento.usado6 = 0; 
            Funcionamiento.usado7 = 0; Funcionamiento.usado8 = 0; Funcionamiento.usado9 = 0;
            Tresraya.uno = 0; Tresraya.dos = 0; Tresraya.tres = 0; Tresraya.cuatro = 0;
            Tresraya.cinco = 0; Tresraya.seis = 0; Tresraya.siete = 0; Tresraya.ocho = 0;
            Tresraya.nueve = 0; Tresraya.resultado = 0;
            label.setVisible(false);
        }
        if(e.getSource() == salir){
            System.exit(0);
        }

    }
    public static void main(String args[]){
        Main grafica = new Main();
        grafica.setBounds(0, 0, 500, 500);
        grafica.setLocationRelativeTo(null);
        grafica.setVisible(true);
        grafica.setResizable(false);
        ImageIcon icono = new ImageIcon("C:\\Programación\\tictactoe\\Imagenes\\Icono.png");
        grafica.setIconImage(icono.getImage());
        grafica.setTitle("Tres en raya");
        grafica.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}