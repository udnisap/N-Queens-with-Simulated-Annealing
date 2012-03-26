package n.queens;

/**
 *
 * @author Rumal
 */
public class Main {

    public static void main(String[] args) {
        long time;
        for (int i = 3; i < 20; i++) {
            time = System.currentTimeMillis();
            System.out.println("N = " + i);
            System.out.println("Brute Force approach");
            NQueen nq = new BruteForce(10);
            nq.solve();
            nq.show();
            System.out.println("Total Time taken :" + (System.currentTimeMillis() - time));
            time = System.currentTimeMillis();
            System.out.println("Simulated Annealing approach");
            nq = new SimulatedAnnealing(10);
            nq.solve();
            nq.show();
            System.out.println("Total Time taken :" + (System.currentTimeMillis() - time));
        }
        
    }
}
