import java.util.Scanner;
public class CalorieTracker {
   public static void main (String[] args) {
      Scanner console = new Scanner(System.in);
      int answer;
      int numba;
      System.out.println("Hello! Welcome to Calorie Tracker! This app helps you change your weight while keeping your diet relatively the same.");
      System.out.println("How many activities have you completed today? options: walking, running, weightlifting, biking, soccer, football, basketball (please enter an integer).");
      numba = console.nextInt();
      int caloriesb = 0;
      int caloriesc= 0;
      int calorb = prompter(caloriesb);
      for(int x = 1; x < numba; x++) {
         System.out.println("Do you want to enter any more of your activities for today? yes(1), no(2)");
         answer = console.nextInt();
         if (answer == 1) {
            calorb = calorb + prompter(caloriesb);
         }
         else {
            System.out.println("Alright, sounds good.");
            x = 1000;
         }
      }
      int calorc = burner(caloriesc);
      later(calorb, calorc);
      }
   public static int prompter(int caloriesb) {
      int activity;
      int minutes;
      Scanner console = new Scanner(System.in);
      System.out.println("Please type an activity you have completed--walking(1), running(2), weightlifting(3), biking(4), soccer(5), football(6), basketball(7):");
      activity = console.nextInt();
      System.out.println("Please type how many minutes you have done this activity:");
      minutes = console.nextInt();
      if(activity == 1) {
         caloriesb = caloriesb + minutes * 6;
         }
      else if(activity == 2) {
         caloriesb = caloriesb + minutes * 13;
         }
      else if(activity == 3) {
         caloriesb = caloriesb + minutes * 6;
         }
      else if(activity == 4) {
         caloriesb = caloriesb + minutes * 8;
         }
      else if(activity == 5) {
         caloriesb = caloriesb + minutes * 9;
         }
      else if(activity == 6) {
         caloriesb = caloriesb + minutes * 8;
         }
      else if(activity == 7) {
         caloriesb = caloriesb +minutes * 10;
         }
      else {
         System.out.println("This is not an accepted input.");
         }
      System.out.println();
      return(caloriesb);
      }
   public static int burner(int caloriesc) {
      Scanner console = new Scanner(System.in);
      System.out.println("Now, enter the average number of calories you consume daily:");
      caloriesc = console.nextInt();
      return(caloriesc);
   }
   public static void later(int calorb, int calorc) {
      int goal;
      int caloriesn;
      int help;
      int bananas;
      int mins;
      Scanner console = new Scanner(System.in);
      System.out.println();
      System.out.println("Would you like to gain(1), lose(2), or maintain(3) your current weight?");
      goal = console.nextInt();
      int caloriesd = calorc - calorb;
      if (goal == 1) {
         if (caloriesd >= 300) {
            System.out.println("Great, you're on track to gain weight today! If you decide to exercise more, make sure to eat enough food to match the calories you burn.");
            }
         else {
            caloriesn = 300 - caloriesd;
            System.out.println("You need to eat " + caloriesn + " more calories today.");
            System.out.println("Need ideas for gaining weight? yes(1), (2)no:");
            help = console.nextInt();
            if (help == 1) {
               bananas = caloriesn / 105;
               System.out.println("You could eat " + bananas + " bananas and be on track for today.");
               System.out.println("Good luck!");
            }
            else {
               System.out.println("Alright, good luck!");
            }
         }
      }
      if (goal == 2) {
         if (caloriesd <= -300) {
            System.out.println("Great, you're on track to lose weight today! If you decide to exercise more, don't hesitate to eat more food if it matches the calories you burn. If you decide to eat more, try something low in calories or match it with more exercise.");
            }
         else {
            caloriesn = 300 + caloriesd;
            System.out.println("You need to burn " + caloriesn + " more calories today.");
            System.out.println("Need ideas for burning calories? yes(1), (2)no:");
            help = console.nextInt();
            if (help == 1) {
               mins = caloriesn / 4;
               System.out.println("You could play " + mins + " minutes of ping pong and be on track for today.");
               System.out.println("Good luck!");
            }
            else {
               System.out.println("Alright, good luck!");
            }
         }
      }
      if (goal == 3) {
         if (-300 <= caloriesd && caloriesd <= 300) {
            System.out.println("Great, you're on track to maintain your weight today! If you decide to exercise more, make sure to eat enough food to match the calories you burn and vice versa.");
            }
         else if(caloriesd >= 300) {
            caloriesn = caloriesd - 300;
            System.out.println("You need to burn " + caloriesn + " more calories today.");
            System.out.println("Need ideas for burning calories? yes(1), (2)no:");
            help = console.nextInt();
            if (help == 1) {
               mins = caloriesn / 4;
               System.out.println("You could play " + mins + " minutes of ping pong and be on track for today.");
               System.out.println("Good luck!");
            }
            else {
               System.out.println("Alright, good luck!");
            }

         }
         else {
            caloriesn = -300 - caloriesd;
            System.out.println("You need to eat " + caloriesn + " more calories today.");
            System.out.println("Need ideas for gaining weight? yes(1), (2)no:");
            help = console.nextInt();
            if (help == 1) {
               bananas = caloriesn / 105;
               System.out.println("You could eat " + bananas + " bananas and be on track for today.");
               System.out.println("Good luck!");
            }
            else {
               System.out.println("Alright, good luck!");
            }
         }
      }
   }
}
