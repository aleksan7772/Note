public class While {
    //Цикл while
    //cnt+shift+enter - автозавершение
    int i = 1;
        while (i <= 10) {
        System.out.println(i);
        i++;
    }
    i = 10;
        while (i >= 0) {
        System.out.println(i);
        i--;
    }
    //do while
    int i = 0;
        do {
        i++;

        System.out.println(i);
    } while (i < 10);

    i = 10;
        do {
        i--;

        System.out.println(i);
    } while (i > 0);

}
