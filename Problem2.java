/*
Write a program which takes two doubles and then prints the sum of the numbers when they are both rounded to their nearest whole number. You may assume the doubles are always positive.

Hint: Remember not to just truncate the number - look back at the slides from the lesson if you don't remember how to ensure the number is rounded, not just truncated.

Sample run:
```
Two original numbers:
57.3934
22.5211
Answer: 57 + 23 = 80
```
*/
public class Problem2
{
  public static void main(String[] args)
  {
    double d = 57.3934;
    double n = 22.5211;
    int wholenum1 = (int)(d + 0.5);
    int wholnum2 = (int)(n + 0.5);
    System.out.println(wholenum1 + wholnum2);
  }
}
