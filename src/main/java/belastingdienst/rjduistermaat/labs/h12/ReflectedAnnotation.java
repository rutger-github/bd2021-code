package belastingdienst.rjduistermaat.labs.h12;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.util.Arrays;

public class ReflectedAnnotation {
    private ElementType elementType;
    private String elementName;
    private Annotation[] annotationClass;


    private ReflectedAnnotation(ElementType elementType, String elementName, Annotation[] annotationClass) {
        this.elementType = elementType;
        this.elementName = elementName;
        this.annotationClass = annotationClass;
    }

    public static ReflectedAnnotation fromAnnotation(ElementType elementType, String elementName, Annotation[] annotationClasses) {
        return new ReflectedAnnotation(elementType, elementName, annotationClasses);
    }

    @Override
    public String toString() {
        return "ReflectedAnnotation{" +
                "elementType=" + elementType +
                ", elementName='" + elementName + '\'' +
                ", annotationClass=" + Arrays.toString(annotationClass) +
                '}';
    }
}
