package model;

public class OperationAND implements Strategy {
    @Override
    public String doOperation(String num1, String num2) {
        String rez="";

        for(int i=0;i<num1.length();i++){
            if(num1.charAt(i) == num2.charAt(i))
            {

                rez=rez+String.valueOf(num1.charAt(i));
            }
            if(num1.charAt(i) != num2.charAt(i)){
                rez=rez+ String.valueOf(0);
                // rez=""+0;
            }
        }

        return rez;
    }
}
