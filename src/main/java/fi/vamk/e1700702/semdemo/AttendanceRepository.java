package fi.vamk.e1700702.semdemo;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

public interface AttendanceRepository extends CrudRepository<Attendance, Integer>{
  public Attendance findByKey(String key);

  public Attendance findByDate(Date date);
}
