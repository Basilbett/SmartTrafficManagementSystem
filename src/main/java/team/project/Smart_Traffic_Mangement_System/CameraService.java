package team.project.Smart_Traffic_Mangement_System;

import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_videoio.VideoCapture;
import org.springframework.stereotype.Service;

@Service
public class CameraService {

    private VideoCapture videoCapture;

    public CameraService() {
        this.videoCapture = new VideoCapture(0); // 0 represents the default camera
        if (!videoCapture.isOpened()) {
            throw new RuntimeException("Error: Camera not found!");
        }
    }

    public int countPeople() {
        Mat frame = new Mat();
        videoCapture.read(frame);

        // Apply computer vision algorithm to count people
        // (You can use Haar cascades or other methods)

        return  0; // Placeholder, replace with the actual count
    }
}
