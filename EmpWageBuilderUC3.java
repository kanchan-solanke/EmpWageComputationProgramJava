public class Main
{
public static void main(String[] args){
double randomInput=Math.random()*(2)+1;
int wagePerHour = 20;
int partTimeSalHr = 4, fullTimeSalHr = 8;
System.out.println("randomInput: " +(int)randomInput);
switch((int)randomInput){
case 1:
System.out.println("Employee is part time and salary is"+(wagePerHour*partTimeSalHr));
break;
case 1:
System.out.println("Employee is full time and salary is"+(wagePerHour*fullTimeSalHr));
break;
}
if (randomInput == 1){
System.out.println("Employee is part time and salary is"+(wagePerHour*partTimeSalHr));
}
else if(randomInput == 2){
System.out.println("Employee is full time and salary is"+(wagePerHour*fullTimeSalHr));
}
}
