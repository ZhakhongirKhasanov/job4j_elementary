package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {1, 1832, 111};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 111, 1832};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {8734, 54, 2, 118, 23};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 23, 54, 118, 8734};
        assertThat(result).isEqualTo(expected);
    }
}