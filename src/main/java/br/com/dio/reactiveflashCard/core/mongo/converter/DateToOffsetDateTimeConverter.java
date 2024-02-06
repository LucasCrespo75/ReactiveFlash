package br.com.dio.reactiveflashCard.core.mongo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.time.OffsetDateTime;
import java.util.Date;
public class DateToOffsetDateTimeConverter implements Converter<Date, OffsetDateTime> {


    @Override
    public OffsetDateTime convert(final Date date) {
        return date.toInstant().atOffset(OffsetDateTime.now().getOffset());

    }
}
