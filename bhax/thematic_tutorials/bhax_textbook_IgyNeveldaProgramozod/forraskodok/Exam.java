public class Exam {
    public static void main(String[] args) {

        int points = 91;

        if (points >= 40) {
            if (points <= 60) {
                System.out.println("2");
            } else if (points <= 70) {
                System.out.println("3");
            } else if (points <= 80) {
                System.out.println("4");
            } else {
                System.out.println("5");
            }
        } else {
            System.out.println("1");
        }
    }
}//complexity 5