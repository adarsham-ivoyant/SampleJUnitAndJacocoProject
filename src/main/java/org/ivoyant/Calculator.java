package org.ivoyant;

public class Calculator {
    public static int add(int number1,int number2){
        return number1+number2;
    }
    public static int sub(int number1,int number2){
        return number1-number2;
    }
    public static int mul(int number1,int number2){
        return number1*number2;
    }
    public static double div(double number1,double number2){
        if(number2==0){
            throw new IllegalArgumentException("Number cant not be divided by 0");
        }
        return number1/number2;
    }
    //int[] arr={35,78,12,34,98,65};
    public static int findMax(int arr[]){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
