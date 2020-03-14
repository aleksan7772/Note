import java.util.Arrays;

public class Main4
{
    public static void main(String[] args)
    {
//       оперделение среднего числа
        int[] numbers = {35, 56, 69, 75, 94, 23, 81};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int search = 69;
        int firstindex = 0;
        int lastindex = numbers.length - 1;
        while (firstindex <= lastindex)
        {
            int middleindex = (firstindex + lastindex) / 2;
            if (numbers[middleindex] == search)
            {
                System.out.println("Я нашел твое число" + " " + middleindex);
                break;
            } else if (numbers[middleindex] < search)// если средний элемент меньше, то обрезаем первуя часть массива
            {
                firstindex = middleindex + 1;

            } else if (numbers[middleindex] > search)// если средний элемент меньше, то обрезаем первуя часть массива
            {
                lastindex = middleindex - 1;

            }
        }

    }
}

