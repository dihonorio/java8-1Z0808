package main;


interface Printable {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //Line 9
}

class NewsPaper extends Paper { //Line 12
    public void setMargin() {};
    public void setOrientation() {};  //Line 14
   
}

public class Question020 {
    public static void main(String[] args) {
    	  try {
              main(args);
          } catch (Exception ex) {
              System.out.println("CATCH-");
          }
              System.out.println("OUT");
    }
}