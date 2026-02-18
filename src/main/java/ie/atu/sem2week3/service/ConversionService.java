package ie.atu.sem2week3.service;

import org.springframework.stereotype.Service;

@Service
public class ConversionService {

    public float convertCm(float cm) {
        return cm / 2.54f;
    }

    public float convertInch(float inches) {
        return inches * 2.54f;
    }
}