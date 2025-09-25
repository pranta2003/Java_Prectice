package package3;

import package1.ArrayExample;
import package2.Helper;

public class package3_of_array {
    public static void main(String[] args) {
        // From package1
        ArrayExample obj = new ArrayExample();
        obj.createAndShowArray();

        // From package2
        Helper h = new Helper();
        h.showMessage("Program finished successfully!");
    }
}
