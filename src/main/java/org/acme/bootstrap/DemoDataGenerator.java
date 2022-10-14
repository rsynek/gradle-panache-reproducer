package org.acme.bootstrap;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.domain.Lesson;
import org.acme.persistence.LessonRepository;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class DemoDataGenerator {

    @Inject
    LessonRepository lessonRepository;

    @Transactional
    public void generateDemoData(@Observes StartupEvent startupEvent) {
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(new Lesson("Math", "A. Turing", "9th grade"));
        lessonList.add(new Lesson("Math", "A. Turing", "9th grade"));
        lessonList.add(new Lesson("Physics", "M. Curie", "9th grade"));
        lessonList.add(new Lesson("Chemistry", "M. Curie", "9th grade"));
        lessonList.add(new Lesson("Biology", "C. Darwin", "9th grade"));
        lessonList.add(new Lesson("History", "I. Jones", "9th grade"));
        lessonList.add(new Lesson("English", "I. Jones", "9th grade"));
        lessonList.add(new Lesson("English", "I. Jones", "9th grade"));
        lessonList.add(new Lesson("Spanish", "P. Cruz", "9th grade"));
        lessonList.add(new Lesson("Spanish", "P. Cruz", "9th grade"));
        lessonRepository.persist(lessonList);
    }
}
