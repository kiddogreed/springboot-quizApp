package com.rus.quizapp.controller;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

public class WebcamController {
    @GetMapping("/capture")
    public StreamingResponseBody captureWebImage() {
        return outputStream -> {
            FrameGrabber grabber = new OpenCVFrameGrabber(0);
            grabber.start();

            CanvasFrame canvasFrame = new CanvasFrame("Webcam Capture");
            canvasFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

            while (true){
                try {
                    Frame frame = grabber.grab();
                    canvasFrame.showImage(frame);

                    byte[] imageBytes = frame.image[0];
                    outputStream.write(imageBytes);

                }catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
            grabber.stop();
            canvasFrame.dispose();
        };
    }
}
