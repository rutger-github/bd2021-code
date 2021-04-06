package belastingdienst.rjduistermaat.labs.h12;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnnotationSearcher {
    private ReflectedAnnotations reflectedAnnotations;
    private List<Class> annotationClasses = new ArrayList<>();

    public ReflectedAnnotations reflect(Class[] classesToReflect, Class[] annotationClasses) {

        this.annotationClasses = Arrays.asList(annotationClasses);
        this.reflectedAnnotations = new ReflectedAnnotations();

        this.addAnnotationsOfDeclaredClasses(classesToReflect);

        return reflectedAnnotations;
    }

    private void addAnnotationsOfDeclaredClasses(Class[] classes) {
        for (Class aClass : classes) {

            var annotations = aClass.getDeclaredAnnotations();
            if (annotations.length > 0) {
                addAnnotationsForSpecified(annotations, aClass);
            }

            var declaredMethods = aClass.getDeclaredMethods();
            if (declaredMethods.length > 0) {
                addAnnotationsOfDeclaredMethods(declaredMethods);
            }

            var declaredClasses = aClass.getDeclaredClasses();
            if (declaredClasses.length > 0) {
                this.addAnnotationsOfDeclaredClasses(declaredClasses);
            }
        }
    }

    private void addAnnotationsOfDeclaredMethods(Method[] methods) {
        for (Method method : methods) {
            for (Annotation annotation : method.getAnnotations()) {
                if (this.annotationClasses.contains(annotation.annotationType())) {
                    this.reflectedAnnotations.addAnnotation(ElementType.METHOD, method.getName(), method.getAnnotations());
                }
            }
        }
    }

    private void addAnnotationsForSpecified(Annotation[] annotations, Class aClass) {
        for (Annotation annotation : annotations) {

            if (this.annotationClasses.contains(annotation.annotationType())) {
                this.reflectedAnnotations.addAnnotation(ElementType.TYPE, aClass.getName(), aClass.getAnnotations());
            }
        }
    }

}
