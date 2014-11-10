insert into track ( name, code ) values ( 'Aqueduct', 'AQU' );
insert into contest ( track_id, date ) values ( ( select id from track where code = 'AQU' ), '2014-11-07' );