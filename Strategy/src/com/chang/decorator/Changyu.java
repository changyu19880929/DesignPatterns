package com.chang.decorator;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.decorator
 * @date 2019-09-04 12:54
 * @Copyright 北京木联能软件股份有限公司
 */
public class Changyu implements Person {
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("未装饰前");
    }
}
