public class Hebra implements Runnable{

    private int repeticiones;
    private char caracter;

    public Hebra(int repeticiones, char caracter) {
        this.repeticiones = repeticiones;
        this.caracter = caracter;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
    }
}
