drop table logs if exists;

create table logs
(
    ID bigint auto_increment,
    AIRCRAFT_APPLIANCE_ENUM int,
    ENTRY varchar2,
    HOBBSTIME number,
    LOG_DATE varchar(25),
    MAKE varchar2,
    MANUFACTURER varchar,
    MODEL varchar2,
    REGISTRATION varchar,
    SERIALNUMBER varchar2,
    TACHTIME number,
    WORK_ORDER_NUMBER long
);
insert into logs
values (1,
        0,
        'This is a sample log entry',
        5546,
        '2020-01-20',
        'Mooney',
        'Mooney Aircraft',
        'M20G',
        'N9145V',
        '69011',
        5454,
        1234567890);

insert into logs(AIRCRAFT_APPLIANCE_ENUM,ENTRY,HOBBSTIME,LOG_DATE,MAKE,MANUFACTURER,MODEL,REGISTRATION,SERIALNUMBER,TACHTIME,WORK_ORDER_NUMBER)
values (0,
        'This is a sample log entry',
        5546,
        '2020-01-20',
        'Mooney',
        'Mooney Aircraft',
        'M20G',
        'N9145V',
        '69011',
        5454,
        1234567890);
insert into logs(AIRCRAFT_APPLIANCE_ENUM,ENTRY,HOBBSTIME,LOG_DATE,MAKE,MANUFACTURER,MODEL,REGISTRATION,SERIALNUMBER,TACHTIME,WORK_ORDER_NUMBER)
values (0,
        'This is a sample log entry',
        5546,
        '2020-01-20',
        'Mooney',
        'Mooney Aircraft',
        'M20G',
        'N9145V',
        '69011',
        5454,
        1234567890);
select * from logs;
