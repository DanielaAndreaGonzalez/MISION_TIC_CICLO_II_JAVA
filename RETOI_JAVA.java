public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static double[] reporte(double[] listaNotas) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        
        double promedio = 0; 
        double suma =0;
        double contador =0;
        double mayorNota = 0;
        double menorNota = 9999;
        double []arrayDevuelta = new double [3];
       
        for (int i=0; i<listaNotas.length; i++){
            
            
            if (listaNotas[i]<menorNota){
                menorNota =listaNotas[i];
            }
        
            if( listaNotas[i]> mayorNota){
                mayorNota =listaNotas[i];
            }
            
            suma+=listaNotas[i];
            contador++;
        
        }
        
        promedio = suma /contador;
    
        arrayDevuelta[0]= promedio;
        arrayDevuelta[1] = menorNota;
        arrayDevuelta[2] = mayorNota;
    
        return arrayDevuelta;
        
        
        
    }
}