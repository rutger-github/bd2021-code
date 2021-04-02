package belastingdienst.rjduistermaat.labs.h12;

import belastingdienst.rjduistermaat.labs.h12.person.Person;

public class App {

    public static void main(String[] args) {
        var annotationSearcher = new AnnotationSearcher();

        Class[] classesToBeSearched = {Person.class};
        Class[] annotationsToBeSearched = {MyAnnotation.class, MyAnnotation2.class};

        var annotationsFound = annotationSearcher.reflect(classesToBeSearched, annotationsToBeSearched);

        for (ReflectedAnnotation reflectedAnnotation : annotationsFound.getAnnotations()) {
            System.out.println(reflectedAnnotation.toString());
        }


    }


}
