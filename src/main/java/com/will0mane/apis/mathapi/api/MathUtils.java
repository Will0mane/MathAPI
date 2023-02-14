package com.will0mane.apis.mathapi.api;

import net.objecthunter.exp4j.ExpressionBuilder;

@SuppressWarnings("unused")
public class MathUtils {

    private static final MathAPI MathAPI = new MathAPI();

    private MathUtils(){}

    public static double powerMultiple(double value, double... powers){
        return MathAPI.multipleMathCall(value, powers, Math::pow);
    }

    public static double root(double value, double indexes){
        return powerMultiple(value,1.0 / indexes);
    }

    public static double addMultiple(double value, double... adding){
        return MathAPI.multipleMathCall(value, adding, Double::sum);
    }

    public static double subtractMultiple(double value, double... subs){
        return MathAPI.multipleMathCall(value, subs, (aDouble, aDouble2) -> aDouble - aDouble2);
    }

    public static double multiplyMultiple(double value, double... multiply){
        return MathAPI.multipleMathCall(value, multiply, (aDouble, aDouble2) -> aDouble * aDouble2);
    }

    public static double divideMultiple(double value, double... divide){
        return MathAPI.multipleMathCall(value, divide, (aDouble, aDouble2) -> aDouble / aDouble2);
    }

    public static double expression(ExpressionBuilder builder){
        return builder.build().evaluate();
    }

}
