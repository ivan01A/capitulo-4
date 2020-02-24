/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package From_Letter_Writer;
/**
 *
 * @author Ivan
 */
public class FromLetterWriter {
    public class FormLetterWriter {
    private static final String SALUDO1="Dear Mr. or Ms.";
    private static final String SALUDO2="Dear";
    public String lastName;
    public String firstName;
    private static final String LETTER_END = "Thank you for your recent order";
    public void displaySaludo(String last)
    {
        lastName=last;
        System.out.println(SALUDO1+lastName);
        }
     public void displaySaludo(String last, String first)
     {
         lastName=last;
         firstName= first;
         System.out.print(SALUDO2+firstName+""+lastName);
     }
     public void displayLatter()
     {
      System.out.print(LETTER_END);
     }   
      /**
    * @param args the command line arguments
     */
    public static void main(String[] args){
     FormLetterWriter test1 = newFormLetterWriter();
     FormLetterWriter test2 = newFormLetterWriter();
     test1.displaySalutation("Perez");
     test1.displayLetter();
     test2.displaySalutation("Perez","Alejandro");
     test2.displayLetter();
    }

