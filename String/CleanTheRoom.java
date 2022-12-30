package String;

import java.util.Scanner;

public class CleanTheRoom {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            String input="";
            for(int j=0;j<n;j++)
            {
                char ch=sc.next().charAt(0);
                input=input+ch;
            }
            str[i]=input;//System.out.print(str[i]);
        }
        int count=1;
        int maxCount=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(str[i]==str[j])
                    count++;
            }
            if(count>maxCount) {
                maxCount=count;
            }
        }
        System.out.print(maxCount);
    }
}
