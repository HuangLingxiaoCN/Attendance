package fi.vamk.e1700702.semdemo;

import org.springframework.data.repository.CrudRepository;

public interface AttendanceRepository extends CrudRepository<Attendance, Integer>{
  public Attendance findByKey(String key);
}
