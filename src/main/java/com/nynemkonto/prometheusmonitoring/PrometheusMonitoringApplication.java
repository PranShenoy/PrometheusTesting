package com.nynemkonto.prometheusmonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@EnablePrometheusEndpoint
//@RestController
@SpringBootApplication
public class PrometheusMonitoringApplication {

	// final static Logger logger = LoggerFactory.getLogger(PrometheusMonitoringApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PrometheusMonitoringApplication.class, args);
	}

	// @GetMapping("/something")
    // public ResponseEntity<String> createLogs() {
    //     logger.warn("Just checking");
    //     return ResponseEntity.ok().body("All Ok");
    // }
}
