import edu.duke.*;
import java.io.File;
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
  public boolean twoOccurrences(String stringa, String stringb){
    int count= 0; 
    int occ; 
    occ = stringb.indexOf(stringa); 

    while(occ >= 0){ 
     occ = stringb.indexOf(stringa,(occ+stringa.length()));
     count++; 
    }

    if(count >= 2){ 
     return true;
    } else{
     return false;
    } 
  }   
  
  public void testing(){
   String stringa = "by";
   String stringb = "A story by Abby Long";
   System.out.println("stringa = "+stringa + " and stringb = " + stringb);
   System.out.println(twoOccurrences(stringa, stringb));
   String after = lastPart(stringa, stringb);
   System.out.println("The part of the string after " +stringa +" in " +stringb +" is " +after);

   
   stringa = "an";
   stringb = "Banana";
   System.out.println("stringa = "+stringa + " and stringb = " + stringb);
   System.out.println(twoOccurrences(stringa, stringb));
   after = lastPart(stringa, stringb);
   System.out.println("The part of the string after " +stringa +" in " +stringb +" is " +after);

   
   stringa = "atg";
   stringb = "ctgtatgta";
   System.out.println("stringa = "+stringa + " and stringb = " + stringb);
   System.out.println(twoOccurrences(stringa, stringb));
   after = lastPart(stringa, stringb);
   System.out.println("The part of the string after " +stringa +" in " +stringb +" is " +after);
   
   stringa = "zoo";
   stringb = "forest";
   System.out.println("stringa = "+stringa + " and stringb = " + stringb);
   System.out.println(twoOccurrences(stringa, stringb));
   after = lastPart(stringa, stringb);
   System.out.println("The part of the string after " +stringa +" in " +stringb +" is " +after);
  }
  
  public String lastPart(String stringa,String stringb){
    int frst = stringa.length();
    int occ = stringb.indexOf(stringa);
    String fnal = stringb.substring(frst+occ);
    
    String result = "";
    if (occ == -1){
    result = stringb;
    } else {
    result = fnal;
    }
    
    
   return result;
  }
}
