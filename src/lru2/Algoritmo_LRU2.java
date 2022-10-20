package lru2;

import java.util.Arrays;

public class Algoritmo_LRU2 {
    private static int Matriz[][];
    private int TablaDeInstrucciones [], Ninstrucciones, NPagV;
    private int ValorDeFila[][];
    
    private void Inicializado(int NPagV, int Nins){
       Ninstrucciones= Nins;
       this.NPagV = NPagV;
       Matriz = new int[NPagV][NPagV];
       Rellenar_Matriz(NPagV);
       TablaDeInstrucciones = new int[Nins];
       ValorDeFila= new int[Nins][2];
    }
    private void Rellenar_Matriz(int NPagV){
        for(int i=0 ; i<NPagV; i++){
            for(int j=0 ; j<NPagV ; i++){
                Matriz[i][j]=0;
            }
        }
    }
    private void Rellenar_FilasYColumnas(int NPagV){
        for(int i=0 ; i<NPagV; i++){
            Matriz[NPagV][i]= 1;
        }
        for(int i=0 ; i<NPagV; i++){
            Matriz[i][NPagV]= 0;
        }
        System.out.print(Arrays.toString(Matriz));
    }
    private void CalculoDeValores(){
        int ValorFila;
        for(int i=0; i<NPagV ;i++){
            for(int j=0; j<Ninstrucciones; j++){
                if(i == TablaDeInstrucciones[j]){
                    ValorFila= Calculo(i);
                    ValorDeFila[i][0] = i;
                    ValorDeFila[i][1] = ValorFila;
                }
            }
        }
    }
    private int Calculo (int fila){
        int valor = 0;
        for(int k = 0; k < NPagV; k++){
            if(Matriz[fila][k] == 1){
                valor = valor + (2^(NPagV-k));
            }
        }
        return valor;
    }
    private void Fallo_de_Pagina(int PaginaNueva){
        CalculoDeValores();
        int LRU = ValorDeFila[0][1];
        int PAR = ValorDeFila[0][0];
        for(int i=0; i<Ninstrucciones; i++){
            for(int j=0; j<Ninstrucciones-1;j++){
                if(LRU > ValorDeFila[j+1][1]){
                    LRU = ValorDeFila[j+1][1];
                    PAR = ValorDeFila[j+1][0];
                }
            }
        }
        TablaDeInstrucciones[PAR]=PaginaNueva;
        Ejecucion(TablaDeInstrucciones[PAR]);
    }
    private void Ejecucion(int NPagVirtual){
        Rellenar_FilasYColumnas(NPagVirtual);
    }
    
}
