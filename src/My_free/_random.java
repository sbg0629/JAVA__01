package My_free;

import java.util.Random;

public class _random {
    public static void main(String[] args) {
        Random random = new Random();

        int rand = random.nextInt(10);

        System.out.println(rand);
    }
}
