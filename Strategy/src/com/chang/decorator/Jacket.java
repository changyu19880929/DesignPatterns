package com.chang.decorator;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.decorator
 * @date 2019-09-04 12:59
 * @Copyright 北京木联能软件股份有限公司
 */
public class Jacket extends ClothesDecorator {
    public  Jacket(Person person){
        super(person);
    }

    @Override
    public Double cost() {
        return person.cost()+50;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("累计消费"+this.cost());
    }
}
