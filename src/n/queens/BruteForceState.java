package n.queens;

/**
 *
 * @author Rumal
 */
public class BruteForceState extends State {

    public BruteForceState(int boardSize) {
        super(boardSize);
        for (int i = 0; i < boardSize; i++) {
            q[i] = new Queen(i, 0);
        }
    }

    public BruteForceState(int boardSize, Queen q[]) {
        super(boardSize);
        this.q = q;
        cost = 0;
    }

    @Override
    public State getNextState() {
        int lastQ = q.length - 1;
        int boardSize = q.length;

        while (lastQ>=0) {
            if (q[lastQ].indexOfY < q.length - 1) {
                q[lastQ].moveRight();
                return this;
            }else{
                q[lastQ].setIndexOfY(0);
                lastQ--;
            }   
        }
        return null;
    }
}
