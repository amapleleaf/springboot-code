package com.maple.learn.enable;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

public class MonitorImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(
                importingClassMetadata.getAnnotationAttributes(
                        EnableCustService.class.getName()));
        //在这里可以拿到所有注解的信息，可以根据不同注解的和注解的属性来返回不同的class,
        // 从而达到开启不同功能的目的
        return new String[]{MonitorService.class.getName()};
    }
}
