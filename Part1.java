import edu.duke.*;
import java.io.File;
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna){
    String result = "";
    int startIndex = dna.indexOf("ATG");
        if (startIndex == -1){
            return "";
        }
    int stopIndex = dna.indexOf("TAA", startIndex + 3);
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
    System.out.println("DNA strand is " + dna);
    String gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "CCTTGTGCATGCGCTGCAC";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "CCTTGTGCACGCGCTGCAC";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "CCTTGTGCATGCGCTGCTAAC";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "CCTTGTGCATGCGCTGCACTAA";
    System.out.println("DNA strand is " + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    }
}
