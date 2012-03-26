package n.queens;

/**
 *
 * @author Rumal
 */
abstract class NQueen {

    protected  int boardSize;
    protected  State currentState, nextState;

    public NQueen(int boardSize) {
        this.boardSize = boardSize;
    }

    abstract public void solve();

    public void show() {
        int temp = 0;
        Queen q[] = currentState.getQueens();
        boolean queen = false;
        System.out.println();

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                for (int k = 0; k < boardSize; k++) {
                    if (i == q[k].getIndexOfX() && j == q[k].getIndexOfY()) {
                        queen = true;
                        temp = k;
                        break;

                    }
                }

                if (queen) {
                    System.out.print("" + temp);
                    queen = false;
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
