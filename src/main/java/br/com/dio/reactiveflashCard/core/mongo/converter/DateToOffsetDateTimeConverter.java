package br.com.dio.reactiveflashCard.core.mongo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.time.OffsetDateTime;
import java.util.Date;
public class DateToOffsetDateTimeConverter implements Converter<OffsetDateTime ,Date > {


    @Override
    public Date convert(OffsetDateTime source) {
        return Date.from(source.toInstant());
    }
}
