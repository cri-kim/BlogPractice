package com.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    private final static String DELIMITER = " ";
    public void inputString(){
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        System.out.println(calculator(value));
    }

    public String calculator(String value){
        String[] values = value.split(DELIMITER);
        for(int i=0;i<values.length;i++) {
            if (isNumberic(values[i])) {
                continue;
            }
            String operator = values[i];
            int n1 = Integer.parseInt(values[i-1]);
            int n2 = Integer.parseInt(values[i+1]);
            values[i+1] = calculate(operator, n1,n2);
        }
        return values[values.length-1];
    }
    public String calculate(String operator, int n1, int n2){
        if(isMultiple(operator)){
           return String.valueOf(n1 * n2);
        }
        if(isDivision(operator)){
            return String.valueOf(n1 / n2);
        }
        if(isPlus(operator)){
            return  String.valueOf(n1 + n2);
        }
        if(isMinus(operator)){
            return  String.valueOf(n1 - n2);
        }
        return "0";
    }


    //요구사항 안읽고 개발한 메소드 TT
    public String calculate2(String value){
        String[] values = value.split(DELIMITER);
        Stack<String> stack = new Stack();

        for(int i=0;i<values.length;i++){
            if(isNumberic(values[i])){
                stack.push(values[i]);
                continue;
            }
            if(isMultiple(values[i])){
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(values[i+1]);
                values[i+1] = String.valueOf(n1 * n2);
            }
            if(isDivision(values[i])){
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(values[i+1]);
                values[i+1] = String.valueOf(n1 / n2);
            }
        }
        while(stack.size() > 1){
            String n = stack.pop();
            if(isNumberic(n)){
                continue;
            }
            if(isPlus(n)){
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(n2+n1));
            }
            if(isMinus(n)){
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(n2-n1));
            }
        }
        return stack.pop();
    }
    public boolean isPlus(String value){
        if( value.equals("+"))
            return true;
        return false;
    }
    public boolean isMinus(String value){
        if( value.equals("-"))
            return true;
        return false;
    }
    public boolean isMultiple(String value){
        if( value.equals("*") )
            return true;
        return false;
    }
    public boolean isDivision(String value){
        if( value.equals("/"))
            return true;
        return false;
    }
    public boolean isNumberic(String value){
        try {
            Integer.parseInt(value);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
