package n.queens;

/**
 *
 * @author Rumal
 */
public class Queen {
	int indexOfX, indexOfY;

	public Queen() {

	}

	public Queen(int indexOfX, int indexOfY) {
		this.indexOfX = indexOfX;
		this.indexOfY = indexOfY;
	}

	public void setIndexOfX(int indexOfX) {
		this.indexOfX = indexOfX;
	}

	public void setIndexOfY(int indexOfY) {
		this.indexOfY = indexOfY;
	}

	public int getIndexOfX() {
		return indexOfX;
	}

	public int getIndexOfY() {
		return indexOfY;
	}
        public void moveLeft(){
            indexOfY--;
        }
        public void moveRight(){
            indexOfY++;
        }
}

