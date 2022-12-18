package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To3Then7() {
        int left = 7;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax74To901Then901() {
        int left = 74;
        int right = 901;
        int result = Max.max(left, right);
        int expected = 901;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax112To112Then112() {
        int left = 112;
        int right = 112;
        int result = Max.max(left, right);
        int expected = 112;
        assertThat(result).isEqualTo(expected);
    }
}
