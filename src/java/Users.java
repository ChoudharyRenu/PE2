public class Users {
    private String firstName = new String(), lastName= new String();
    private int age;
    private float salary;
    public boolean isValidAge(int age){
        if(age>18 && age <60) {
            return true;
        }
        else {
            return false;

        }
    }
    public String getFullName(String s1,String s2){
        return s1.concat(s2);
    }
}
