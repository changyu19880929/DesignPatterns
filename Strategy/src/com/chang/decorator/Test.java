package com.chang.decorator;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.decorator
 * @date 2019-09-04 13:03
 * @Copyright 北京木联能软件股份有限公司
 */
public class Test {
    public static void main(String[] args) {
        Person changyu = new Changyu();
        changyu = new Jacket(changyu);
        changyu = new Hat(changyu);
        changyu.show();
//        System.out.println("买单，老王总共消费："+changyu.cost());
    }
}
