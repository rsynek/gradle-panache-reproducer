package org.acme.persistence;

import javax.enterprise.context.ApplicationScoped;

import org.acme.domain.Lesson;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class LessonRepository implements PanacheRepository<Lesson> {

}
