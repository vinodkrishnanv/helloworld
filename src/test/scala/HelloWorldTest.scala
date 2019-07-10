import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class HelloWorldTest extends  FunSuite{
  test("Calculator") {
    assert(true == true)
  }
  test("An empty Set should have size 0") {
        System.out.print(Set.empty.size)
        assert(Set.empty.size == 0)
    }
}
