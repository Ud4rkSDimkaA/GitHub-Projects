package com.company;

public class Homework5 {
    public void showArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public void homeTask1() {
        double[][] array = new double[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (Math.random());
                array[i][j] += 1;
            }
        }
        showArray(array);
    }

    public void homeTask2(Integer[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (i % 2 == 0 || j % 2 == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public void homeTask3() {
        Integer[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8,}};
        Integer[][] array2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Integer[][] finalArray = new Integer[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array1.length - 1; k++) {
                    finalArray[i][j] = array1[i][k] * array2[k][j];
                }
            }
        }

        for (int i = 0; i < finalArray.length; i++) {
            System.out.println();
            for (int j = 0; j < finalArray[i].length; j++) {
                System.out.print(finalArray[i][j] + " ");
            }
        }

    }

    public void homeTask4() {
        int sumOfElementsInArray = 0;
        Integer[][] array = new Integer[3][3];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.random() + 15;
                System.out.print(array[i][j] + " ");
                sumOfElementsInArray += array[i][j];
            }
        }

        System.out.println(sumOfElementsInArray);
    }

    public void homeTask5() {
        Integer[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
        }

        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (i == j) {
                    System.out.println(array1[i][j]);
                }
            }
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (i + j == 2) {
                    System.out.println(array1[i][j]);
                }
            }
        }
    }

    public void homeTask6() {
        Integer[][] array1 = {{3, 7, 1}, {8, 2, 6}, {9, 11, 5}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = j + 1; k < array1.length; k++) {
                    if (array1[i][j] > array1[i][k]) {
                        int temp = array1[i][j];
                        array1[i][j] = array1[i][k];
                        array1[i][k] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
        }
    }
}
