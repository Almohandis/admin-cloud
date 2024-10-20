package org.example.admin.controller;

import org.example.admin.model.Admin;
import org.example.admin.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public ResponseEntity<String> saveAdmin(@RequestBody final Admin admin) {
        adminService.save(admin);
        return ResponseEntity.ok("Success");
    }

    @GetMapping
    public ResponseEntity<List<Admin>> findAdmin() {
        return ResponseEntity.ok(adminService.findAll());
    }

    @GetMapping("/cars")
    public String getAllCars() {
        return adminService.getCarsFrom8088();
    }
}
