
public class rotateArray {

   static void reverseArray(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String []args)
    {
        int arr[]={0,1,3,7,5};
        int n = arr.length;
        int k = 2; // number of positions to rotate
        
        

        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        reverseArray(arr,0,n-1);

          for(int i =0;i<n;i++)
          {
                System.out.print(arr[i]+" ");
          }
    }
    
}