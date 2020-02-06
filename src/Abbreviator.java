public class Abbreviator {

    public String acronym = "";

    public Abbreviator(String nameInput) {
        boolean isUpper = false;
        String[] words = nameInput.split(" ");
        char firstLetter;
        for (int i = 0; i < words.length; i++) {
            firstLetter = words[i].charAt(0);
            if(Character.isUpperCase(firstLetter)){
                acronym += firstLetter;
            }
        }
    }

    public String getAcronym(){
        return acronym;
    }
}
