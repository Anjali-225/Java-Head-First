import java.util.ArrayList;

public class V3Radiator extends V2Radiator{
    V3Radiator(ArrayList list) {
        super(list);
        for(int g=0; g<10; g++)
        {
            list.add(new SimUnit("V3Radiator"));
        }
    }
}
