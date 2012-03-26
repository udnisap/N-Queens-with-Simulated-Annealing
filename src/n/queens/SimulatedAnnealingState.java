package n.queens;

import java.util.Random;

/**
 *
 * @author Rumal
 */
public class SimulatedAnnealingState extends State {

    Random randomGenerator = new Random();

    public SimulatedAnnealingState(int boardSize) {
        super(boardSize);
        for (int i = 0; i < boardSize; i++) {
            q[i] = new Queen(i, randomGenerator.nextInt(boardSize));
        }
    }

    public SimulatedAnnealingState(int boardSize, Queen q[]) {
        super(boardSize);
        this.q = q;
        cost = 0;
    }


    @Override
    public State getNextState() {
        int i;
        Queen nextStateQueen[] = new Queen[boardSize];
        //randomly pick a queen we want to change at a time.
        int rand = randomGenerator.nextInt(boardSize);

        for (i = 0; i < boardSize; i++) {
            nextStateQueen[i] = new Queen(q[i].getIndexOfX(),
                    q[i].getIndexOfY());
            //we only change that randomly picked queen in this state. 
            //if the current queen is not the queen we picked
            //the next state of that queen will be same as the previos queen.
            if (rand == i) {
                int temp = randomGenerator.nextInt(boardSize);
                //this is to ensure that the new state will not be the same as the 
                //previoius state
                while (temp == q[i].getIndexOfY()) {
                    temp = randomGenerator.nextInt(boardSize);
                }
                //new state will be added to the new state
                nextStateQueen[i] = new Queen(q[i].getIndexOfX(), temp);
            }
        }

        return new SimulatedAnnealingState(boardSize, nextStateQueen);
    }
}
