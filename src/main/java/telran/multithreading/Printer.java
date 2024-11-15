package telran.multithreading;

public class Printer extends Thread {
    private final char symbol;
    private static final int DEFAULT_NUMBER_OF_ITERATIONS = 100;
    private static int nIterations = DEFAULT_NUMBER_OF_ITERATIONS;
    public Printer(char symbol) {
        this.symbol = symbol;
    } 

    public static void setIterations(int nIterations) {
        Printer.nIterations = nIterations;
    } 
    
    @Override
    public void run() {
        for (int i = 0; i < nIterations; i++ ) {
            System.out.println(symbol);
        }
        try {
            sleep(10);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
