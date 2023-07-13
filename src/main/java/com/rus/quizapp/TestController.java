

@RestController
@RequestMapping("test")
public class TestController {

  @GetMapping("allTest")
  public String getAllTest() {
    
    return "all tests";
  }
  
}
