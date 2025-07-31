package com.hmdm.device_api.service;

import com.hmdm.device_api.dto.DeviceRequestDTO;
import com.hmdm.device_api.entity.Device;
import com.hmdm.device_api.repository.DeviceRepository;
import com.hmdm.device_api.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Response createDevice(DeviceRequestDTO dto) {
        // Check if device already exists by number (optional, based on business rules)
        if (deviceRepository.existsByNumber(dto.getNumber())) {
            return Response.DUPLICATE_ENTITY("Device already exists with number: " + dto.getNumber());
        }

        // Create and populate the Device entity
        Device device = new Device();
        device.setNumber(dto.getNumber());
        device.setDescription(dto.getDescription());
        device.setConfigurationId(dto.getConfigurationId());
        // Save the new device to DB
        Device savedDevice = deviceRepository.save(device);

        return Response.OK("Device created successfully", savedDevice);
    }
}
