public class Board {

  private String[][] squares = new String[10][10];

// Milestone 1: Write the constructor code: you need to initialize the squares variable, and then set every cell in squares to "-" by using nested loops. Write the toString method, again using nested loops to print all values separated by spaces and with line breaks in appropriate positions. Test these methods by running the Battleship class (throughout this program you can type "b" to print the toString representation of the Board being used).
  
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
        System.out.print(squares[r][c] + " ");
      }

      System.out.println(" ");
    }
    return "";
  }

// Milestone 2: Write the addShip method. It may be helpful to split this method into two parts: one where the parameter horizontal is true, the other where it is false. In each case you will need to use if statements to determine whether all parts of the ship are on the board, then iterate through the intended squares for the ship to determine whether there is already a ship in the way. If the ship can be placed you can iterate through the relevant squares again, changing them to "b". Don't forget to add returns to indicate what the outcome of placing the ship is. Test your method thoroughly using the runner class.

  public boolean addShip(int row, int col, int len, boolean horizontal) {
    
    if(horizontal == true)
    {
      
    }
    
    if(horizontal == false)
    {
      
    }
    
    
    
    
    
    
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
