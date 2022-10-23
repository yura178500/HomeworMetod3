public class Main {
    public static void printdelivery(int delivery) {
        System.out.println(delivery);
    }

    public static void main(String[] args) {

        int deliveryDistance = 30;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Потребуется дней: " +deliveryDistance + "  сутки на достваку");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " +deliveryDistance + "   + 2 суток на достваку");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " +deliveryDistance + "   + 3 суток на достваку");
        } ;
        int delivery = 100 - deliveryDistance;
        printdelivery(delivery);
    }
}
