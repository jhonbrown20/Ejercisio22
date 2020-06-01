package Ejercisio23;

import java.util.Scanner;

public class Ejercisio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la dimension del primer array");
        int n1 = entrada.nextInt();
        System.out.println("Introduce la dimension del segundo array");
        int n2 = entrada.nextInt();

        int[] arreglo1 = new int[n1];
        int[] arreglo2 = new int[n2];

        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println(" digite los numeros del primer arreglo ");
            arreglo1[i] = entrada.nextInt();
            // System.out.print(arreglo1[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < arreglo2.length; j++) {
            System.out.println(" digite los numeros del segundo arreglo");
            arreglo2[j] = entrada.nextInt();
            //  System.out.print(arreglo2[j] + " ");
        }

        System.out.println();

        int[] mezcla = new int[n1 + n2];
        int in_parray = 0;//inicialisa el array
        int in_sarray = 0;//dondese inicia el array
        int next_value_p = 1;// hasta donde se evalua 
        int next_value_s = 1;// hasta donde se evalua 

        for (int x = 0; x < mezcla.length; x++) {
// evaluar de donde inica hasta donde se va 
            if (in_parray >= next_value_p && in_sarray >= next_value_s) {
                next_value_p += 1;
                next_value_s += 1;
            }
//es para pasar al siguiente numero 
            if (in_parray < next_value_p && in_parray < arreglo1.length) {
                mezcla[x] = arreglo1[in_parray];
                // si quitas el numero uno de abajo solo se queda el primer elemento y no recorre  
                in_parray = in_parray + 1;
            } else if (in_sarray < next_value_s && in_sarray < arreglo2.length) {
                mezcla[x] = arreglo2[in_sarray];
                // si quitas el numero uno de anajo solo queda recorre el primer arreglo y el segundo arreglo se queda con el 1 numerp
                in_sarray = in_sarray + 1;
            }

        }
        System.out.println(" los elementos del primer arreglo es ");

        for (int i = 0; i < arreglo1.length; i++) {

            System.out.print(arreglo1[i] + " ");
        }
        System.out.println(" ");

        System.out.println(" los elementos del segundo arreglo es ");

        for (int j = 0; j < arreglo1.length; j++) {

            System.out.print(arreglo2[j] + " ");
        }
        System.out.println(" ");

        System.out.println(" elementos del tercer arreglo");

        for (int z = 0; z < mezcla.length; z++) {
            System.out.print(mezcla[z] + " ");
        }
    }

}
