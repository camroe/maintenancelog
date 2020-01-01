package com.cmr.maintenancelog;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "logs")
public class LogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String make;
    String model;
    String manufacturer;
    String serialnumber;
    String registration;
    float tachtime;
    float hobbstime;
    AircraftApplianceEnum aircraftApplianceEnum;
    String entry;
}

