public class Ternarny_operator {
    //Тернарный оператор

    int a = 1;
    int b = 2;
    int result;
        if (a < b)
    {
        result = a;
    } else
    {
        result = b;
    }
        System.out.println(result);

    result = (a < b) ? a : b;
    String s = a > b ? "правда" : "ложь";
        System.out.println(s);
}
