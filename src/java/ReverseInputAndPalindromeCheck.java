public class ReverseInputAndPalindromeCheck {

    public String reverseInput(String s){
        char[] ch = s.toCharArray();
        int size = s.length();
        for(int i=0;i<size/2;i++){
            char temp = ch[i];
            ch[i]=ch[size-i-1];
            ch[size-i-1]=temp;
        }
        //System.out.println(ch);
        String result = new  String(ch);
        return result;
    }

    public String reverseInputAndPalindromeCheck(String s) {

         String s1 = reverseInput(s);
        //System.out.println("s1=" +s1);
        if (s1.equals(s)) {
            return "success";
        } else {
            return "fail";
        }


    }
 }
