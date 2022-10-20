public class Main {
    public static void main(String[] args) {
        // задание 1
        var dog = 8;
        dog = dog+4;
        dog = dog-3;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat+4;
        cat = cat-2;
        System.out.println(cat);
        var paper = 763789;
        paper = paper+4;
        paper = paper-7639;
        System.out.println(paper);

        // задание 2
        var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);

        // задание 3
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var sumWeight = firstFighter+secondFighter;
        System.out.println(sumWeight);
        var differenceWeight1 = secondFighter-firstFighter;
        System.out.println(differenceWeight1);
        var differenceWeight2 = secondFighter%firstFighter;
        System.out.println(differenceWeight2);
        var allJobTime = 640;
        var jobPerDay = 8;
        var workers = allJobTime/jobPerDay;
        System.out.println("Всего работников в компании – " + workers + " человек");
        var newWorkers = workers+94;
        var newAllJobTime = newWorkers*8;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newAllJobTime + " часов работы может быть поделено между сотрудниками");


    }
}