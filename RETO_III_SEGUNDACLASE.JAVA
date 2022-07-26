public class TarjetaPlata extends TarjetaCine{
    //Atributos
    private int cantidadVisitas;
    private boolean elegibleOro;
    

    //Constructor
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
        this.cantidadVisitas =0;
        this.elegibleOro = false;
        
    }

    //Método
    @Override
    public double pagar(String[] cuenta){
        
        double totalSinDescuento = 0;
        double total=0; 
        
        for (int i=0; i <cuenta.length; i++){
            if(cuenta[i].equals("Boleta")){
                totalSinDescuento = totalSinDescuento + 6000;
               
            }
            if (cuenta[i].equals("Combo 1 - Crispetas + Gaseosa")){
                    totalSinDescuento = totalSinDescuento + 8000;
                   
            }
            if( cuenta[i].equals("Combo 2 - Perro + Gaseosa")){
                totalSinDescuento = totalSinDescuento + 12000;
                
            }
        }
        cantidadVisitas = cantidadVisitas +1;
        total = totalSinDescuento * (0.9);
        if (cantidadVisitas == 5){
                elegibleOro = true;
            }
       
        return total;
    }

    //Getters y Setters
    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
}