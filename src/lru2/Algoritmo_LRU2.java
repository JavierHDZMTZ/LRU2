package lru2;
public class Algoritmo_LRU2 {
    private static int Matriz[][];
    private int Tabla [][];
    
    private void Inicializar_Matriz(int NMarcos){
       Matriz = new int[NMarcos][NMarcos];
    }
    private void Rellenar_Matriz(int NMarcos){
        for(int i=0 ; i<NMarcos; i++){
            for(int j=0 ; j<NMarcos ; i++){
                Matriz[i][j]=0;
            }
        }
    }
    private void Rellenar_FilasYColumnas(int Numero){
        for(int i=0 ; i<Numero; i++){
            Matriz[Numero][i]= 1;
        }
        for(int i=0 ; i<Numero; i++){
            Matriz[i][Numero]= 0;
        }
    }
    private void Fallo_de_Pagina(){
    
    }
    private void Ejecucion(){
    
    }
    
}
