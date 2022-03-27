package plus.ldl.common.jackson;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.ArrayList;
import java.util.List;

/**
 * 混淆序列化器修饰符
 *
 * @author ldl
 */
public class ConfusionSerializerModifier extends BeanSerializerModifier {

    @Override
    public List<BeanPropertyWriter> changeProperties(SerializationConfig config,
                                                     BeanDescription beanDesc,
                                                     List<BeanPropertyWriter> beanProperties) {
        List<BeanPropertyWriter> newWriter = new ArrayList<>();
        for (BeanPropertyWriter writer : beanProperties) {
            String name = writer.getType().getTypeName();
            // 所有Date类型序列化为时间戳,字段名为id和带注解IdEncrypt的做混淆
            if (null == writer.getAnnotation(IdEncrypt.class)
                    && !name.equalsIgnoreCase("Date")
                    && !writer.getName().equalsIgnoreCase("id")) {
                newWriter.add(writer);
            } else if (name.contains("Date")) {
                writer.assignSerializer(new DateSerializer());
                newWriter.add(writer);
            } else {
                writer.assignSerializer(new ConfusionSerializer());
                newWriter.add(writer);
            }
        }
        return newWriter;
    }


}
