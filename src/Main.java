public class Main {

    public static void main(String[] args) {
        String input;
        int nameCount = 0;
        nameCount = IOUtil.getInteger("Please declare the number of input: ");
        for(int i = 0; i<nameCount; i++) {
            input = IOUtil.getString("Input: ");
            new Abbreviator(input);
        }
    }
}
