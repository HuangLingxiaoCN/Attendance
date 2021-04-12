package fi.vamk.e1700702.semdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {
  @Autowired
  private AttendanceRepository repository;

  @GetMapping("/attendances")
  public Iterable<Attendance> list() {
    return repository.findAll();
  }

  @PostMapping("/attendance")
  public @ResponseBody Attendance create(@RequestBody Attendance item) {
    return repository.save(item);
  }

  @PutMapping("/attendance")
  public @ResponseBody Attendance update(@RequestBody Attendance item) {
    return repository.save(item);
  }

  @DeleteMapping("/attendance")
  public void delete(@RequestBody Attendance item) {
    repository.delete(item);
  }

}
