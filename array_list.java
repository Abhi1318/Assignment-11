import java.util.*;
class ArrayList
{
    private int arr[];
    private int size;
    private int index;
    private int osize;
    ArrayList(int size)
    {
        this.size=size;
        arr = new int[this.size];
        index=-1;
        this.osize=size;
    }
    public void add(int data)
    {
        if(index==size-1)
        {
            this.size=this.size*2;
            int temp[]=arr;
            arr=new int[this.size];
            for(int i=0;i<=index;i++)
            {
                arr[i]=temp[i];
            }
            index++;
            arr[index]=data;
        }
        else
        {
            index++;
            arr[index]=data;
        }
    }
    public void traverse()
    {
        if(index==-1)
        {
            System.out.println("List is Empty!");
        }
        else
        {
            for(int i=0;i<=index;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("\nList is Traversed!");
        }
    }
}
public class AL 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of ArrayList: ");
        int n=sc.nextInt();
        ArrayList a=new ArrayList(n);
        int data;
        System.out.println("Enter the Elements of the ArrayList:");
        for(int i=0;i<n;i++)
        {
            data=sc.nextInt();
            a.add(data);
        }
        System.out.println("Entered ArrayList: ");
        a.traverse();
    }
}