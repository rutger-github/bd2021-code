package belastingdienst.rjduistermaat.labs.h12;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

public class ReflectedAnnotations {
    private List<ReflectedAnnotation> annotations = new ArrayList<>();

    public void addAnnotation(ElementType elementType, String elementName, Annotation[] annotationClasses) {
        this.annotations.add(
                ReflectedAnnotation.fromAnnotation(elementType, elementName, annotationClasses)
        );
    }

    public List<ReflectedAnnotation> getAnnotations() {
        return this.annotations;
    }
}


