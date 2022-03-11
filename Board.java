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

// public boolean addShip(int row, int col, int len, boolean horizontal) - Attempts to add a ship of length len to the grid, starting at the row and column specified and proceeding either rightwards (if horizontal is true), or downwards (if horizontal is false). If the ship can be placed in the place specified, each square making up the ship should be set to "b", and the method should return true. A ship may not be placed if it would go off the grid, or would intersect another ship on the grid. If the ship cannot be placed, no values in squares should be changed and the method should return false.
  
// Milestone 2: Write the addShip method. It may be helpful to split this method into two parts: one where the parameter horizontal is true, the other where it is false. In each case you will need to use if statements to determine whether all parts of the ship are on the board, then iterate through the intended squares for the ship to determine whether there is already a ship in the way. If the ship can be placed you can iterate through the relevant squares again, changing them to "b". Don't forget to add returns to indicate what the outcome of placing the ship is. Test your method thoroughly using the runner class.

/*  public boolean addShip(int row, int col, int len, boolean horizontal) {
    
    if(horizontal == true) // horizontal, row major
    {
      for(int r = row ; r < 10 ; r++)
        {
          for(int c = col ; c < 10 ; c++)
            {
              
            }
        }
    }

      
    
    if(horizontal == false) // vertical, column major
    {
      for(int c = 0 ; c < 10 ; c++)
        {
          for(int r = 0 ; r < 10 ; r++)
            {
              
            }
        }
    }
    return false;
  }
*/

// public boolean foundShip(int len) - Search the board for any possible ships of length len. If there are exactly len consecutive squares (either horizontal or vertical) containing a "b" String somewhere in the grid, then return true, otherwise, return false.

// Milestone 3: Write the foundShip method. Again you will probably need to think about horizontal and vertical cases separately: you will need to check for both types of ship in this method. When iterating through consecutive squares (either horizontal or vertical) you will need a variable to keep track of the length of a continuous row of squares containing "b". Remember to check the value of this and reset it when there is a non-"b" square or the end of a row/column is reached.
  
  public boolean foundShip(int len) {

  // searching horizontally

    
    return false;
  
    
    
  }

  public int shoot(int row, int col) {
    return 0;
  }

  public boolean gameOver() {
    return false;
  }

}
