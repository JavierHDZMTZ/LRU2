package lru2;

public class Traductor {
    
    public String dec_bin(int dec){
        int modulo;
        String bin = "";
        
        
        while (dec > 0) {
            modulo = (dec%2);
            bin = modulo + bin;
            dec = dec/2;
        }
        return bin;
    }
    
    public int bin_dec(String bin) {
        int dec=0;
        
        for (int i = 0; i < bin.length(); i++){
            if (bin.charAt(i) == '1'){
                dec += Math.pow(2, bin.length()-1-i); //Potencia
            }
        }
        return dec;
    }
}
