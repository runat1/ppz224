package koschei.models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Egg6 {
    @Autowired
    private Needle7 needle7;
    @Override
    public String toString() {
        return ", в утке яйцо "+needle7.toString();
    }
}
