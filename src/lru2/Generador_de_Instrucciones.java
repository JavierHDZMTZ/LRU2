package lru2;

import java.util.Scanner;

public class Generador_de_Instrucciones extends Memoria{
    private int random= 32000; //recibe el espacio de direccionamiento de la clase memoria
    private int min=0;
    private int max=0;
    private Traductor m = new Traductor();
    
    public void manual(){
       String r = m.dec_bin(random);
       System.out.println("Binario de"+random+"es"+r);  
    }
    
    
    public int  aleatorio(){
        Scanner sn =new Scanner(System.in);
        System.out.println("El maximo:");  
        this.max=32768; //32k -- espacio de direcionamiento 
        this.max=max-1;
        System.out.println("el minimo es: "+min);  
        System.out.println("El rango es: ("+max+","+min+")"); 
        String l = m.dec_bin(max); //manda el binario a la clase MMU para su demas proceso
        System.out.println("Binario de"+max+"es"+l);  
        return 0;
    }
}
