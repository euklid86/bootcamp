insert into bootcamp.courses (coursesid, `Name`, Lecturer, Assistant, Duration, `Starting Date`)
values (1, "SQL", "AG", "BN", 2, '2016-10-21'),
	   (2, "Java", "VS", "BN", 3, '2016-10-25'),
       (3, "R", "KP", "TT", 4, '2016-11-09'),
       (4, "Python", "KK", "DD", 5, '2016-11-09');
select distinct Assistant from bootcamp.courses;