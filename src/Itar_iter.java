public class Itar_iter {
    int [] arr = {3,6,9};
    arr[2] = 7;
        for (int i = 0; i < arr.length; i++)
    {
//            int i1 = arr[i]; //временная
        System.out.print(arr[i]+" ");
    }
    //itar сгенерировать цикл for c длиной массива

    //fori цикл for для массива
    //iter сгенерировать цикл For each
    // цикл for each
        for (int number : arr)
    {
        System.out.print(number+" ");
    }
}
