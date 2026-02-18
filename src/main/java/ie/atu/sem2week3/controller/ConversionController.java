package ie.atu.sem2week3.controller;

import ie.atu.sem2week3.service.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class ConversionController {

    private final ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("/convertcm")
    public ResponseEntity<?> convertCm(@RequestParam float cm) {
        if (cm <= 0) {
            return ResponseEntity.badRequest().body("Value must be greater than zero");
        }
        float result = conversionService.convertCm(cm);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/convertinch")
    public ResponseEntity<?> convertInch(@RequestParam float inches) {
        if (inches <= 0) {
            return ResponseEntity.badRequest().body("Value must be greater than zero");
        }
        float result = conversionService.convertInch(inches);
        return ResponseEntity.ok(result);
    }
}