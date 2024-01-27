package git_eclipse_package;

/*

Programa que cuenta con un array de nombres y se los muestra al
usuario en forma de lista numerada. Este debe elegir uno introduciendo
su número y el programa lo mueve a la primera posición conservando el
orden relativo de los restantes.

Repetir esta operación hasta que el usuario introduzca un -1


Salida del programa
-----------------------------------
1 - Mar
2 - Isabel
3 - Ivan
4 - Pol
5 - Eva
6 - Ruth

Elige uno : 2

1 - Isabel
2 - Mar
3 - Ivan
4 - Pol
5 - Eva
6 - Ruth

Elige uno : 4

1 - Pol
2 - Isabel
3 - Mar
4 - Ivan
5 - Eva
6 - Ruth

Elige uno : -1


*/
import java.io.*;

public class E18_EligePrimero {

    public static void main(String[] args) throws Exception {

        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));

        String[] nombres = {"Mar","Isabel","Ivan","Pol","Eva","Ruth"};

        boolean continuar = true;
        while (continuar){

            mostrarNombres(nombres);

            //Elegir
            System.out.print("\nElige uno : ");
            int n = Integer.parseInt(entrada.readLine());
            
            if (n==-1){
                continuar = false;
            } else {
                nombres=ordenarNombres(nombres,n);
            }
        }
    }
    
    public static void mostrarNombres(String[] nombres) {
        //Mostrar nombres
        for(int i=0; i<nombres.length; i++){
            System.out.printf("%d - %s\n",i+1,nombres[i]);
        }
    }
    
    public static String[] ordenarNombres(String[] nombres, int n) throws Exception {
        if(n<1 || n>nombres.length){
            throw new Exception("Error.");
        }

        n--; //para empezar por 0

        //Guardamos el elegido
        String tmp = nombres[n];

        //Desplazar los anteriores hacia abajo
        for(int i=n; i>0; i--){
            nombres[i] = nombres[i-1];
        }

        //Colocar en primera posición el que se había elegido
        nombres[0] = tmp;
        
        return nombres;
    }   
}
