import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        Random random = new Random();
        long minDay = LocalDate.of(1950, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2021, 3, 12).toEpochDay();
        for (int i = 0; i < 10; i++){
            long randomLong = minDay  + (long) (Math.random() * (maxDay - minDay));
            LocalDate randomDate = LocalDate.ofEpochDay(randomLong);
            humanList.add(new Human( (2021 - randomDate.getYear()), "Name" + i, "LName" + i, randomDate, random.nextInt(150)));
        }
        System.out.println(humanList);
        Stream<Human> humanStream = humanList.stream().limit(5)
                .sorted(Comparator.comparing(Human::getBirthDate))
                .filter((o) -> o.getWeight() < 60);
        humanStream.forEach(o -> System.out.println(o.getFirstName() + " " + o.getLastName()));
        }

}
