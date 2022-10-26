package lru2;
public class MMU {
    Generador_de_Instrucciones a = new Generador_de_Instrucciones();
    Traductor b = new Traductor();
    Memoria c = new Memoria();
            public String F =" ";

    public String[] tabla_ale(){
         int i;
        String num = a.aleatorio();
        int dec = b.bin_dec(num);   
        int tamp = c.paginas;
        int mod = dec % tamp ;
        String bin = b.dec_bin(mod);
        
        int bitbin = bin.length();
        String[] four = new String[bitbin+1];
        for(i=1; i<4; i++){
         String F =" ";
         F = F + four[i];
        }
        
        String[] tabla = new String[tamp];
         for( i =0;i<=10;i++){
            tabla[i]=F;
        }
        return tabla;
    }

public String[] tabla_man(){
        int i;
        String num = a.manual(1);
        int dec = b.bin_dec(num);
        int tamp = c.paginas;
        int mod = dec % tamp ;
        String bin = b.dec_bin(mod);
        
        int bitbin = bin.length();
        String[] four = new String[bitbin+1];
        for(i=0; i<4; i++){
         String F =" ";
         F = F + four[i];
       
             
        }
        
        String[] tabla = new String[tamp];
         for(i =0;i<=10;i++){
            tabla[i]=F;
        }
        return tabla;
}
}