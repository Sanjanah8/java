#include<stdio.h>
#include<conio.h>
void main()
{
int l,b,a,p,x,y,c;
clrscr();
printf("enter length:",l);
scanf("%d",&l);
printf("\n enter breadth:",b);
scanf("%d",&b);
c=l*b;
printf("\n area of the rectangle:%d",c);
p=2*(l+b);
printf("\n perimeter of the rectangle:%d",p);
printf("\n enter value of a:",a);
scanf("%d",&a);
x=a*a;
printf("\n area of the square:%d",x);
y=2*a;
printf("\n perimeter of the square:%d",y);
getch();
}