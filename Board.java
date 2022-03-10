public class Board {

  private String[][] squares;

  public Board() {

    for (int r = 0; r < squares.length; r++) {
      for (int c = 0; c < squares[r].length; c++) {
        squares[r][c] = "-";
      }
    }
  }

  public String toString() {

    for (int r = 0; r < squares.length; r++) {
      for (int c = 0; c < squares[r].length; c++) {
        System.out.println(squares[r][c]);
      }

      System.out.println(" ");
    }
    return "";
  }

  public boolean addShip(int row, int col, int len, boolean horizontal) {
    return false;
  }

  public boolean foundShip(int len) {
    return false;
  }

  public int shoot(int row, int col) {
    return 0;
  }

  public boolean gameOver() {
    return false;
  }

}
