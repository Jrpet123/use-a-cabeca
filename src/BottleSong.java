public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {

            if ( bottlesNum == 1) {
                word = "bottle";
            }
            System.out.println(bottlesNum + " green " + word + " , hang in on the wall");
            System.out.println(bottlesNum + " green " + word + " , hang in on the wall");
            System.out.println("And if one green bottles should accidentally fall,");
            bottlesNum--;

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green " + word + " hang in on the wall");
            }
        }
        System.out.println("There'll be no green bottles in on the wall.");
    }
}
