package Techsparx.Arrays;

import java.util.Scanner;
/**
 * Write a description of class linearSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class linearSearch
{
    public static void main(String args[])
    {
        //Declaration 
        Scanner sc = new Scanner(System.in);
        int n, key, position = 0 , index = 0;
        int a[]; 
        boolean flag = false; 

        //Prompt and Accept the number of students  
        System.out.println("Please enter the number of students: ");
        n = sc.nextInt(); 

        //Create a new Array
        a = new int[n]; 

        //Reading the Array Elements from the user 
        System.out.println("Please enter the number(s): ");
        for(int i = 0  ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        
        //accepting the value to be searched from the user 
        System.out.println("Please enter the number to be searched ");
        key = sc.nextInt(); 
        
        //linear Search 
        for(int i = 0 ; i < a.length ; i++)
        {
            if( key == a[i])
            {
                flag = true; 
                index = i; 
                position = i+1;
                break;
            }
        } 
        
        //dislpaying the result after searching 
        if(flag == true)
        {
            System.out.println(key + " was found at position " + position + ", index: " + index );
        }
        else if ( flag == false)
        {
            System.out.println(key + " was not found");
        }
    }
}

/*
public class linearSearch
{
public static void main(String args[])
{
//declaration
Scanner sc = new Scanner(System.in);
int n, position, key, a[];
boolean flag;

//reading the number of array elements
System.out.println("Enter the number of array elements: ");
n = sc.nextInt();

//creating an array of size n
a = new int[n];

//reading the array elements 
System.out.println("Enter " + n + " array elements");
for(int i = 0 ; i < n ; i++)
{
a[i] = sc.nextInt();
}

//reading the array element to be found/searched
System.out.println("Enter th number to be found: ");
key = sc.nextInt();

//Linear search
flag = false ; position = 0 ;
for(int i = 0 ; i < n ; i++)
{
if(key == a[i])
{
flag = true;
position = i+1;
break;
}
}

//chccking flag
if(flag == true)
{
System.out.println(key + " is found at position: " + position);
}   
else
{
System.out.println(key + " is NOT found ");
}
}
}
 */
