import java.util.Scanner;

public class Impresora {
    public void impresoraopcione(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 2001){

           System.out.println("Ticket confirmado: 2001");
            System.out.println("Respuesta automática del equipo:");
            System.out.println("→ La instalación de la impresora está en proceso. Uno de nuestros técnicos lo contactará pronto.");

        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }

    }

    public void router(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 2015){
            // Eperando la respuesta autmatica de los compañeros
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }

    public void software(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 2018){
           // Eperando la respuesta autmatica de los compañeros
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }

    }
}
