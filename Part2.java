import edu.duke.*;
import java.io.File;
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
   public String findSimpleGene(String dna, String startCodon, String stopCodon){
    String result = "";
    int startIndex = dna.toLowerCase().indexOf("atg");
        if (startIndex == -1){
            return "";
        }
    int stopIndex = dna.toLowerCase().indexOf("taa", startIndex + 3);
        if (stopIndex == -1){
            return "";
        }
    int multiple = (stopIndex-startIndex) % 3;
        if(multiple == 0){
        
            result = dna.substring(startIndex, stopIndex + 3);    
        }
        
    return result;
   }
    
   public void testSimpleGene (){
    String dna = "GCTACTGGTCACTAA";
    String startCodon = "ATG";
    String stopCodon = "TAA";
    System.out.println("DNA strand is " + dna);
    String gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "CCTTGTGCATGCGCTGCAC";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "CCTTGTGCACGCGCTGCAC";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "CCTTGTGCATGCGCTGCTAAC";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "ccttgtgcatgcgctgctaac";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "CCTTGTGCATGCGCTGCACTAA";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna, startCodon, stopCodon);
    System.out.println("Gene is " + gene);
   }
}
