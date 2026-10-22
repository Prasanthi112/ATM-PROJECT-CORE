package atm;
import java.util.Scanner;

public class AtmMain{
private static int status'
public static void main(String[]args){
AtmOperationInterf op= new AtmOperationImpl();
int atmnumber = 12345;
int atmpin = 123;
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to ATM Machine!");
System.out.println("Enter atm number:");
int atmnumber1 = sc.nextInt();
System.out.printl("Enter pin:");
int atmpin1= sc.nextInt();
if((atmnumber == atmnumber1)&&(atmpin == atmpin1)){
while(true){
System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit amount\n4.View MiniStatement\n5.exit");
System.out.println("Enter choice:");
int ch = sc.nextInt();
if(ch==1){
op.viewBalance();
}
else if(ch==2){
System.out.println("Enter amount to withdrawn"):
double withdrawAmount= sc.nextDouble();
op.withdrawAmount(withdrawAmount);
}
else if(ch==3){
System.out.println("Enter Amount of Deposit:"):
double depositAmount= sc.nextDouble();
op.depositAmount(depositAmount);
}
else if(ch==4){
op.viewMiniStattemnet();
}
else if((ch==5){
System.out.println("Collect your Atm Card\n Thank you for choosing ATM Machine");
System.exit(status);
}
else
{
System.out.println("incorrect ATM Number or pin");
System.exit(status);
}
}

