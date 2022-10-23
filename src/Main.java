public class Main {
    public static void printdelivery(int delivery) {
        System.out.println(delivery);
    }

    public static void main(String[] args) {

        int deliveryDistance = 32;
        double day = deliveryDistance / 20;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day + "  сутки на достваку");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + day +"   + 2 суток на достваку");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + day + "   + 3 суток на достваку");
        } ;
        double deliverDay = 5-day;
        int delivery = (int) deliverDay;
        printdelivery(delivery);
    }
}
