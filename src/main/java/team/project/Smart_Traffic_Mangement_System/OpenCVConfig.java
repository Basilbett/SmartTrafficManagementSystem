package team.project.Smart_Traffic_Mangement_System;

import org.opencv.core.Core;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenCVConfig {
    static{
      nu.pattern.OpenCV.loadLocally();
    }
}
