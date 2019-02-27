import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile{
	private File text;// = new File("Maze1.txt");
	private Scanner inf;// = new Scanner(text);
	private int row = 0; 
	private int col = 0;
	private char ary[][]; //= new Char[][];
	
	public ReadFile(){
		fillAry();
		
	}
	public void fillAry() throws FileNotFoundException{
		text = new File("Maze1.txt");
		inf = new Scanner(text);
		while(inf.hasNextLine()){
			row++;
		}
		col = inf.nextLine().length();
		ary = new char[row][col];

		int currentRow = 0;
		int currentCol = 0;
		while(inf.hasNextLine()){
          	  	String line = inf.nextLine();
          	  	//System.out.println(line);//hopefully you can do other things with the line
			for (int i = 0; i < line.length();i++){
				ary[currentRow][currentCol] = line.charAt(i);
			}
			currentRow++;
			currentCol = 0;
		}	
        }      
	
	public String toString(){
		String ans = "";
		for (int r = 0; r<ary.length;r++){
			for (int c = 0; c < ary[r].length;c++){
				ans += ary[r][c];
			}
			ans += "\n";
		}
		System.out.println("YES");
		return ans;
	}
  public static void main(String args[]) throws FileNotFoundException {
try{
	ReadFile test1 = new ReadFile();
	System.out.println("YES");
	System.out.println(test1.toString());
        //instead of a try/catch, you can throw the FileNotFoundException.

        //This is generally bad behavior
 

        File text = new File("Maze1.txt");
        // can be a path like: "/full/path/to/file.txt" or "../data/file.txt"
        

        //inf stands for the input file
	/**
        Scanner inf = new Scanner(text);

        while(inf.hasNextLine()){
            String line = inf.nextLine();
            System.out.println(line);//hopefully you can do other things with the line
        }  
**/     
}
catch(FileNotFoundException e){
	System.out.println("oh no");
}
	
    }   
}
