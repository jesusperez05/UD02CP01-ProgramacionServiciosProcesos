public class Main {
    static void main() {

        Thread hebra1 = new Thread(new Hebra(100 , 'A'));
        Thread hebra2 = new Thread(new Hebra(100 , 'B'));
        Thread hebra3 = new Thread(new Hebra(100 , 'C'));

        hebra1.start();
        hebra2.start();
        hebra3.start();
    }
}