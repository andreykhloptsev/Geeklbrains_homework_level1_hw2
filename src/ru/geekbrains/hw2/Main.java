package ru.geekbrains.hw2;

public class Main {

    public static int i, j;// использую как счетчик для всех циклов for во всех заданиях

    public static void main(String[] args) {
        //первые 5 заданий
            task_1();
            task_2();
            task_3();
            task_4();
            task_5();

        // homework.task_6
        System.out.println("Task 6:");
//       int[] arr6_test1 = {1,1,0,4,2,4};
//       int[] arr6_test2 = {1,1,0,3,2,4};
//       int[] arr6_test3 = {1,1,0,2,4};
        //удобнее всего проверять на массивах с 0 и 1
        int[] arr6= fullArray((int)Math.round(Math.random()*10),2,-1);
        System.out.println(checkBalance(arr6));


        // homework.task_7
        System.out.println("Task 7:");
      //  int[] arr7= fullArray(10,10);
        int[] arr7= fullArray((int)Math.round(Math.random()*5)+5,10);
        int n = (int)Math.round(Math.random()*20-10);
        System.out.println("n="+n);
       shiftArray(arr7,n);


    }


    //task_1
    public static void task_1()
    {
        System.out.println("Task 1:");
        int[] arr1 = new int[10];
        for (i = 0; i <arr1.length ; i++) {
            arr1[i]=(int)Math.round(Math.random());
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Преобразованный массив:");
        for (i = 0; i < arr1.length; i++) {
            switch (arr1[i]) {
                case 0:
                    arr1[i]=1;
                    break;
                case 1:
                    arr1[i]=0;
                    break;
            }
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
    //task_2
    public static void task_2()
    {
        System.out.println("Task 2:");
        int[] arr2 = new int[8];
        for (i = 0;  i<arr2.length ; i++) {
            arr2[i]=i*3;
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

    }

    //task_3
    public static void task_3()
    {
        System.out.println("Task 3:");
        int[] arr3= {1,5,3,2,11,4,5,2,4,8,9,1};
        for (i = 0;  i<arr3.length ; i++) {

            if (arr3[i]<6)
                arr3[i]=arr3[i]*2;
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

    }
    //task_4
    public static void task_4()
    {
        System.out.println("Task 4:");
        int arr4_length=(int)Math.round(Math.random()*6)+1;
        int[][] arr4 = new int[arr4_length][arr4_length];
        for (i = 0; i <arr4_length ; i++) {
            for (j = 0; j <arr4_length ; j++) {
                if ((i==j)||(i+j==arr4_length-1)) {
                    arr4[i][j]=1;
                } else arr4[i][j]=0;
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
    }
    //task_5
    public static void task_5()
    {
        System.out.println("Task 5:");
        int min, max;
        int[] arr5= fullArray((int)Math.round(Math.random()*10)+1,10,5);
        min=arr5[0];
        max=arr5[0];
        for (i = 1;  i<arr5.length; i++) {
            if (arr5[i]>max)
                max=arr5[i];
            else if (arr5[i]<min)
                min=arr5[i];
        }
        System.out.println("min="+min+"; max="+max);
    }

    // Создает массив длиной length,
    // заполняет его рандомными значениями от start до start+rand
    // и выводит на экран
    public static int[] fullArray(int length, int rand, int start)
    {
        int[] array = new int[length];
        for (int i = 0;  i<length ; i++) {
            array[i]=(int)Math.round(Math.random()*rand)+start;
            System.out.print(array[i]+" ");
        }
        System.out.println();

        return array;
    }
    // Создает массив длиной length,
    // заполняет его рандомными значениями от 0 до rand
    // и выводит на экран
    public static int[] fullArray(int length, int rand)
    {
        int[] array = new int[length];
        for (int i = 0;  i<length ; i++) {
            array[i]=(int)Math.round(Math.random()*rand);
            System.out.print(array[i]+" ");
        }
        System.out.println();

        return array;
    }


    //метод для задания №6
    public static boolean checkBalance(int[] array)
    {
        double summa=0,s=0;
        int array_length=array.length;
        for (int i = 0; i <array_length ; i++) {
            summa=summa+array[i];
        }
        if (summa%2==0) {
            int i = -1;
            boolean flag = false;
            while (i<array_length) {
                i++;
                s = s + array[i];
                if (s == summa / 2) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                for (int j = 0; j < array_length; j++) {
                    System.out.print(array[j] + " ");
                    if (j == i) System.out.print("|| ");
                } return true;
            } else {
                System.out.println("Найти центр масс массива не удалось");
                return false;}
        } else {
            System.out.println("Найти центр масс массива не удалось");
        return false;}
    }

    //Метод для задания №7
    //При n>0 сдвиг происходит вправо
    public static void shiftArray(int[] array, int n)
    {
        int array_length= array.length;
        n=n%array_length;
        if (n<0) n=array_length+n;
        int temp;
        for (int i = 0; i <n ; i++) {
            temp=array[array_length-1];
            for (int j = array_length-1; j >=0 ; j--) {
               if (j>=1)
               array[j]=array[j-1];
               else array[0]=temp;
            }
        }
        System.out.println("Массив после сдвига:");
        for (int i = 0; i <array_length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }



}
