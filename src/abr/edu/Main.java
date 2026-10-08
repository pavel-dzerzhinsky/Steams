package abr.edu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import abr.edu.Employee;

public class Main {
    /* static test values because need only one instance of each /
        / arraylist for exercises 1-3 */
    private static final ArrayList<Integer> intList =
            Stream.of(5, 2, 10, 9, 4, 3, 10, 1, 13)
                    .collect(Collectors.toCollection(ArrayList::new));
    /* arraylist of Employee for exercises 4-5 */
    private static final ArrayList<Employee> employeeList = Stream.of(
            new Employee("Людмила", 32, "Бухгалтер"),
            new Employee("Пахом", 72, "Инженер"),
            new Employee("Афанасий", 54, "Инженер"),
            new Employee("Геннадий", 46, "Уборщик"),
            new Employee("Коловрат", 56, "Инженер"),
            new Employee("Иннокентий", 60, "Сварщик"),
            new Employee("Евлампий", 64, "Инженер")
    ).collect(Collectors.toCollection(ArrayList::new));
    /* arraylist for exercise 6 and 8, also for generation stringLine */
    private static final ArrayList<String> stringList =
            Stream.of("shortstring1", "shortstr2", "someverylongstring",
                            "notlongstring", "hhortstring1", "shortstring1", "shortstring1", "cat", "cat", "dog", "dog", "dog")
                    .collect(Collectors.toCollection(ArrayList::new));

    private static final List<String> catBreedlist = Arrays.asList("Абиссинская кошка", "Американская короткошерстная кошка", "Американская короткошерстная кошка", "Американский бобтейл", "Американский бобтейл", "Американский керл", "Американский керл", "Аравийский мау", "Аравийский мау", "Балинезийская кошка", "Балинезийская кошка", "Бамбино", "Бамбино", "Бенгальская кошка", "Бенгальская кошка", "Бирманская кошка", "Бирманская кошка", "Бомбейская кошка", "Бомбейская кошка", "Британская длинношерстная кошка", "Британская длинношерстная кошка", "Британская короткошерстная кошка", "Британская короткошерстная кошка", "Бурманская кошка", "Бурманская кошка", "Бурмилла", "Бурмилла", "Гавана браун", "Гавана браун", "Гималайская кошка", "Гималайская кошка", "Девон-рекс", "Девон-рекс", "Донской сфинкс", "Донской сфинкс", "Европейская короткошерстная кошка", "Европейская короткошерстная кошка", "Египетская мау", "Египетская мау", "Канадский сфинкс", "Канадский сфинкс", "Кимрик", "Кимрик", "Кинкалоу", "Кинкалоу", "Корат", "Корат", "Корниш-рекс", "Корниш-рекс", "Курильский бобтейл", "Курильский бобтейл", "Лаперм", "Лаперм", "Манчкин", "Манчкин", "Мейн-кун", "Мейн-кун", "Меконгский бобтейл", "Меконгский бобтейл", "Минскин", "Минскин", "Мэнкс", "Мэнкс", "Невская маскарадная кошка", "Невская маскарадная кошка", "Немецкий рекс", "Немецкий рекс", "Нибелунг", "Нибелунг", "Норвежская лесная кошка", "Норвежская лесная кошка", "Ориентальная кошка", "Ориентальная кошка", "Оцикет", "Оцикет", "Персидская кошка", "Персидская кошка", "Петерболд", "Петерболд", "Пиксибоб", "Пиксибоб", "Рагамаффин", "Рагамаффин", "Русская голубая кошка", "Русская голубая кошка", "Рэгдолл", "Рэгдолл", "Саванна (Ашера)", "Саванна (Ашера)", "Селкирк-рекс", "Селкирк-рекс", "Сиамская кошка", "Сиамская кошка", "Сибирская кошка", "Сибирская кошка", "Сингапурская кошка", "Сингапурская кошка", "Скукум", "Скукум", "Сноу-шу", "Сноу-шу", "Сококе", "Сококе", "Сомалийская кошка", "Сомалийская кошка", "Тайская кошка", "Тайская кошка", "Тойгер", "Тойгер", "Тонкинская кошка", "Тонкинская кошка", "Турецкая ангора", "Турецкая ангора", "Турецкий ван", "Турецкий ван", "Уральский рекс", "Уральский рекс", "Хайленд-фолд", "Хайленд-фолд", "Чаузи", "Чаузи", "Шантильи-тиффани", "Шантильи-тиффани", "Шартрез", "Шартрез", "Шиншилла", "Шиншилла", "Шотландская вислоухая кошка", "Шотландская вислоухая кошка", "Шотландская прямоухая кошка", "Шотландская прямоухая кошка", "Экзотическая кошка", "Экзотическая кошка", "Эльф", "Эльф", "Яванез", "Яванез", "Японский бобтейл", "Японский бобтейл");

    /* string for exercise 7 generated from stringList */
    private static final String stringLine = stringList.stream().collect(Collectors.joining(" "));
    /* array of string for exercise 9 */
    private static final String[] stringArray = new String[]{
            "Lorem ipsum dolor sit amet",
            "consectetur adipiscing elit Duis elementum",
            "nunc nisl vitae pulvinar sapien",
            "posuere nec Nam nibh lacus",
            "aliquam non tempor in commodo",
            "in lorem Curabitur ac tempor"
    };

    public static void main() {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
    }

    static String getMethodName() {
        return Stream.of(
                        //  Thread.currentThread().getStackTrace()).filter(x -> x.getMethodName().startsWith(("ex")))
                        //  .findFirst().map(StackTraceElement::getMethodName).get()
                        Thread.currentThread().getStackTrace())
                .map(StackTraceElement::getMethodName)
                .filter(x -> x.startsWith(("ex")))
                .findFirst().orElseThrow()
                + ": ";
    }

    public static void print(Object o) {
        System.out.println(getMethodName() + o);
    }

/* Exercise 1 /
/ Реализуйте удаление из листа всех дубликатов */

    static void ex1() {
        print(catBreedlist.stream()
                .distinct()
                .collect(Collectors.toList()));
    }

    /* Exercise 2 /
    / Найдите в списке целых чисел 3-е наибольшее число (пример: 5 2 10 9 4 3 10 1 13 => 10) */
    static void ex2() {
        Optional<Integer> thirdMax = intList.stream().sorted(Comparator.reverseOrder())
                .skip(2)       // Пропускаем первые 2 элемента
                .findFirst();
        //System.out.print(thirdMax.orElseThrow());
        thirdMax.ifPresent(Main::print);
    }

    /* Exercise 3 /
     / Найдите в списке целых чисел 3-е наибольшее «уникальное» число (пример: 5 2 10 9 4 3 10 1 13 => 9,
    в отличие от прошлой задачи здесь разные 10 считает за одно число) */
    static void ex3() {
        intList.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().ifPresent(Main::print);
    }

/* Exercise 4 /
/ Имеется список объектов типа Сотрудник (имя, возраст, должность),
необходимо получить список имен 3 самых старших сотрудников с должностью «Инженер», в порядке убывания возраста */

    static void ex4() {
        Predicate<Employee> engineer = x -> {
            return x.getTitle().equals("Инженер");
        };

        System.out.println(getMethodName() + employeeList.stream()
                .filter(engineer) //.filter(x1 -> {return x1.getTitle().equals("Инженер");})
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                // .sorted((x, y)
                // -> Integer.compare(y.getAge(), x.getAge()))
                .limit(3)
                .map(Employee::name)
                .toList());
    }

    /* Exercise 5 /
    / Имеется список объектов типа Сотрудник (имя, возраст, должность),
    посчитайте средний возраст сотрудников с должностью «Инженер» */
    static void ex5() {
        System.out.println(getMethodName() + employeeList.stream()
                .filter(x1 -> {
                    return x1.getTitle().equals("Инженер");
                })
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                .mapToInt(Employee::getAge)
                .average().orElseThrow());
    }
    /* Exercise 6 /
    / Найдите в списке слов самое длинное */
    static void ex6() {
        Stream.of(stringArray)
                .max(Comparator.comparing(String::length))
                .ifPresent(Main::print);
    }
    /* Exercise 7 /
    / Имеется строка с набором слов в нижнем регистре, разделенных пробелом.
    Постройте хеш-мапы, в которой будут хранится пары: слово - сколько раз оно встречается во входной строке */
    static void ex7() {
        print(Stream.of(
                        stringLine.split("\\s+")
                )
                .collect(Collectors.groupingBy(x->x, Collectors.counting()))
        );
    }
    /* Exercise 8 /
        / Отпечатайте в консоль строки из списка в порядке увеличения длины слова,
        если слова имеют одинаковую длины, то должен быть сохранен алфавитный порядок */
    static void ex8() {
        stringList.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .sorted(Comparator.comparingInt(String::length)).forEach(Main::print);
    }

    /* Exercise 9 /
    / Имеется массив строк, в каждой из которых лежит набор из 5 строк, разделенных пробелом,
        найдите среди всех слов самое длинное, если таких слов несколько, получите любое из них */
    static void ex9() {
        Arrays.stream(stringArray).flatMap(str -> Arrays.stream(str.split(" ")))
                .max(Comparator.comparingInt(String::length))
                .ifPresent(Main::print);
    }
}
