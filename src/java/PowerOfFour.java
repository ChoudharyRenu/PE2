public class PowerOfFour {
    public Boolean powerOfFour(int num){
        if(num==0){
            return false;
        }
        else if(num>0){
            if(num%4!=0){
                return false;
            }
            else {
                num=num/4;
            }
        }
        return true;
    }
}
