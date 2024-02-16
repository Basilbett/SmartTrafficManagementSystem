package team.project.Smart_Traffic_Mangement_System;

import org.opencv.objdetect.CascadeClassifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/people")
public class PeopleController {
    private final CameraService cameraService;

    @Autowired
    public  PeopleController(CameraService cameraService) {

        this.cameraService = cameraService;
    }

    @GetMapping("")
    public ResponseEntity<Integer> getPeopleCount() {
        int count = cameraService.countPeople();
        return ResponseEntity.ok(count);

    }
}
