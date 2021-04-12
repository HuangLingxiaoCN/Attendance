package fi.vamk.e1700702.semdemo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Attendance.findAll", query = "SELECT p FROM Attendance p")
public class Attendance implements Serializable{

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String key;

  public Attendance() {
  }

  public Attendance(String key) {
    this.key = key;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }
  
  public String toString() {
    return id + " " + key;
  }
}
