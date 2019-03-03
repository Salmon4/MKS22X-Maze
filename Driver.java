import java.util.*;
import java.io.*;
public class Driver{

    public static void main(String[]args){
      String filename = "data2.dat";
      try{
        Maze f;
        f = new Maze(filename);//true animates the maze. <-- not working
        //f.setAnimate(true);
        System.out.println(f.solve());
        //f.solve();
        System.out.println(f);
      }
	catch(FileNotFoundException e){
        System.out.println("Invalid filename: "+filename);
      }
    }
}
