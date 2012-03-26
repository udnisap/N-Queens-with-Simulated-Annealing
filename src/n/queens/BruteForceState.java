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
        int lastQ = boardSize - 1;
        while (lastQ != 0) {
            q[lastQ].moveRight();
            lastQ = boardSize - 1;
            while (q[lastQ].getIndexOfY() < boardSize && checkAttack()) {
                q[lastQ].moveRight();
            }
            if (q[lastQ].getIndexOfY() >= boardSize) {
                q[lastQ].setIndexOfY(0);
                lastQ--;
            }else{
                return this;
            }
        }
        return null;
    }

    private boolean checkAttack() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = i + 1; j < boardSize; j++) {
                int fx = q[i].getIndexOfX(), fy = q[i].getIndexOfY(), sx = q[j].getIndexOfX(), sy = q[j].getIndexOfY();
                if (fx == sx || fy == sy || Math.abs(fx - sx) == Math.abs(fy - sy)) {
                    return true;
                }
            }
        }
        return false;
    }
}
