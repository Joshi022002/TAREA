package tarea1;

import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {
        
        try{
            String Cadena_numeros="";
            String convertir_numero="";
            int suma_num_pares=0;
            int suma_num_impares=0;
            int posicion_numero=0;
            int recorre_cadena1=0;
            int recorre_cadena2=0;
            int cadena_convertida=0;
            Scanner leer_cadena = new Scanner(System.in);
            System.out.println("------------------------------------------------------");
            System.out.print("Ingrese una lista de numeros separadas por comas: ");
            Cadena_numeros=leer_cadena.nextLine();
            String numeros_separados[]=Cadena_numeros.split(",");
            //recorre la cadena para saber si todos los numeros estan separados por comas
            for(recorre_cadena1=0;recorre_cadena1<numeros_separados.length;recorre_cadena1++){
                for(recorre_cadena2=0;recorre_cadena2<numeros_separados[recorre_cadena1].length();recorre_cadena2++){
                    if(!Character.isDigit(numeros_separados[recorre_cadena1].charAt(recorre_cadena2))&&
                            numeros_separados[recorre_cadena1].charAt(recorre_cadena2)!=','){
                        System.out.println("------------------------------------------------------");
                        System.out.println("ingrese una cadena separada por comas");
                        System.exit(0);
                    }
                }
            }
            //fin condicion de saber si todos los numeros estan separados por comas
            System.out.println("------------------------------------------------------");
            //ciclo de funciones
            for(posicion_numero=0; posicion_numero<numeros_separados.length;posicion_numero++){
                //convertir cadena a un numero entero
                convertir_numero=numeros_separados[posicion_numero]; 
                cadena_convertida=Integer.parseInt(convertir_numero);
                //determinar si es numero par o impar y los suma segun la condicion anterior
                if (cadena_convertida%2==0) {
                    suma_num_pares=suma_num_pares+cadena_convertida;
                    System.out.println("El numero "+cadena_convertida+" es numero par");
                }else{
                    suma_num_impares=suma_num_impares+cadena_convertida;
                    System.out.println("El numero "+cadena_convertida+" es numero impar");
                }
             }
                //muestra los resultados
                 System.out.println("------------------------------------------------------");
                 System.out.println("La suma de los numeros pares es: "+suma_num_pares);
                 System.out.println("La suma de los numeros impares es: "+suma_num_impares);
                 System.out.println("------------------------------------------------------");
                 if(suma_num_pares>suma_num_impares){
                 System.out.println("La suma de los numeros pares es mayor a la de los impares");
                }else{
                System.out.println("La suma de los numeros impares es mayor a la de los pares");
        }
                System.out.println("------------------------------------------------------");
            }
            catch(Exception ex){
                System.out.println("ocurrio un error");
            }
    }
}
