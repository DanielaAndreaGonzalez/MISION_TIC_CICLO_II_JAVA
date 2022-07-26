public class Solucion {
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reportes(ArrayList<Estudiante> grupo) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        
        ArrayList<Estudiante> estudianteNuevo = new ArrayList<>();
        //Object [] datos = (Object[]) estudianteNuevo.toArray(new Object[estudianteNuevo.size()]);
       Object [] datos = new Object[5];
        
        double promedio =0;
        String nombreEstMenorNota = "";
        String nombreEstMayorNota = "";
        double notaMayor =0;
        double notaMenor = 9999;
        double acumuladoNotas =0;
        
        for(Estudiante est: grupo){
        	acumuladoNotas += est.getNota();
            
            if(est.getNota() > notaMayor){
                notaMayor = est.getNota();
                nombreEstMayorNota = est.getNombreCompleto();
            }
            if(est.getNota() < notaMenor){
                notaMenor = est.getNota();
                nombreEstMenorNota = est.getNombreCompleto();
            }
            
        }
        promedio = acumuladoNotas / grupo.size();
        
        datos[0]= promedio;
        datos[1]= nombreEstMenorNota;
        datos[2]=notaMenor;
        datos[3]= nombreEstMayorNota;
        datos[4]=notaMayor;
        
        return datos;
        
        
    }
}
