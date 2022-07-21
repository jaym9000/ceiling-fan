// Author: Jean-Marc Mahoro
// Github: https://github.com/jaym9000/ceiling-fan

import java.util.*;

public class ceiling_fan{

    // global values
    static boolean quit = false;
    static int fanSpeed = 0;
    static boolean reversed = false;

    static void speedCord(){
        // Change the fan speed each time cord is pulled.

        if(reversed == false){
            // Increase speed if reverse is NOT activated.
            if(fanSpeed == 3){
                fanSpeed = 0;
            }else
            fanSpeed++;
        }else{
            // Decrease sped if reverse IS activated.
            if(fanSpeed == 0){
                fanSpeed = 3;
            }else
            fanSpeed--;
        }
        if(fanSpeed != 0){
            System.out.println("Updated fan speed is now: " + fanSpeed);
        }else
            System.out.println("Fan is now off!");
    }

    static boolean reverseCord(){
        // If false, reverse NOT activated. If true, reverse IS activated.

        return reversed = !reversed; 
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        // Do while loop continues to prompt user until user presses 4 to quit.
        do{
            System.out.println("\nIf you want to change the ceiling settings please select one of the 2 cords. \nPress 1: to increase fan speed.\nPress 2: to reverse the direction of current speed setting (can only be undone by pressing 2 again).\nPress 3: to repeat options.\nPress 4: to quit.");
            String selectCord = scan.nextLine();
        switch (selectCord) {
            case "1":
                speedCord();
                break;
            case "2":
                reverseCord();
                System.out.println("Ceiling fan settings have been reversed");
                break;
            case "3":
                break;
            case "4":
                quit = true;
                break;
            default:
                System.out.println("\nReminder! The numbers to press are 1 to increase fan speed, 2 to reverse the direction, 3 to repeat options, and 4 to quit.");
                break;
          }
        }while(!quit);

          scan.close();
        
    }
}