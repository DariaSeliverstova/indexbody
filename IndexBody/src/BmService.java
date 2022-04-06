public class BmService {
    public int calculate(int bodyMass, double heigth) {

        double indexBody = bodyMass / (heigth * heigth);

        return (int) indexBody;
    }
}



