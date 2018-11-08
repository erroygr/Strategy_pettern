package model;

public class OperationXOR implements Strategy {
    @Override
    public String doOperation(String num1, String num2) {
        String rez="";

        for(int i=0;i<num1.length();i++){
            if(num1.charAt(i) == num2.charAt(i))
            {
                rez+="0";
            }
            else
                rez += "1";
        }
        return rez;
    }
}
