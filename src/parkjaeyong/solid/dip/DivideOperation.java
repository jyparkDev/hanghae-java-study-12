package parkjaeyong.solid.dip;

import parkjaeyong.solid.isp.AbstractOperation;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    @Override
    public boolean isInvalid(int firstNumber, int secondNumber) {
        if(secondNumber == 0)
            return false;
        return true;
    }
    @Override
    public String getOperator() {
        return "/";
    }
}
