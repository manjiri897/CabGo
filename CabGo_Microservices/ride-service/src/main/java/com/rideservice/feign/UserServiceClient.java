package com.rideservice.feign;

import com.commonlib.dto.UserResponse;
import com.rideservice.config.FeignClientConfig;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service",configuration = FeignClientConfig.class)
public interface UserServiceClient {
    @GetMapping("/api/users/{id}")
    UserResponse getUserById(@PathVariable("id") Long id);

    @GetMapping("/api/users/by-email")
    UserResponse getUserByEmail(@RequestParam("email") String email);
}
