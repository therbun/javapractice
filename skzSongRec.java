import java.util.Scanner;
import java.util.Random;

public class skzSongRec {

  public static void main (String[] args){

    String[] edmArray = {"Miroh", "Hellevator", "Side Effects", "Victory Song", "Hall of Fame"};
    String[] rapArray = {"The Tortoise and The Hare", "Maze of Memories"};
    String[] popArray = {"Mixtape: OH", "Youtiful", "Surfin'", "Astronaut"};
    String[] lyricalArray = {"I AM YOU", "Levanter","Gone Away"};
    String[] rockArray = {"Red Lights"};

    Random random = new Random();
    int randomIndex1 = random.nextInt(edmArray.length);
    String edmresponse = edmArray[randomIndex1];

    int randomIndex2 = random.nextInt(rapArray.length);
    String rapresponse = rapArray[randomIndex2];

    int randomIndex3 = random.nextInt(popArray.length);
    String popresponse = popArray[randomIndex3];

    int randomIndex4 = random.nextInt(lyricalArray.length);
    String lyricalresponse = lyricalArray[randomIndex4];

    int randomIndex5 = random.nextInt(rockArray.length);
    String rockresponse = rockArray[randomIndex5];

    String answer1 = "";
    Scanner scan = new Scanner(System.in);

    System.out.println("What type of music do you like?");
    System.out.println("a: edm");
    System.out.println("b: rap");
    System.out.println("c: pop");
    System.out.println("d: lyrical");
    System.out.println("e: rock");

    answer1 = scan.nextLine(); 
    String loserornah = "Are you considering to listen to a Stray Kids song? (Answer yes or no )"; 
    String areyoualoser = "";


    if(answer1.equals("a")){
      System.out.println("My Stray Kids Song Recommendation is " + edmresponse + ".");
      /*System.out.println(loserornah);
      if(areyoualoser.equals("yes")) {
      System.out.println("NICE");
      }
      else if(areyoualoser.equals("no")) {
        System.out.println("smh no taste lol");
      }
      else {
        System.out.println("I didn't quite understand. Please input your answer again.");
      }*/
      
    }
    else if(answer1.equals("b")){
      System.out.println("My Stray Kids Song Recommendation is " + rapresponse + ".");
      
    }
    else if(answer1.equals("c")){
      System.out.println("My Stray Kids Song Recommendation is " + popresponse + ".");

    }
    else if(answer1.equals("d")){
      System.out.println("My Stray Kids Song Recommendation is " + lyricalresponse + ".");
      
    }
    else if(answer1.equals("e")){
      System.out.println("My Stray Kids Song Recommendation is " + rockresponse + ".");
     
    }
    else {
      System.out.println("Invalid choice. Please select a valid option. (Make sure your response is from a to e and lowercase.)");
  }

    scan.close();

  }

}


/* 
static void gradeofperson(boolean sophomore){
  int x = 15;
  int y = 16;
  if (sophomore == true) {
    System.out.println(x);
  }

  else{
    System.out.println(y);
  }
}

public static void main(String[] args){
  gradeofperson(true);
}
static void straykidsfan(boolean fanoranti){
  if (fanoranti == true) {
    System.out.println("You are cool");
  }

  else{
    System.out.println("You are not so cool");
  }
}
public static void main(String[] args) {
  straykidsfan(false); // Call the checkAge method and pass along an age of 20
}

static void myMethod(String titletrack , String group) {
    System.out.println(titletrack + " is from " + group);
  }

  public static void main(String[] args) {
    myMethod("HOT", "SEVENTEEN");
    myMethod("MIROH", "Stray Kids");
    myMethod("0x1 LOVESONG", "TOMORROW X TOGETHER");
  } */
   /*static String testvar = "yourmom";
    public static void main(String[] args) {
      System.out.println(testvar);
      System.out.println("duh duh duh duh");
    }*/

  /*public class Main {
    static void myMethod(String fname) {
      System.out.println(fname + " Refsnes");
    }
  
    public static void main(String[] args) {
      myMethod("Liam");
      myMethod("Jenny");
      myMethod("Anja");
    }
  }*/

