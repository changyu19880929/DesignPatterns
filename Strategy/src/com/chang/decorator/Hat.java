package com.chang.decorator;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.decorator
 * @date 2019-09-04 13:01
 * @Copyright 北京木联能软件股份有限公司
 */
public class Hat extends ClothesDecorator{

    public Hat(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return person.cost()+100;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("累计消费"+this.cost());
    }
}
