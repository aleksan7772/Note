public class Operator_iLLi {
    //Логические укороченные операторы (и &&) (или || не)!
    int money = 15;
    boolean isOpened = true;
    int priceBread = 13;
//        if (money>=priceBread && isOpened){
//            System.out.println("Можно купить хлеб");
//        }
//        else {
//            System.out.println("Нельзя купить хлеб");
//        }
////Оператор && дает true только если все части выражения true
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        System.out.println(true && true);

    //оператор || дает true если хотябы одна часть выражения true

        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || true);

    //оператор ! меняет значение на противоположное
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!((true == true) || (false || true)));
}
