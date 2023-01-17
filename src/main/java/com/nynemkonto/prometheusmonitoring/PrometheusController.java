package com.nynemkonto.prometheusmonitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Metrics;

@RestController
//@EnableScheduling
public class PrometheusController {

    @GetMapping("/")
    public String transfer(){

        Metrics.counter("files.transferred").increment(0);
        return "transfer endpoint called";
        

        //TODO Count number of times this was called
    }
    @GetMapping("/transferFile")
    public void transferFile(){

        System.out.println("transferFileCalled");
        Metrics.counter("files.transferred").increment(0);

        //TODO Count number of times this was called
    }
}