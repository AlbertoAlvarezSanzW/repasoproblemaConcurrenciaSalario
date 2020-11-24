


public class SimulacionLecturaSaldo extends Thread{


    //declaramos una constante
    private final int dineroantesdegastas;

    public SimulacionLecturaSaldo(int dineroantesdegastas){
        this.dineroantesdegastas = dineroantesdegastas;
    }

    @Override
    public void run() {
        try {
            System.out.println("Simulamos la lectura del saldo del cliente");
            // metemos el dinero que le hemos puesto
            // para ellos especificamos Cartera.dinero;
            int dinero = Cartera.dinero;
            // metemos un sleep qpara simular la lectura inicial
            long tiempodeespera = (long) (Math.random()*1000);
            sleep(tiempodeespera);
            dinero = dinero - this.dineroantesdegastas;

            // ponemos otro sleep para similar el tiempo que darta en realizarla
            sleep(tiempodeespera);

            // simulamos la escritora de saldo:
            System.out.println("Simulamos la escritura del saldo del cliente");
            Cartera.dinero = dinero;

            // "guardamos" la actualización de su salario
            System.out.println("El resultado guardado en la base de datos es " + Cartera.dinero+"\n");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
