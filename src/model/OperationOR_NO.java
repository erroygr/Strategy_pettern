package model;

public class OperationOR_NO implements Strategy {
    @Override
    public String doOperation(String num1, String num2) {
        String rez = "";
        String rez1 = "";
        for (int i = 0; i < num1.length(); i++) {
            if (num2.charAt(i) == num1.charAt(i)) {
                rez += num1.charAt(i);
            } else
                rez += "1";
        }
        for (int i = 0; i < rez.length(); i++) {

            if (rez.charAt(i) == '0') {
                rez1 += 1;
            } else rez1 += 0;
        }
        return rez1;
    }
}
