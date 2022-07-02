import java.util.Scanner;

public class BuscandoEsferasDragon {

    public static int Casagoku() {
        Scanner ds = new Scanner (System.in);
        System.out.println("ingrese la distancia a la casa de Goku:");
        int distanciaCasaGoku  = ds.nextInt();
        return distanciaCasaGoku;
    }

    public static int ProximaEsfera (int x) {
        int distanciaProximaEsfera = (x * 2) + 4;
        return distanciaProximaEsfera;
    }

    public static int DuracionViaje(int distanciaCasaGoku,int distanciaProximaEsfera) {
        int tiempoDuracionViaje = (distanciaCasaGoku + distanciaProximaEsfera) / 5;
        return tiempoDuracionViaje;
    }
    public static void main(String[] args) {
        int distancia = Casagoku();
        int proxima = ProximaEsfera(distancia);
        int duracion = DuracionViaje(distancia, proxima);

        System.out.print(distancia + " ");
        System.out.print(proxima + " ");
        System.out.println(duracion);

        if (duracion <= 20) {
            System.out.println("uno");
        }else if (duracion > 20 && duracion <= 30) {
            System.out.println("dos");
        }else if (duracion > 30 && duracion <= 50) {
            System.out.println("tres");
        }else {
            System.out.println("cuatro");
        }
    }
}