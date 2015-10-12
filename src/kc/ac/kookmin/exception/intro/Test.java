package kc.ac.kookmin.exception.intro;
import java.io.*;

class AAA {
	
	String input = null;
	String path = AAA.class.getResource("").getPath();
	File file = new File(path + "a.txt");
	private BufferedReader bufferedReader;  

	public void readFile() {
		

		try{
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			
			while ((input = bufferedReader.readLine()) != null){
				System.out.println(input);
				
				
			}
			
		} catch(Exception e){
				e.printStackTrace();		
		}finally{
			try{bufferedReader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}

public class Test {
    public static void main(String args[]) {
    	AAA a = new AAA();
         	a.readFile();
         
    }
} 

