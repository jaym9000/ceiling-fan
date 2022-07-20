import java.util.*;

public class ceiling_fan{

    static boolean quit = false;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        

        do{
            System.out.println("If you want to change the ceiling settings please select one of the 2 cords. \nPress 1: to increase fan speed.\nPress 2: to reverse the direction of current speed setting (can only be undone by pressing 2 again).\nPress 3: to repeat options.\nPress 4: to quit.");
            String selectCord = scan.nextLine();
        switch (selectCord) {
            case "1":
                //   speedCord();
                System.out.println("Pressed 1!");
                break;
            case "2":
                // reverseDirection();
                System.out.println("Pressed 2!");
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