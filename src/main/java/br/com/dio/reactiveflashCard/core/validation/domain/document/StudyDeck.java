package br.com.dio.reactiveflashCard.core.validation.domain.document;

import lombok.Builder;

import java.util.Set;

public record StudyDeck(String studyDeckId,
                        Set<StudyCard> studyCards){
    @Builder(toBuilder = true)
    public StudyDeck {}

}
