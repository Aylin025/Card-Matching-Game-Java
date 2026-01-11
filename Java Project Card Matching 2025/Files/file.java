  /** 
   * Writes the given text to the "Files/Save.txt" file.
   */
package Files;

import java.io.*;
import java.util.Scanner; 

import Game.Shop;

public class file {

 /** 
  * Reads writes in parameter,
  *Will not work on juicemind when a file with the same name already exists.
  *TO save file on juice mind you must delete the previous one before exiting the game. 
  */    
  public static void fileWrite(String text) { 
        try {
            FileWriter myWriter = new FileWriter("Files/Save.txt");
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }   

  /** 
  * Reads file in parameter, returns file String
  */
    public static String readFile() {
      try {
          File file = new File("Files/Save.txt"); 
          Scanner myReader = new Scanner(file);
  
          // Read and return only the first line
          if (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              myReader.close();
              return data;
          }
  
          myReader.close();
          return null; // File is empty
      } catch (FileNotFoundException e) {
          System.out.println("File not found.");
          e.printStackTrace();
          return null;
      }
  }

  /*
  *Read_save method
  * Reads from Save.txt 
  */
  public static String[] read_save(){
    String data = readFile();
    String[] datas = data.split(" ");
    return datas;
  }

  public static void save(){
    fileWrite(Shop.everything());
  }

  /** 
  * Converts String to int
  */
    public static int string_to_int(String str){  
        try{
            int number = Integer.parseInt(str);
            return number; //returns int value
        }
        catch (NumberFormatException ex){
            ex.printStackTrace(); 
            return -1; //error
        } 

    }




}
