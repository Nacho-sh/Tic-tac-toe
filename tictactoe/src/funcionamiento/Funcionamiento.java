package funcionamiento;
import Main.Main;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Funcionamiento {
    public static int numero;
    public static Random rand = new Random();
    public static int usado1, usado2, usado3, usado4, usado5, usado6, usado7, usado8, usado9;
    public static boolean valid = false;
    public static Icon circulo = new ImageIcon("C:\\Programación\\tictactoe\\Imagenes\\circulo.jpg");



    //Esta funcion hace todo el proceso de la maquina de poner las fichas
    public static void Maquina(){
        if(Main.cuenta == 9){}else{
        numero = rand.nextInt(10);
        switch(Main.boton){
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
        do{
            if(numero == 0 || numero == usado1 || numero == usado2 || numero == usado3 || numero == usado4 || numero == usado5 || numero == usado6 || numero ==   usado7 || numero == usado8 || numero == usado9){

                numero = rand.nextInt(10);  
                //Tengo que volver a poner que valid = false porque si no no funciona, no se por que
                valid = false;  
            }else{
            valid = true;
             }        
        }while(valid == false);


        switch(numero){
            case 1:
                usado1 = 1;
                Main.uno.setIcon(circulo);
                break;
            case 2: 
                usado2 = 2;
                Main.dos.setIcon(circulo);
                break;
            case 3: 
                usado3 = 3;
                Main.tres.setIcon(circulo);
                break;
            case 4:
                usado4 = 4;
                Main.cuatro.setIcon(circulo);
                break;
            case 5:
                usado5 = 5;
                Main.cinco.setIcon(circulo);
                break;
            case 6:
                usado6 = 6;
                Main.seis.setIcon(circulo);
                break;
            case 7:
                usado7 = 7;
                Main.siete.setIcon(circulo);
                break;
            case 8:
                usado8 = 8;
                Main.ocho.setIcon(circulo);
                break;
            case 9:
                usado9 = 9;
                Main.nueve.setIcon(circulo);
                break;
            }
        Main.cuenta++;
        Main.jugador = true;
        }
    }
}



