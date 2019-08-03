package com.stackroute;

public class Array {
    public static void main(String args[]) {
    Array array = new Array();
    array.singleDimensionArraymethod();
    }

    public void singleDimensionArraymethod() {
        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;//initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
//traversing array
        for (int i = 0; i < a.length; i++) {//length is the property of array
            System.out.println(a[i]);
        }
    }
    public void twoDimensionalArray(){
        //declaring and initializing 2D array
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
//printing 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
