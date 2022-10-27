package lru2;
public class MMU {
    Generador_de_Instrucciones a = new Generador_de_Instrucciones();
    Traductor b = new Traductor();
    Memoria c = new Memoria();
            public String F =" ";

    public int[] tabla_ale(int instrucciones[], int tamaño, int TP){
        int i;
        int tabla[]= new int[tamaño];
        // Generado de tabla para ejecucion
        for(int k = 0 ; k < tamaño ; k++ ){
            tabla[k]=(instrucciones[k]/TP); 
        }
        //fin de llenado de tabla
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
        /*
        String[] tabla = new String[tamp];
         for( i =0;i<=10;i++){
            tabla[i]=F;
        }*/
        return tabla;
    }

public String[] tabla_man(int man){
        int i;
        String num = b.dec_bin(man);
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