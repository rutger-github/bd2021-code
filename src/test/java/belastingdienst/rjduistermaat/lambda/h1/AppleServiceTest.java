package belastingdienst.rjduistermaat.lambda.h1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AppleServiceTest {


    @Test
    public void shouldPrintApples() {

        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red", 15));
        apples.add(new Apple("green", 16));
        apples.add(new Apple("red", 30));
        apples.add(new Apple("red", 24));


        var appleprinter = new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple);
            }
        };

        for (Apple apple : apples) {
            appleprinter.accept(apple);
        }
    }

    @Test
    public void shouldWeightApplesZero() {

        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red", 15));
        apples.add(new Apple("green", 16));
        apples.add(new Apple("red", 30));
        apples.add(new Apple("red", 24));

        apples.stream()
                .forEach(apple -> {
                    apple.setWeight(0);
//                    Assertions.assertThat(apple.getWeight()).isEqualTo(0);
                });

        for (Apple apple : apples) {
            Assertions.assertThat(apple.getWeight()).isEqualTo(0);
        }
    }

}