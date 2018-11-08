package model;

public class OperationOR implements Strategy {
    @Override
    public String doOperation(String num1, String num2) {
        String rez="";

        for(int i=0;i<num1.length();i++){
            if(num2.charAt(i) == num1.charAt(i))
            {
                rez+=num1.charAt(i);
            }
            else
                rez += "1";
            // rez=""+0;

        }
        return rez;
    }
}
