import java.util.*;
class Stack
{
static int a[]=new int[6];
static int n=0;
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int c=0;
System.out.println("Enter 1.insert\n2.display\n3.delete\n");
while(c!=5)
{
c=s.nextInt();
switch(c)
{
case 1 : System.out.println("Enter element");
int b=s.nextInt();
push(b);
n++;
break;
case 2 : display();
break;
case 3 : pop();
break;
}
}
System.out.println("Stack excited");
}
static void push(int b)
{
if(n==5)
System.out.println("Stack overflow");
else{
a[n]=b;
}
}
static void display()
{
for(int i=n-1;i>=0;i++)
{
System.out.println(a[i]);
}
}
static void pop()
{
if(n==0)
System.out.println("stack underflow");
else{
System.out.println("Popped element"+a[n]);
n--;
}
}
}