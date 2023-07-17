
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    private static void task1() {
        System.out.println("Задача1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    private static void task2() {
        System.out.println("Задача2");
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        }
        private static void task3 () {
            System.out.println("Задача3");
            var dog = 8.0;
            dog = dog - 3.5;
            var cat = 3.6;
            cat = cat - 1.6;
            var paper = 763789;
            paper = paper - 7639;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
        }
        private static void task4 () {
            System.out.println("Задача4");
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
        }
        private static void task5 () {
            System.out.println("Задача5");
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);
        }
        private static void task6 () {
            System.out.println("Задача6");
            var firstBoxer = 78.2;
            var secondBoxer = 82.7;
            System.out.println("Разница " + (firstBoxer - secondBoxer) + " кг");
        }
        private static void task7 () {
            System.out.println("Задача7");
            var firstBoxer = 78.2;
            var secondBoxer = 82.7d;
            System.out.println("Разница " + (secondBoxer - firstBoxer) + " кг");
            System.out.println("Разница " + (secondBoxer % firstBoxer) + " кг");
        }
        private static void task8() {
            System.out.println("Задача8");
            var hours = 640;
            var workers = hours / 8;
            System.out.println("Всего работников в компании " + workers + " человек");
            var totalWorkers = workers + 94;
            var totalHours = totalWorkers * 8;
            System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + totalHours +
                    " часов работы может быть поделено между сотрудниками..");
        }
    }
