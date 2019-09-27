public class Factorial {
    public String factorialInRange(int num){
        long result=factorial(num);
        if(result>2147483647){
            return ("the factorial of " + num + " is out of range");
        }
        else {
            return ("the factorial of " + num + " is " + result);
        }
    }
    public long factorial(int num){
        if(num==1)
            return 1;
        else
        return (num*factorial(num-1));
    }
public long factorialLong (int num){
        if(num==1){

            return 1;
        }
        else {
            return factorialLong(num-1)*num;
        }
}
    public static void main(String args[]){
        Factorial fact = new Factorial();
        System.out.println(fact.factorialInRange(13));
        System.out.println(fact.factorialLong(20));
    }
}
