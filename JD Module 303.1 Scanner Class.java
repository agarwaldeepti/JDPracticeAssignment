/*Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).
One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:
Hi 5
Our code will print:
myString is: Hi
myInt is: 5
Alternatively, you can use the BufferedReader class.
Task
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
Input Format
There are  lines of input, and each line contains a single integer.
Sample Input
42
100
125
Sample Output
42
100
125
Solution:*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

/*__________________________________________________________________________________________________________________________________________________________________________

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
 
Source: Wikipedia
Task
Given an integer, , perform the following conditional actions:
•	If  is odd, print Weird
•	If  is even and in the inclusive range of  to , print Not Weird
•	If  is even and in the inclusive range of  to , print Weird
•	If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
Input Format
A single line containing a positive integer, .
Constraints
•	
Output Format
Print Weird if the number is weird; otherwise, print Not Weird.
Sample Input 0
3
Sample Output 0
Weird
Sample Input 1
24
Sample Output 1
Not Weird
Explanation
Sample Case 0: 
 is odd and odd numbers are weird, so we print Weird.
Sample Case 1: 
 and  is even, so it isn't weird. Thus, we print Not Weird.
Solution: */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 != 0)
            System.out.println("Weird");
        else if(N%2==0)
        {
            if(N>=2 && N<=5)
                System.out.println("Not Weird");
            else if(N>=6 && N<=20)
                System.out.println("Weird");
            else if(N>20)
                System.out.println("Not Weird");
        } 
        scanner.close();
    }
}

/*__________________________________________________________________________________________________________________________________________________________________________

Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
Input Format
Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
Output Format
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
Sample Input
java 100
cpp 65
python 50
Sample Output
================================
java           100 
cpp            065 
python         050 
================================
Explanation
Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
Solution: */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-14s %03d\n", s1,x);
            }
            System.out.println("================================");

    }
}

/*__________________________________________________________________________________________________________________________________________________________________________

In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.
Input Format
There are three lines of input:
1.	The first line contains an integer.
2.	The second line contains a double.
3.	The third line contains a String.
Output Format
There are three lines of output:
1.	On the first line, print String: followed by the unaltered String read from stdin.
2.	On the second line, print Double: followed by the unaltered double read from stdin.
3.	On the third line, print Int: followed by the unaltered integer read from stdin.
To make the problem easier, a portion of the code is already provided in the editor.
Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!
Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

Solution: */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}


