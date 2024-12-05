
package u2_manual.fp;

import java.util.Scanner;
public class U2_MANUALFP {
    public static void main(String[] args) {
        Scanner entra=new Scanner(System.in);
        System.out.println("Que animal desea esterilizar?\nPerro 20% descuento\nGato 10% descuento\nConejo 50% descuento\nCuyo 80% descuento");
        String seleleccion=entra.nextLine();
        double Perro=500*.20, Gato=520*.10,Conejo=350*.50,Cuyo=400*.80;
        switch(seleleccion){
            case "Perro":
                System.out.println("Tu descuento es de:$"+ Perro);
                System.out.println("El costo total es de $400");
                break;
            case "Gato":
                 System.out.println("Tu descuento es de:$"+ Gato);
                         
                   System.out.println("El costo total es de $448");
                break;
            case "Conejo":
                   System.out.println("Tu descuento es de:$"+ Conejo);
                   System.out.println("El costo total es de $175");
                break;
            case "Cuyo":
                 System.out.println("Tu descuento es de:$"+Cuyo);
                 System.out.println("El costo total es de $80");
                break;
            default: System.out.println("Esta opcion no es valida");
                
        }
    }
}
