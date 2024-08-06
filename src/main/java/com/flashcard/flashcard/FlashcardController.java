package com.flashcard.flashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flashcards")
class FlashcardController {

    @GetMapping("/{requestedId}")
    private ResponseEntity<Flashcard> findById(@PathVariable Long requestedId) {
        if (requestedId.equals(99L)) {
            Flashcard flashcard = new Flashcard(99L, 123.45);
            return ResponseEntity.ok(flashcard);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
