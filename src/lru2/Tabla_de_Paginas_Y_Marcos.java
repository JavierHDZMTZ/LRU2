package lru2;
public class Tabla_de_Paginas_Y_Marcos {
    
    private static int matriz[];
     private static int matriz1[];
      
    private void Inicializar_B(int n_pagVrtuales){
     matriz = new int [n_pagVrtuales];
      
    }
    private void Rellenar_B(int n_pagVrtuales){
         for(int i=0 ; i<n_pagVrtuales ; i++){
            matriz1[i]=0;
        }
    }
    
     private void Inicializar_R(int n_pagVrtuales){
     matriz1 = new int [n_pagVrtuales];
      
    }
    private void Rellenar_R(int n_pagVrtuales){
         for(int i=0 ; i<n_pagVrtuales ; i++){
            matriz1[i]=0;
        }
    }
    
    private void Rellenar_filasR(int Numero){
        for(int i=0 ; i<Numero; i++){
        if(matriz[i]!=0){
               
            matriz1[i]=0;
        
        }else {
           matriz1[i]=1;
           
           }
        }
      
    }
    
   public int marco_pag (int ram, int tam_pag) {
       int resp=0;
       resp=ram/tam_pag;
       return resp;
    }
  
}
