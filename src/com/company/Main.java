package com.company;
import java.util.Scanner;

public class Main {

    public static double[] CreateArray(){
        double[] arr = new double[7];

        for (int i = 0; i < arr.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input "+ i);

            double r = sc.nextDouble();
            arr[i] = r;
        }
        return arr;
    }

    public static double CalculateDev(double[] arr){

        double deviation = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter average");

        double average = sc.nextDouble();

        for (double element : arr) {
            deviation = average - element;
        }
        return deviation;
    }

    public static double CalcUncertainty(double deviation){
      return (deviation/7);
    }

    public static void main(String[] args) {
        var a = CreateArray();
        var b = (CalculateDev(a));
        System.out.println(CalcUncertainty(b));
    }
}