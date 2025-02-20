package pets;

import com.intuit.karate.junit5.Karate;

public class PetRunner {
    @Karate.Test
    Karate userGet(){

        return Karate.run("petstore").relativeTo(getClass());
    }
}
