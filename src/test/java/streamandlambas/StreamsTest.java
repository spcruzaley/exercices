package streamandlambas;

import org.junit.Test;

import java.util.Arrays;

public class StreamsTest {

    @Test
    public void getGreaterThan4() {
        Integer[] nums = new Integer[]{1,6,3,8,0,3,8,2,4,9,7,6};

        Arrays.stream(nums)
                .sorted()
                .distinct()
                .forEach(System.out::print);
    }

}
