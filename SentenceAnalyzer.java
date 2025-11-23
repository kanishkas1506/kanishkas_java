public class SentenceAnalyzer {
    public static void main(String[] args) {

        String sentence = "Java Programming is FUN and Powerful!";
        
        // 1. Count how many characters it has
        int length = sentence.length();

        // 2. Convert the entire sentence to lowercase
        String lowerCaseSentence = sentence.toLowerCase();

        // 3. Replace all spaces with underscores
        String replacedSentence = sentence.replace(" ", "_");

        // 4. Check whether it contains the word "Java"
        boolean containsJava = sentence.contains("Java");

        // 5. Display the word "FUN" in lowercase using substring extraction
        // Finding "FUN" in the original sentence
        int startIndex = sentence.indexOf("FUN");
        String funLower = "";
        if (startIndex != -1) {
            String extractedFUN = sentence.substring(startIndex, startIndex + 3);
            funLower = extractedFUN.toLowerCase();
        }

        // Output results
        System.out.println("Original Sentence: " + sentence);
        System.out.println("1. Number of characters: " + length);
        System.out.println("2. Lowercase sentence: " + lowerCaseSentence);
        System.out.println("3. Spaces replaced with underscores: " + replacedSentence);
        System.out.println("4. Contains 'Java'? " + containsJava);
        System.out.println("5. 'FUN' in lowercase: " + funLower);
    }
}

