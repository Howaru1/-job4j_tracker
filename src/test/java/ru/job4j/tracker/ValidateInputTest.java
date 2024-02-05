package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenMultiValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selectedone = input.askInt("Enter menu:");
        assertThat(selectedone).isEqualTo(1);
        int selectedtwo = input.askInt("Enter menu:");
        assertThat(selectedtwo).isEqualTo(2);
        int selectedthree = input.askInt("Enter menu:");
        assertThat(selectedthree).isEqualTo(3);
    }

    @Test
    void whenMinusValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selectedone = input.askInt("Enter menu:");
        assertThat(selectedone).isEqualTo(-1);
    }
}