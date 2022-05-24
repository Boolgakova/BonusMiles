public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15476; //стоимость билета
        int mile = 20; //стоимость 1 бонусной мили

        int bonus =  ticketPrice / mile;
        System.out.println("Вам начислено "+bonus+" бонусных миль");
    }
}
