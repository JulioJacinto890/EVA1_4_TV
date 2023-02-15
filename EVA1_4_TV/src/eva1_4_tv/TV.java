/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_tv;

/**
 *
 * @author hp
 */
public class TV {
    private int volumen;
    private int canal;
    private boolean poder;
    //constructores 
    public TV(){//constructores default
    //métodos para operar la TV (interfaz)
    volumen = 0;
    canal = 0;
    poder = false;//apagado
    }
    //metodo para operar la TV (interfaz)
    //encerder y apagar la TV
    public void cambiarEstadoPoder(){
        //verificar el estado de la TV
        if (poder == true){
            poder = false;
        System.out.println("Apagando pantalla");
    }else{
            poder = true;
         System.out.println("Encendido pantalla");
    }
    }
    //Volumen 
    public void subirVolumen(){
       if (poder&&volumen<100){
        volumen++;
       System.out.println("Volumen: " +volumen);
       }
        
    }
     public void bajarVolumen() {
             
             if (poder&&volumen>0) {
                 volumen--;
                 System.out.println("Volumen" + volumen);
             }
         }
     
     public void subircanal () {
         if(poder){
             if (canal< 100){
                 canal++;
             }else{
                 canal=0;
             }
             System.out.println("canal" + canal);
                 
     }
     } 
     public void bajarcanal (){
         if (poder){
             if(canal>0){
             canal--;}
             else{
             canal=100;
         }
         }
          System.out.println("canal" + canal);
     }
      
}

