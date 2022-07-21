import java.util.*;

public class ceiling_fan{

    static boolean quit = false;
    static int fanSpeed = 0;
    static boolean reversed = false;

    static void speedCord(){
        // Increase the speed each Time cord is pulled.
        // (There are 3 speed settings and an "off" [speed 0] setting). If the cord is pulled on speed 3, the fan returns to the "off" setting.

        if(reverseCord() == false){
            if(fanSpeed == 3){
                fanSpeed = 0;
            }else
            fanSpeed++;
        }else{
            if(fanSpeed == 0){
                fanSpeed = 3;
            }
            fanSpeed--;
        }
        if(fanSpeed != 0){
            System.out.println("Updated fan speed is now:" + fanSpeed);
        }else
            System.out.println("Fan is now off");
    }

    static boolean reverseCord(){
        // Reverses the direction of the fan at the current speed setting. Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.

        // if false, reverse NOT activated. if true, reverse IS activated.
        return reversed = !reversed; 
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        // do while loop continues to prompt user until user pressed 4 to quit
        do{
            System.out.println("If you want to change the ceiling settings please select one of the 2 cords. \nPress 1: to increase fan speed.\nPress 2: to reverse the direction of current speed setting (can only be undone by pressing 2 again).\nPress 3: to repeat options.\nPress 4: to quit.");
            String selectCord = scan.nextLine();
        switch (selectCord) {
            case "1":
                speedCord();
                System.out.println("Speed has been increased!");
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
                System.out.println("Reminder! The numbers to press are 1 to increase fan speed, 2 to reverse the direction, 3 to repeat options, and 4 to quit.");
                break;
          }
        }while(!quit);

          scan.close();
        
    }
}