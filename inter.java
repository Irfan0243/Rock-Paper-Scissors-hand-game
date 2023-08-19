import java.util.Random;
import java.util.Scanner;
public class inter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 0 for rock ,1 for paper and 2 for scissar :");
        int userinput=sc.nextInt();
        Random random = new Random();
        int computerinput= random.nextInt(3);
        if(userinput==1 && computerinput ==0 || userinput==2 && computerinput== 1 || userinput == 0&& computerinput==2){
            System.out.println("you win !");

        } else if (userinput==computerinput) {
            System.out.println("draw");

        } else {
            System.out.println("computer win !");
        }
        System.out.println("computer choice :" +computerinput);

    }
}