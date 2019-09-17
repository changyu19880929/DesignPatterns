package com.chang.strategy;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang
 * @date 2019-09-04 11:03
 * @Copyright 北京木联能软件股份有限公司
 */
public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //calculator.setOperation(new AddOperation());
        Operation operation = null;
        //通过反射获取实例，可以将全类名用配置文件管理
        try {
            Class<?> cls = Class.forName("com.chang.strategy.SubOperation"); // 取得Class对象
            operation = (Operation)cls.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        calculator.setOperation(operation);
        int result = calculator.operation(1,2);
        System.out.println(result);
    }
}
