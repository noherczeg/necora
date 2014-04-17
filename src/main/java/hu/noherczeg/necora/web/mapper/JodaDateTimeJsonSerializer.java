package hu.noherczeg.necora.web.mapper;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class JodaDateTimeJsonSerializer extends JsonSerializer<DateTime> {
    private static final String DATE_FORMAT = ("EEE MMM dd yyyy HH:mm:ss 'GMT'ZZZ (z)");
    private static Logger logger = LoggerFactory.getLogger(JodaDateTimeJsonSerializer.class);

    @Override
    public void serialize(DateTime dateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        String formattedDate = DateTimeFormat.forPattern(DATE_FORMAT).print(dateTime);
        jsonGenerator.writeString(formattedDate);
    }
}
