package funcionamiento;
import Main.Main;
public class Tresraya {
    public static int uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, resultado;
    //Se que esto es muy chapucero pero no se utilizar arrays y nunca ha salido en coursera ni la geekpedia de ernesto asi que cuando aprenda a utilizarlas lo cambiare
    public static void TresRaya(){
        
    if(Main.uno.getIcon() == Main.equis){
        uno = 1;
    }else if(Main.uno.getIcon() == Funcionamiento.circulo){
        uno = 2;
    }
    if(Main.dos.getIcon() == Main.equis){
        dos = 1;
    }else if(Main.dos.getIcon() == Funcionamiento.circulo){
        dos = 2;
    }
    if(Main.tres.getIcon() == Main.equis){
        tres = 1;
    }else if(Main.tres.getIcon() == Funcionamiento.circulo){
        tres = 2;
    }
    if(Main.cuatro.getIcon() == Main.equis){
        cuatro = 1;
    }else if(Main.cuatro.getIcon() == Funcionamiento.circulo){
        cuatro = 2;
    }
    if(Main.cinco.getIcon() == Main.equis){
        cinco = 1;
    }else if(Main.cinco.getIcon() == Funcionamiento.circulo){
        cinco = 2;
    }
    if(Main.seis.getIcon() == Main.equis){
        seis = 1;
    }else if(Main.seis.getIcon() == Funcionamiento.circulo){
        seis = 2;
    }
    if(Main.siete.getIcon() == Main.equis){
        siete = 1;
    }else if(Main.siete.getIcon() == Funcionamiento.circulo){
        siete = 2;
    }
    if(Main.ocho.getIcon() == Main.equis){
        ocho = 1;
    }else if(Main.ocho.getIcon() == Funcionamiento.circulo){
        ocho = 2;
    }
    if(Main.nueve.getIcon() == Main.equis){
        nueve = 1;
    }else if(Main.nueve.getIcon() == Funcionamiento.circulo){
        nueve = 2;
    }

    //esto es lo mas chapucero que he hecho en mucho tiempo pero funciona asi que me vale de momento dios mio da asco y todo jajajaj
    if(uno  == 1 && dos == 1 && tres == 1){
        resultado = 1;
    }else if(uno == 1 && cinco == 1 && nueve == 1){
        resultado = 1;
    }else if(uno == 1 && cuatro == 1 && siete == 1){
        resultado = 1;
    }else if(dos == 1 && cinco == 1 && ocho == 1){
        resultado = 1;
    }else if(tres == 1 && cinco == 1 && siete == 1){
        resultado = 1;
    }else if(cuatro == 1 && cinco == 1 && seis == 1){
        resultado = 1;
    }else if(seis == 1 && dos == 1 && nueve == 1){
        resultado = 1;
    }else if(siete == 1 && ocho == 1 && nueve ==1){
        resultado = 1;
    }else if(uno  == 2 && dos == 2 && tres == 2){
        resultado = 2;
    }else if(uno == 2 && cinco == 2 && nueve == 2){
        resultado = 2;
    }else if(uno == 2 && cuatro == 2 && siete == 2){
        resultado = 2;
    }else if(dos == 2 && cinco == 2 && ocho == 2){
        resultado = 2;
    }else if(tres == 2 && cinco == 2 && siete == 2){
        resultado = 2;
    }else if(cuatro == 2 && cinco == 2 && seis == 2){
        resultado = 2;
    }else if(seis == 2 && dos == 2 && nueve == 2){
        resultado = 2;
    }else if(siete == 2 && ocho == 2 && nueve == 2){
        resultado = 2;
    }else{
        resultado = 0;
    }
    

    }
}
