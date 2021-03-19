package ar.com.xeven;
/*
Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles.
Hay que controlar que existen entradas antes de venderlas.
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zona zonaPrincipal = new Zona(100);
        Zona zonaCompraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        int opcion2 = 0;
        int n = 0;

        do {
            System.out.println("\n\nEXPOCOCHES CAMPANILLAS");
            System.out.println("1.Mostrar numero de entradas libres.");
            System.out.println("2.Vender entradas.");
            System.out.println("3.Salir.");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            if (opcion==1){
                System.out.println("\n\nEn la Zona Principal hay "+zonaPrincipal.getEntradasPorVender());
                System.out.println("En la Zona de Compra-Venta hay "+zonaCompraVenta.getEntradasPorVender());
                System.out.println("En la Zona Vip hay "+zonaVip.getEntradasPorVender());
            }
            if (opcion==2){
                System.out.println("\n\n1. Principal");
                System.out.println("2. Compra-Venta");
                System.out.println("3. Vip");
                System.out.print("Para que zona quiere comprar las entradas?");

                opcion2 = sc.nextInt();
                System.out.print("Cuantas entradas quieres?");
                n = sc.nextInt();

                switch (opcion2){
                    case 1:
                        zonaPrincipal.vender(n);
                        break;
                    case 2:
                        zonaCompraVenta.vender(n);
                        break;
                    case 3:
                        zonaVip.vender(n);
                        break;
                    default:
                }
            }

        } while (opcion<3);

    }
}
