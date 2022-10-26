package lru2;
public class MMU {
    Generador_de_Instrucciones a = new Generador_de_Instrucciones();
    Traductor b = new Traductor();
    Memoria c = new Memoria();
    
    public String[] tabla_ale(){
        String num = a.aleatorio();
        int dec = b.bin_dec(num);   
        int tamp = c.Paginas();
        int mod = dec % tamp ;
        String bin = b.dec_bin(mod);
        String[] tabla = new String[tamp];
         for(int i =0;i<=10;i++){
            tabla[i]=bin;
        }
        return tabla;
    }
    
    public String[] tabla_man(){
        String num = a.manual();
        int dec = b.bin_dec(num);
        int tamp = c.Paginas();
        int mod = dec % tamp ;
        String bin = b.dec_bin(mod);
        String[] tabla = new String[tamp];
         for(int i =0;i<=10;i++){
            tabla[i]=bin;
        }
        return tabla;

}
