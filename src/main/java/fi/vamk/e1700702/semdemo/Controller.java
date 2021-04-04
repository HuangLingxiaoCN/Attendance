package fi.vamk.e1700702.semdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class Controller {

  @RequestMapping("/test")
  public String test() {
    return "{\"id\":1}";
  }

}