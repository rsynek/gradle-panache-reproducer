package org.acme.rest;

import org.acme.domain.Lesson;
import org.acme.persistence.LessonRepository;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "lessons")
public interface LessonResource extends PanacheRepositoryResource<LessonRepository, Lesson, Long> {

}
