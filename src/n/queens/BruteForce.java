package n.queens;

/**
 *
 * @author Rumal
 */
public class BruteForce extends NQueen {

    public BruteForce(int boardSize, int tollerenceCost) {
        super(boardSize,tollerenceCost);
        currentState = new BruteForceState(boardSize);
    }

    @Override
    public void solve() {
        State s = currentState.getNextState();
        while (s != null) {
            if (isSolvedPossition(s)) {
                currentState = s;
                return;
            }
            s = currentState.getNextState();
        }
        

    }

}
