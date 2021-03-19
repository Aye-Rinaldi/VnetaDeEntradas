package ar.com.xeven;

public class Zona {
    //atributos
    private int entradasPorVender;

    //constructor
    public Zona(int n) {
        this.entradasPorVender = n;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    //metodo para vender las entradas
    public void vender(int nEntradas){
        if (entradasPorVender==0){
            System.out.println("Ya no quedan entradas para esa  zona.");
        } else if (entradasPorVender<nEntradas){
            System.out.println("Solo me quedan "+entradasPorVender+" estas entradas para esta zona");

        } if (entradasPorVender>=nEntradas){
            entradasPorVender -= nEntradas;
            System.out.println("Aqui tiene sus "+nEntradas+" entradas, gracias");
        }
    }

}

