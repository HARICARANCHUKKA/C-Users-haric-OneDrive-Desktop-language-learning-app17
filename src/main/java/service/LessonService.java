package service;

import model.Lesson;
import repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public Lesson saveLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    public List<Lesson> getAllLessons() {
        return lessonRepository.findAll();
    }
}
