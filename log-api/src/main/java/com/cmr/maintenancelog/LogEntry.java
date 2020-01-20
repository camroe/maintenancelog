package com.cmr.maintenancelog;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
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
    //Table created in alphabetical order from id on, lets make this declaration list reflect that order.
    AircraftApplianceEnum aircraftApplianceEnum;
    String entry;
    float hobbstime;
    //TODO: Make logDate a real data once I figure out how to do the correct validation chekcs on the UI side.
    // It should be in ISO 8601 format YYYY-MM-DDTHH:MM:SS.sssss
    String logDate;

    String make;
    String manufacturer;
    String model;
    String registration;
    String serialnumber;
    float tachtime;
    Long workOrderNumber;


    public String toJsonString() {

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";
        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            jsonString = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }
}

