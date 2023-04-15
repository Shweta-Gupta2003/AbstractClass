import java.util.*;
abstract class shape
{
double d1,d2,c;
shape(int d1)
{
this.d1=d1;
}
shape(int d1,int d2)
{
this.d1=d1;
this.d2=d2;
}

abstract void volume();
}

class cube extends shape
{
cube(int d1)
{
super(d1);
}

void volume()
{
c=d1*d1*d1;
System.out.println("Volume of a cube is "+c);
}
}

class cyclinder extends shape
{
cyclinder(int d1,int d2)
{
super(d1,d2);
}

void volume()
{
c=3.14*d1*d1*d2;
System.out.println("Volume of a cyclinder is "+c);
}

}

class sphere extends shape
{
sphere(int d1)
{
super(d1);
}

void volume()
{
c=4/3*3.14*d1*d1*d1;
System.out.println("Volume of a sphere is "+c);
}

}


class Volume
{
public static void main(String args[])
{
cube m=new cube(3);
m.volume();
cyclinder n=new cyclinder(2,3);
n.volume();
sphere s=new sphere(2);
s.volume();
}
}