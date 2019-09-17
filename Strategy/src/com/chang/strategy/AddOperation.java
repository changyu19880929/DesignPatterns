package com.chang.strategy;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang
 * @date 2019-09-04 10:44
 * @Copyright 北京木联能软件股份有限公司
 */
public class AddOperation implements Operation {
    @Override
    public int operation(int num1,int num2) {
        return num1 + num2;
    }
}
