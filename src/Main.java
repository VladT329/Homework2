//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1
      var dog = 8.0;
      var cat = 3.6;
      var paper = 763789;
      System.out.println("Задание 1");
      System.out.println(dog);
      System.out.println(cat);
      System.out.println(paper);

      // Задание 2
        System.out.println("Задание 2");
      dog = dog + 4;
      cat = cat + 4;
      paper = paper + 4;
      System.out.println(dog);
      System.out.println(cat);
      System.out.println(paper);

      // Задание 3
        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задание 6
        System.out.println("Задание 6");
        var Boxer1 = 78.2;
        var Boxer2 = 82.7;
        var totalWeight = Boxer1 + Boxer2;
        var difference = Boxer2 - Boxer1;
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг");
        System.out.println("Разница между бойцами " + difference + " кг");

        // Задание 7
        System.out.println("Задание 7");
        var ostatok = Boxer2 % Boxer1;
        System.out.println("Остаток от деления - " + ostatok);

        // Задание 8
        System.out.println("Задание 8");
        var totalTime = 640;
        var workerTime = 8;
        var workers = totalTime / workerTime;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        totalTime = workers * workerTime;
        System.out.println("Если в компании работает " + workers + " человек" + " то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
        }
    }