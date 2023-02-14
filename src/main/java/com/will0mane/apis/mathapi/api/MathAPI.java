package com.will0mane.apis.mathapi.api;

import com.will0mane.apis.mathapi.api.exceptions.AlreadyInstantiatedException;

import java.util.function.DoubleBinaryOperator;

public class MathAPI {

    private static boolean instantiated = false;

    public MathAPI(){
        if(instantiated) {
            try {
                throw new AlreadyInstantiatedException(MathAPI.class);
            } catch (AlreadyInstantiatedException e) {
                e.printStackTrace();
            }
        }
        instantiated = true;
    }

    public double multipleMathCall(double initialValue, double[] doubles, DoubleBinaryOperator forEach){
        double result = initialValue;
        for(double d : doubles){
            result = math(result, d, forEach);
        }
        return result;
    }

    private double math(double initialValue, double value, DoubleBinaryOperator method){
        return method.applyAsDouble(initialValue, value);
    }

}
