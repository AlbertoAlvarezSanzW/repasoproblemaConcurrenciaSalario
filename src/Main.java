
/*
Vamos a simular como un cliente se va quedando sin dinero
 */

public class Main {
    public static void main (String[]args){
        try{
            // al poner el join nos pedira meter un try catch, hemos de englobarlo todo
        SimulacionLecturaSaldo simulacion1 = new SimulacionLecturaSaldo(25);
        simulacion1.start();
        simulacion1.join(); // en este caso el join sirve para "sincronizar" todos los hilos
        SimulacionLecturaSaldo simulacion2 = new SimulacionLecturaSaldo(35);
        simulacion2.start();
        simulacion2.join();
        SimulacionLecturaSaldo simulacion3 = new SimulacionLecturaSaldo(45);
        simulacion3.start();
        simulacion3.join();
        SimulacionLecturaSaldo simulacion4 = new SimulacionLecturaSaldo(50);
        simulacion4.start();
        simulacion4.join();
        SimulacionLecturaSaldo simulacion5 = new SimulacionLecturaSaldo(60);
        simulacion5.start();
        simulacion5.join();
        SimulacionLecturaSaldo simulacion6 = new SimulacionLecturaSaldo(85);
        simulacion6.start();
        simulacion6.join();
        SimulacionLecturaSaldo simulacion7 = new SimulacionLecturaSaldo(100);
        simulacion7.start();
        simulacion7.join();

        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
