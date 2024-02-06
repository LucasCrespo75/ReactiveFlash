package br.com.dio.reactiveflashCard.domain.document;

import java.util.Set;

public record StudyDeck(String studyDeckId,
                        Set<StudyCard> studyCards){
}
