public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"Amaral", "Costa", "Azevedo", "Silva", "Consuela"};
        String[] wordListTwo = {"Um", "Dois", "Três"};
        String[] wordListThree = {"Leão", "Macaco", "Pavão", "Coruja", "Lagarta", "Centopeia"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Precisamos de uma " + phrase);

    }
}