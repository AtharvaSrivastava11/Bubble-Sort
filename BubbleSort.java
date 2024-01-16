/*
 * large elements come to the end of array by swapping with adjacent elements 
 * Time Complexity : O(n^2)
 */
public class BubbleSort{
    public static void sortAlgorithm(int arr[])
    {
        for(int i=0; i<arr.length-1; i++) // i : turns
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                { // swapping :
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void display(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {5,4,1,3,2};
        sortAlgorithm(arr);
        display(arr);
    }
}