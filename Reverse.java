public class Reverse{
public static void main(String args[]){

int num=123,r;
int rev=0;

while(num>0){
r=num%10;
rev=(rev*10)+r;
num=num/10;
}

if(rev %2==0){
System.out.println( "even number");
}
else{
System.out.println("odd number");

}
}
}

