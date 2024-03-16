import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SolvingPostfix
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n  =in.nextInt();
            String s=in.next();
            int a=0,b=0;
            Stack<Integer> st = new Stack<>(); 
            for(int i=0;i<n;i++)
            {
                char ch = s.charAt(i);
                if(ch=='+')
                {
                    b=st.pop();
                    a=st.pop();
                    st.push(a+b);
                }
                else if(ch=='-')
                {
                    b=st.pop();
                    a=st.pop();
                    st.push(a-b);
                }
                else if(ch=='*')
                {
                    b=st.pop();
                    a=st.pop();
                    st.push(a*b);
                }
                else if(ch=='/')
                {
                    b=st.pop();
                    a=st.pop();
                    st.push(a/b);
                }
                else
                    st.push(ch-'0');
            }
            System.out.println(st.pop());
        }
    }
}
