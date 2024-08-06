package com.flashcard.flashcard;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
class FlashcardJsonTest {

    @Autowired
    private JacksonTester<Flashcard> json;

    @Test
    void flashcardSerializationTest() throws IOException {
        Flashcard flashcard = new Flashcard(99L, 123.45);
        assertThat(json.write(flashcard)).isStrictlyEqualToJson("expected.json");
        assertThat(json.write(flashcard)).hasJsonPathNumberValue("@.id");
        assertThat(json.write(flashcard)).extractingJsonPathNumberValue("@.id")
                .isEqualTo(99);
        assertThat(json.write(flashcard)).hasJsonPathNumberValue("@.amount");
        assertThat(json.write(flashcard)).extractingJsonPathNumberValue("@.amount")
                .isEqualTo(123.45);
    }

    @Test
    void flashcardDeserializationTest() throws IOException {
        String expected = """
                {
                    "id": 99,
                    "amount": 123.45
                }
                """;
        assertThat(json.parse(expected))
                .isEqualTo(new Flashcard(99L, 123.45));
        assertThat(json.parseObject(expected).id()).isEqualTo(99);
        assertThat(json.parseObject(expected).amount()).isEqualTo(123.45);
    }
}

