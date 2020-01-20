package com.cmr.maintenancelog;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogEntryRepository extends CrudRepository<LogEntry, Long> {

    List<LogEntry> findAllByWorkOrderNumber(String workOrderNumber);

    List<LogEntry> findAllByRegistration(String tailNumber);

    List<LogEntry> findAllByManufacturerAndMake(String manufacturer, String model);

    List<LogEntry> findAllBySerialnumber(String serialNumber);
}
