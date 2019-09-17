package com.chang.strategy;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang
 * @date 2019-09-04 11:01
 * @Copyright 北京木联能软件股份有限公司
 */
public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int operation(int num1,int num2){
        return this.operation.operation(num1,num2);
    }
}
