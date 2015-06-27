//Created by Jack Gola
//This is a very basic and simple typing test

//idea:  quick and easy typing test,  only 20 or so words long.  no time limit and 
//gives you the results fast, similar to ten fast fingers but with faster results

import java.util.*;

 

public class TypingTest extends Engine

{ 

   

    public static void main (String args[])
    {
        
        
        // These are for the algorithm thats supposed to make the
        // words not be in a long line.  
        
//        int cSCcheck = clusterSizeController + 1;
//        
//        // Booleans that are responsible for determining the amount
//        // of words in the typing test.  short = 15, medium = 30, etc.
//        boolean shortTest = false;
//        boolean mediumTest = false;
//        boolean longTest = false;
//        boolean startCountdownTimer = false;        
        boolean adam = false;
//        boolean arrayController = false;
        
       
        //String randomSolver[];
       
        
        
       
        
        
        
        
        
        
        
        
        //copy paste from stack overflow that is responsible for 
        //making the generator work.  All it does is take a random string
        //from the words array.  
        
        //int idx = new Random().nextInt(words.length);
        //String random = (words[idx]);
        
        //This is just the menu prompt when you first start the typing test
        
        //Start Testing stuff
        
        //System.out.println("Number of words in array = " + words.length + "\n");
        
        //End Testing stuff
        System.out.println("Welcome to Jack Gola's Typing Challenge 2015!\n"
                + "This test will be 60 seconds long and will let you know\n"
                + "your approximate words per minute (WPM).\n\n"
                + "1 - Start Typing Test\n"
                + "2 - Instructions\n"
                + "3 - Past Scores\n");
        
                
                
        
         //this takes input from the user
         // this is responsible fot the size of the word cluster
        Scanner kbReader = new Scanner (System.in);
        Scanner choiceReader = new Scanner (System.in);
        int choice = choiceReader.nextInt();
        
                
        switch(choice)
        {
        case 1: // start typing test
            System.out.println("Generating random word cluster..."
                    + "\nThe 60 second timer will begin when you start typing.  \n");
            
            generateRandomArray();
            
            
            
            //These are the different timers
            Timer Array = new Timer();
            Timer Ready = new Timer();
            Timer Set = new Timer();
            Timer Go = new Timer();
            
            
            
            Ready.schedule(new TimerTask() 
            {
                @Override
                public void run() 
                    {                
                        System.out.println("\nReady");
                    }
            }, 1000);
                
            Set.schedule(new TimerTask() 
            {
                @Override
                public void run() 
                    {                
                        System.out.println("Set");
                    }
            }, 2000);
            Go.schedule(new TimerTask() 
            {
                @Override
                public void run() 
                    {                
                        System.out.println("Go!");
                        boolean adam = true;
                    }
            }, 3000);    
            
            
        //this below should generate a cluster of words that will be
        //eventually be typed by the user
        //the number that is <= to is how many times a set of x (5) will
        //go so if its 3 then there will be 15 words.  
        
               
            
            break;
        default:   
            System.out.println("Selection wasn't vaild.  Restart program and try again.");
    }
        if (adam = true)
            {                
                String userInput = kbReader.nextLine();
                String ip[] = userInput.split("\\s");
                
                System.out.print(Arrays.toString(ip));
                
                
            }
}
}