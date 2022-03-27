package plus.ldl.common.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.util.Date;

/**
 * 将时间戳转换为date对象
 *
 * @author ldl
 */
public class DateDeserializer extends JsonDeserializer<Object> {

    JsonDeserializer<Object> deserializer;

    public DateDeserializer(JsonDeserializer<Object> deserializer) {
        this.deserializer = deserializer;
    }

    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException {
        try {

            String tmp = "" + p.getValueAsLong();
            // 毫秒时间戳
            if (tmp.length() == 13) {
                return new Date(p.getValueAsLong());
            }
            // 秒时间戳
            if (tmp.length() == 10) {
                return new Date(p.getValueAsLong() * 1000);
            }
            return null;
        } catch (Exception e) {
            if (deserializer != null) {
                return deserializer.deserialize(p, ctxt);
            }
            return p.getCurrentValue();
        }
    }
}
