import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BmService service = new BmService();
        int indexBody = service.calculate(70, 1.68);
        System.out.println("Масса индекса тела составляет:" + indexBody);


    }

}

