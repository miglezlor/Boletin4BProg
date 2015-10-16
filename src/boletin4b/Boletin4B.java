
package boletin4b;

import java.util.Scanner;



/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin4B {
    


    public static void main(String[] args) {
        float km,lit,vMed,pGas;
        
        Consumo cons1 = new Consumo();
        cons1.setLitros(50);
        System.out.println("Litros= " + cons1.getLitros()+"l");
        cons1.setpGas(1.57f);
        System.out.println("Precio da gasolina= "+cons1.getpGas()+"€");
        
        
        Scanner obx= new Scanner (System.in);
        System.out.println("\nIntroduce os kilómetros recorridos: ");
        km=obx.nextFloat();
        System.out.println("Introduce os litros: ");
        lit=obx.nextFloat();
        System.out.println("Introduce a velocidade media: ");
        vMed=obx.nextFloat();
        System.out.println("Introduce o prezo da gasolina: ");
        pGas=obx.nextFloat();
        
        Consumo cons2 = new Consumo(km,lit,vMed,pGas);
        System.out.println("Consumo medio= " + cons2.consumoMedio());
        cons2.setLitros(80);
        System.out.println("Velocidade media= " + cons2.getvMed());

        

    }
    
}
