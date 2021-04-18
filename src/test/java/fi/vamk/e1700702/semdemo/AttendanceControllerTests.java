package fi.vamk.e1700702.semdemo;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.apache.commons.collections4.IterableUtils;
import org.assertj.core.util.IterableUtil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
@ComponentScan(basePackages = { "fi.vamk.e1700702.semdemo" })
@EnableJpaRepositories(basePackageClasses = AttendanceRepository.class)
public class AttendanceControllerTests {
  @Autowired
  private AttendanceRepository repository;

  /*
    Testcase 1 The solution can save, fetch by key and delete the attendance
  */
  @Test
  public void postGetDeleteAttendance() {
    Iterable<Attendance> begin = repository.findAll();
    // System.out.println(IterableUtils.size(begin));
    // Given
    Date date = new Date();
    Attendance att = new Attendance("ABCD", date);
    System.out.println("ATT: " + att.toString());

    // Test save
    Attendance saved = repository.save(att);
    System.out.println("SAVED: " + saved.toString());

    // when
    Attendance found = repository.findByDate(att.getDate());
    System.out.println("FOUND BY DATE: " + found.toString());

    // then
    assertThat(found.getKey()).isEqualTo(att.getKey());
    repository.delete(found);
    
    Iterable<Attendance> end = repository.findAll();
    // System.out.println(IterableUtils.size(end));
    assertEquals((long) IterableUtils.size(begin), (long) IterableUtils.size(end));
  }
}
