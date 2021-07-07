

public class Main
{
public static void main(String[] args){
double randomInput=Math.random()*(2)+1;
System.out.println("randomInput: " +(int)randomInput);
switch((int)randomInput){
case 1:
System.out.println("Employee is part time");
break;
case 4:
System.out.println("Employee is full time");
break;
default:
System.out.println("Employee is full time");
break;
}
}
