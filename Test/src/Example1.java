import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(new File("data.csv"));
			   while (scanner.hasNext()) {
			    System.out.println(scanner.next()+"dassa");
			   }
			   scanner.close();
			  } catch (FileNotFoundException e) {
			   e.printStackTrace();
			  } 
		
		
		
        

    }
}


