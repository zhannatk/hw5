public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        int age2 = 17;
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

    }


    public static void task2() {
        System.out.println("задача 2");
        int temperatureOutside = 4;
        if (temperatureOutside <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        int temperatureOutside2 = 6;
        if (temperatureOutside2 >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }


    }

    public static void task3() {
        System.out.println("задача 3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        int speed2 = 55;
        if (speed2 <= 60) {
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int kidAge = 3;
        if (kidAge >= 2 || kidAge <= 6) {
            System.out.println("Если возраст человека равен " + kidAge + ", то ему нужно ходить в детский сад.");
        }
        int teenagerAge = 9;
        if (teenagerAge > 7 || teenagerAge < 18) {
            System.out.println("Если человеку  " + teenagerAge + ", то ему нужно ходить в школу.");
        }
        int adultAge = 19;
        if (adultAge > 18 || adultAge < 24) {
            System.out.println("Если человеку больше " + adultAge + ", то его место в университете.");
        }
        int grownAge = 25;
        if (grownAge > 24) {
            System.out.println("А если человеку больше " + grownAge + ", то ему пора ходить на работу.");
        }

    }

    public static void task5() {
        System.out.println("задача 5");
        int allowedAge = 4;
        if (allowedAge < 5) {
            System.out.println("Если возраст ребенка равен " + allowedAge + " лет, то он не может кататься на аттракционе.");
        }
        int allowedAge2 = 6;
        if (allowedAge2 > 5 || allowedAge2 < 14) {
            System.out.println("Если возраст ребенка равен " + allowedAge2 + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        int allowedAge3 = 15;
        if (allowedAge3 > 14) {
            System.out.println("Если ребенок старше " + allowedAge3 + ", то он может кататься без сопровождения взрослого.");
        }

    }


    public static void task6() {
        System.out.println("задача 6");
        int volume = 102;
        int seat = 60;
        int stand = volume - seat;
        int freeSeats = 30;
        int freeStand = 42;
        if (freeSeats >= seat) {
            System.out.println(" Сидячих мест в вагоне нет");
        } else {
            System.out.println("сидячих мест осталось " + (seat - freeSeats));
        }
        if (stand <= freeStand) {
            System.out.println(" стоящих мест в вагоне нет ");

        } else {
            System.out.println(" в вагоне осталось " + (stand - freeStand) + " мест");
        }
        if (volume <= (freeSeats + freeSeats)) {
            System.out.println(" Места в вагоне не осталось");
        } else {
            System.out.println("Итого в вагоне осталось , " + ((seat - freeSeats) + (stand - freeStand)) + " мест . ");
        }


    }

    public static void task7() {
        System.out.println("задача 7");
        int one = 3;
        int two = 1;
        int three = -2;
        if (one >= two) {
            System.out.println(" Число " + one + " больше " + two);
        } else {
            System.out.println(" Число " + one + " меньше " + two);
        }
        if (two >= three) {
            System.out.println("Число " + two + " больше " + three);
        } else {
            System.out.println(" Число " + two + " меньше " + three);
        }
        if (three >= one) {
            System.out.println(" Число " + three + " больше " + one);
        } else {
            System.out.println(" Число " + three + " меньше " + one);

        }
    }
}