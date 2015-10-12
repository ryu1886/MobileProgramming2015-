package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);
       String input = null;
       int i=1;
       
      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));

          /**
           구현하시오. 
          **/
         while((input =inputStream.readLine()) != null){   	
        	   outputStream.println(i+input);
        
				i++;  	
         }
                  
         inputStream.close( );
         outputStream.close( );
         
      }catch(FileNotFoundException e){ /** catch() 구문 작성하시오 **/
    	  e.printStackTrace();
      }catch(IOException e){
    	  e.printStackTrace();
      }

   }
}