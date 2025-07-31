package com.hmdm.device_api.repository;

import com.hmdm.device_api.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
    boolean existsByNumber(String number);
}
