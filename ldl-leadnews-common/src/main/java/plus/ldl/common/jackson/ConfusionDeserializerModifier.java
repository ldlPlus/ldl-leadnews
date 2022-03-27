package plus.ldl.common.jackson;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Iterator;

/**
 * 混淆反序列化器修饰符
 *
 * @author ldl
 */
public class ConfusionDeserializerModifier extends BeanDeserializerModifier {

    @Override
    public BeanDeserializerBuilder updateBuilder(final DeserializationConfig config,
                                                 final BeanDescription beanDescription,
                                                 final BeanDeserializerBuilder builder) {
        Iterator<SettableBeanProperty> it = builder.getProperties();

        while (it.hasNext()) {
            SettableBeanProperty p = it.next();
            if (!p.getType().getTypeName().contains("Date")
                    && (null != p.getAnnotation(IdEncrypt.class) || "id".equalsIgnoreCase(p.getName()))) {

                builder.addOrReplaceProperty(p.withValueDeserializer(new ConfusionDeserializer(p.getValueDeserializer(),
                        p.getType())), true);
            } else if (p.getType().getTypeName().contains("Date")) {

                builder.addOrReplaceProperty(p.withValueDeserializer(new DateDeserializer(p.getValueDeserializer())),
                        true);
            }
        }
        return builder;
    }
}
