import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(service.calcSQRt(200, 300));
        System.out.println();

        int i;
        int x = 200;
        int y = 300;
        for (i = 10; i < 100; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                System.out.println(i);
            }
        }


    }

}