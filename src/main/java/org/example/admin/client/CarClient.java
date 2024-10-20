package org.example.admin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CLOUD")
public interface CarClient {
    @GetMapping("/cars")
    String getAllCars();
}
