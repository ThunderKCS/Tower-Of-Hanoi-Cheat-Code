import java.util.*;
class TOH
{
    public static void move(int n,String s,String a,String d)
    {
        if(n>1)
        {
            move(n-1,s,d,a);
            System.out.println(s+"-->"+d);           
            move(n-1,a,s,d);
        }
        else
        {   
            System.out.println(s+"-->"+d);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        String p1="p1";String p2="p2";String p3="p3";
        move(n1,p1,p2,p3);
    }
}