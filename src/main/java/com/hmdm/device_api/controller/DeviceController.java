package com.hmdm.device_api.controller;

import com.hmdm.device_api.dto.DeviceRequestDTO;
import com.hmdm.device_api.response.Response;
import com.hmdm.device_api.service.DeviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/devices")
//@CrossOrigin(origins = "*")
@Api(tags = "Device Management")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping
    @ApiOperation("Create a new device")
    public Response createDevice(@Valid @RequestBody DeviceRequestDTO dto) {
        return deviceService.createDevice(dto);
    }
}
