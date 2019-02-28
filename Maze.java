import java.util.*;
import java.io.*;
public class Maze{


    private char[][]maze;
    private boolean animate;//false by default

    /*Constructor loads a maze text file, and sets animate to false by default.

      1. The file contains a rectangular ascii maze, made with the following 4 characters:
      '#' - Walls - locations that cannot be moved onto
      ' ' - Empty Space - locations that can be moved onto
      'E' - the location of the goal (exactly 1 per file)

      'S' - the location of the start(exactly 1 per file)

      2. The maze has a border of '#' around the edges. So you don't have to check for out of bounds!


      3. When the file is not found OR the file is invalid (not exactly 1 E and 1 S) then: 

         throw a FileNotFoundException or IllegalStateException

    */

    public Maze(String filename) throws FileNotFoundException{
        File text = new File(filename);
	Scanner inf = new Scanner(text);
	Scanner inf1 = new Scanner(text);
	int row = 0;
	int col = 0;

	col = inf.nextLine().length();
	while(inf.hasNextLine()){
		inf.nextLine();
		row++;
	}
	row++;
	maze = new char[row][col];
	for (int r = 0; r < row; r++){
		String line = inf1.nextLine();
		for (int i = 0; i < line.length(); i++){
			maze[r][i] = line.charAt(i);
		}
	}
    }
    

    private void wait(int millis){
         try {
             Thread.sleep(millis);
         }
         catch (InterruptedException e) {
         }
     }


    public void setAnimate(boolean b){

        animate = b;

    }


    public void clearTerminal(){

        //erase terminal, go to top left of screen.

        System.out.println("\033[2J\033[1;1H");

    }






   /*Return the string that represents the maze.

     It should look like the text file with some characters replaced.

    */
    public String toString(){
	String ans = "";
	for (int r = 0; r < maze.length; r++){
		for (int c = 0; c < maze[r].length; c++){	
			ans += maze[r][c];
		}
		ans += "\n";
	}	
	return ans;

    }



    /*Wrapper Solve Function returns the helper function

      Note the helper function has the same name, but different parameters.
      Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists.

    */
    public int solve(){
	int row;
	int col;
	for (int r = 0; r < maze.length; r++){
		for (int c = 0; c < maze[r].length; c++){
			if (maze[r][c] == "S"){
				row = r;
				col = c;
			}
		}
	}
            //find the location of the S. 
	maze[r][c] = "@";

            //erase the S


            //and start solving at the location of the s.

	return solve(row,col);
    }

    /*
      Recursive Solve function:

      A solved maze has a path marked with '@' from S to E.

      Returns the number of @ symbols from S to E when the maze is solved,
      Returns -1 when the maze has no solution.


      Postcondition:

        The S is replaced with '@' but the 'E' is not.

        All visited spots that were not part of the solution are changed to '.'

        All visited spots that are part of the solution are changed to '@'
    */
    private int solve(int row, int col,int steps){ //you can add more parameters since this is private
	if (maze[row][col] == "E"){
		return steps;
	}
	if (maze[row-1][col] == " "){//goes up
	
	}
	if (maze[row+1][col] == " "){//goes down
	
	}
	if (maze[row][col-1] == " "){//goes left
	
	}
	if (maze[row][col+1] == " "){//goes right
	
	}
	

        //automatic animation! You are welcome.
        if(animate){

            clearTerminal();
            System.out.println(this);

            wait(20);
        }

        //COMPLETE SOLVE

        //return -1; //so it compiles
    }


}



