package lru2;
public class Algoritmo_LRU2 {
    private long Matriz[][];
    public int TablaDeInstrucciones [], Ninstrucciones, NPagVr;
    private int ValorDeFila[][];
    
    public void Inicializado(int NPagV, int Nins){
       Ninstrucciones= Nins;
       this.NPagVr = NPagV;
       Matriz = new long[NPagV][NPagV];
       Rellenar_Matriz(NPagV);
       TablaDeInstrucciones = new int[Nins];
       ValorDeFila= new int[NPagVr][2];
    }
    private void Rellenar_Matriz(int NPagV){
        for(int i=0 ; i<NPagV; i++){
            for(int j=0 ; j<NPagV ; j++){
                Matriz[i][j]=0;
            }
        }
    }
    private void Rellenar_FilasYColumnas(int NPagV){
        for(int i=0 ; i<NPagVr; i++){
            Matriz[i][NPagV]= 1;
        }
        for(int i=0 ; i<NPagVr; i++){
            Matriz[NPagV][i]= 0;
        }
    }
    public void CalculoDeValores(){
        int ValorFila;
        for(int i=0; i<NPagVr ;i++){
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
        int divi=1;
        for(int i = 0; i<NPagVr ; i++){
            if(i>0){
                divi = divi * 2;
            }
        }
        for(int k = 0; k < NPagVr ; k++){
            if(Matriz[fila][k] == 1){
                valor = valor + (divi);
            }
            divi=divi/2;
        }
        return valor;
    }
    public void Fallo_de_Pagina(int PaginaNueva){
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
        System.out.println("Pagina a reemplazar: "+PAR);
        TablaDeInstrucciones[PAR]=PaginaNueva;
        Ejecucion(TablaDeInstrucciones[PAR]);
    }
    public void Ejecucion(int NPagVirtual){
        Rellenar_FilasYColumnas(NPagVirtual);
        for(int i= 0 ; i < NPagVr; i++){
            System.out.println("");
            for(int j= 0 ; j< NPagVr;j ++){
                    System.out.print("["+Matriz[j][i]+"]");
                }
            }
        System.out.println("");
        }
        
    }
