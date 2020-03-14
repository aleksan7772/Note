public class Massive {
    //        Массивы
//        int i = 7;
    int[] arr = new int[10];
    arr[0] = 7;
    arr[1] = 1;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 7;
    arr[5] = 8;
    arr[6] = 9;
    arr[7] = 1;
    arr[1] = 666;
    //        System.out.println(arr);
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");
        System.out.print(arr[5] + " ");
        System.out.print(arr[6] + " ");
        System.out.print(arr[7] + " ");
        System.out.println();
        for (int i = 0; i < arr.length; i++)//arr.length длина массива
    {
        System.out.print(arr[i]+ " ");
    }
}
