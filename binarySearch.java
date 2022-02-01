import java.util.Scanner;
public class binarySearch
{
    public static void main(String args[])
    {
        //declaration
        Scanner sc = new Scanner(System.in);
        int n, position, key;
        int[] a;
        int low, high, mid;
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
        
        //initialization
        low = 0; high = n-1; mid = 0; position = 0;
        flag = false;
        
        //Binary search
        while(low <= high)
        {
            mid = low + (high - low) / 2;
            
            if( key == a[mid])
            {
                flag = true;
                position = mid+1;
                break;
            }
            else if( key < a[mid] ) 
            {
                high = mid -1 ;
            }
            else if( key > a[mid] )
            {
                low = mid + 1;
            }
        }
        
        //display syatement
        if( flag == true ) 
        {
            System.out.println(key + " is found at position " + position );
        }
        else
        {
            System.out.println(key + " is NOT found");
        }
    }
}
