/*
## Problem3
Create a double and print the first three digits after the decimal point with a space between them.

Sample run:
```
decimal number: 67.3424
Answer: 3 4 2
```
Hint - to complete the second coding activity in lesson 5 you had to learn how to get individual digits from an int value. You can reuse this method once you convert the user input to an appropriate int value (you will need both multiplication and casting for this).
*/
public class Problem3
{
  public static void main(String[] args)
  {
    double num = 67.3424;
    int x = (int)(num - 67) * 1000;
    System.out.println(x);
    
    //System.out.println(a + " " + b + " " + c)
  }
}
