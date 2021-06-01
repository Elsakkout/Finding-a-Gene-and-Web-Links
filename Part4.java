import edu.duke.*;
import java.io.File;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {
  public static void main(String args[]){
     URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html"); 
       for ( String word : ur.words() ) {
	   String low = word.toLowerCase();
	   if ( low.contains( "youtube.com" ) && ( low.contains( "https://" ) || low.contains( "http://" ) ) ) {	    
	     int start = low.indexOf("\"");
	     int end = low.lastIndexOf("\"");
	     String link = word.substring( start, end);
	     System.out.println( link );
       
            }
			
		}
        
    
    }
}
