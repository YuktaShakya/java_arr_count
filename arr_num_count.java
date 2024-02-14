import java.util.*;
public class arr_num_count 
{
    public static void main(String[] args)
    {
        int N , i ;
        System.out.println("Enter the size of the array");
        Scanner ob = new Scanner(System.in);
        N=ob.nextInt();
        int arr[]=new int[N];
        System.out.println("Enter the elements of the array");
        for(i=0;i<N;i++)
        {
            arr[i]=ob.nextInt();
    }
    int one=0, minusone=0, zero=0;
     float ratio=1;
           for(i=0;i<N;i++)
{ 
if (arr[i]>0) 
{
        one++;
        ratio=one/N;

        
    }
    else if (arr[i]<0)
 {
        minusone++;
        
}
    else if (arr[i]==0)
 {
        zero++;
        
}
}
System.out.println("the number of negative digits are="+minusone);
System.out.println("ration="+ratio);
System.out.println("the number of positive digits are="+one);
System.out.println("the number of zero digits are="+zero);
    
}
}
