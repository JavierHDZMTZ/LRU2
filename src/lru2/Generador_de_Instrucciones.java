package lru2;

import java.util.Scanner;

public class Generador_de_Instrucciones extends Memoria{
  
    private int min=0;
    private int max=0;
    private int ed=0;
    private Traductor m = new Traductor();
    
    public void proceso(){
        int ram=16, mv=32,n,tp=4,k=2^10, pag,mpag;
        int bitpag, bitmar;
        
        ed= mv*k; //espacio de direcciones
        pag= ed/(ram*k); //total  de pag
        mpag= (ram*k)/tp; //marcos de pagina
        
        String p = m.dec_bin(pag-1); 
        String mp = m.dec_bin(mpag-1); 
        
        bitpag= p.length(); //bits para las pag
        bitmar= mp.length(); //bits para los marcos de pag   
    }
    
    public String manual(int man){
       String r = m.dec_bin(man);
       System.out.println("Binario de"+man+"es"+r);  
       return r;
    }
    
    
    public String aleatorio(){
        int numero = (int)(Math.random()*ed);
        Scanner sn =new Scanner(System.in);
        System.out.println("El maximo:");  
        this.max=numero; //32k -- espacio de direcionamiento 
        this.max=max-1;
        System.out.println("el minimo es: "+min);  
        System.out.println("El rango es: ("+max+","+min+")"); 
        String l = m.dec_bin(max); //manda el binario a la clase MMU para su demas proceso
        System.out.println("Binario de"+max+"es"+l);  
        return l;
    }
}
