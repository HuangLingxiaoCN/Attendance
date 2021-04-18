package fi.vamk.e1700702.semdemo;

import java.io.Serializable;
import java.util.Date;

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
  private Date date;

  public Attendance(String key, Date date) {
    this.key = key;
    this.date = date;
  }

  public Attendance() {
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

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String toString() {
    return id + " " + key + " " + date;
  }

}
