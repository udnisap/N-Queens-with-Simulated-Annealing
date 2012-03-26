package n.queens;

/**
 *
 * @author Rumal
 */

public class BruteForce extends NQueen {

    public BruteForce(int boardSize) {
        super(boardSize);
        currentState = new BruteForceState(boardSize);
    }

    @Override
    public void solve() {
        State s = currentState.getNextState();
        show();
        
    }
}
