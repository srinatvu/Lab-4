/*
Lab 4
Vishnu Srinath
Date: Sept. 21
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
Random r = new Random();
int randomNum = r.nextInt(50) + 1;
System.out.println("The Random number is: " + randomNum);
for (int i = randomNum;i>=0;i--){
  System.out.println(i + "\n");
}
if (randomNum <= 5){
  System.out.println("Ahoy mateys!");
}
else if(randomNum > 25 && randomNum < 42){
  System.out.println("Cannonball!");
}
else{
  System.out.println("Blast off!");
}
  }
}