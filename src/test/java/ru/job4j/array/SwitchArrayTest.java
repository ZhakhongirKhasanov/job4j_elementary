package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSwap1To2() {
        int[] input = {934, 23, 1, 22};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {934, 1, 23, 22};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSwap2To0() {
        int[] input = {3, 37, 13, 22};
        int source = 2;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {13, 37, 3, 22};
        assertThat(result).isEqualTo(expected);
    }
}