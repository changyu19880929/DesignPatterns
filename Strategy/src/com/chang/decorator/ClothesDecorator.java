package com.chang.decorator;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.decorator
 * @date 2019-09-04 12:58
 * @Copyright 北京木联能软件股份有限公司
 */
public abstract class ClothesDecorator implements Person{
    protected Person person;

    public ClothesDecorator(Person person) {
        this.person = person;
    }
}
