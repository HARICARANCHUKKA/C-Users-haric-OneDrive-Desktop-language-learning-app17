package controller;

import model.Lesson;
import service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @PostMapping("/add")
    public Lesson addLesson(@RequestBody Lesson lesson) {
        return lessonService.saveLesson(lesson);
    }

    @GetMapping("/all")
    public List<Lesson> getAllLessons() {
        return lessonService.getAllLessons();
    }
}
