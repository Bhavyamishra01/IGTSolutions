class A 
{ 
static int x=10; 

static void abc() 
{ 
System.out.println("HI abc method"); } } 

class Demo24 
{ 
public static void main(String args[]) 
{ 
A.abc(); 
System.out.println("X:"+A.x); 

} }


static. //it will not belong to objects
//without creating object we can access.