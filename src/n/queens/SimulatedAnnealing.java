package n.queens;

/**
 *
 * @author Rumal
 */

public class SimulatedAnnealing extends NQueen {

    public SimulatedAnnealing(int boardSize) {
        super(boardSize);
         currentState = new SimulatedAnnealingState(boardSize);
    }

    @Override
    public void solve() {
        double temperature;
        double delta;
        double probability;
        double rand;

        for (temperature = 10000; (temperature > 0) && (currentState.getCost() != 0); temperature--) {
            nextState = currentState.getNextState();
            delta = currentState.getCost() - nextState.getCost();
            probability = Math.exp(delta / temperature);
            rand = Math.random();

            if (delta > 0) {
                currentState = nextState;
            } else if (rand <= probability) {
                currentState = nextState;
            }
        }
    }
}
