import ricky.rs;

public class JugandoConHilos extends Thread{ // Thread es Hilo en ingles buajaja :D
    private int numero;
    JugandoConHilos(int numero){
        setNumero(numero);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            rs.println(i + 1 + "(hilo #" + numero + ")");
            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public static void main(String[] args) {
        
        // for (int i = 0; i < 5; i++) {
        //     JugandoConHilos hilos = new JugandoConHilos(i+1);
        //     hilos.start();
        // }

        hilitos h = new hilitos();
        Thread hilo = new Thread(h);
        hilo.start();
    }
}


class hilitos implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            rs.println(i + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

}