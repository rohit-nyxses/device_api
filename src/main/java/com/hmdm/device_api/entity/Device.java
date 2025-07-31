package com.hmdm.device_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "devices")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String number;

    private String description;
//
//    @Column(name = "last_update")
//    private Long lastUpdate;
//
    @Column(name = "configurationid")
    private Integer configurationId;
//
//    private String info;
//    private String imei;
//    private String phone;
//
//    @Column(name = "customer_id")
//    private int customerId;
//
//    @Column(name = "imei_update_ts")
//    private Long imeiUpdateTs;
//
//    @Column(name = "public_ip")
//    private String publicIp;
//
//    private String custom1;
//    private String custom2;
//    private String custom3;
//
//    @Column(name = "old_number")
//    private String oldNumber;
//
//    @Column(name = "fast_search")
//    private String fastSearch;
//
//    @Column(name = "android_version")
//    private String androidVersion;
//
//    @Column(name = "enroll_time")
//    private Long enrollTime;
//
//    private String serial;
//
//    @Column(name = "status_code")
//    private String statusCode;
//
//    @Column(name = "launcher_version")
//    private String launcherVersion;
//
//    @Column(name = "launcher_pkg")
//    private String launcherPkg;
//
//    @Column(name = "mdm_mode")
//    private Boolean mdmMode;
//
//    @Column(name = "kiosk_mode")
//    private Boolean kioskMode;

    // Optional: helper methods like updateFastSearch() can go here
}
