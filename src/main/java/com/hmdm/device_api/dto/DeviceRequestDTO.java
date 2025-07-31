package com.hmdm.device_api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.constraints.NotBlank;

@ApiModel(description = "Payload for creating a new device")
public class DeviceRequestDTO {

    @NotBlank
    @ApiModelProperty(value = "Device number (e.g., IMEI or serial)", required = true)
    private String number;

    @ApiModelProperty(value = "Device description")
    private String description;

    @ApiModelProperty(value = "Configuration ID for the device")
    private Integer configurationId;

    // Add more fields as needed from the original system

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Integer configurationId) {
        this.configurationId = configurationId;
    }


}
