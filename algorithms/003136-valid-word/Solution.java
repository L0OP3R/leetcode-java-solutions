class Solution {

    public boolean isValid(String word) {
        boolean hasVowel = false;
        boolean hasConsonant = false;

        if (word.length() < 3)
            return false;

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c))
                return false;

            if (isVowel(c))
                hasVowel = true;
            else if (isConsonant(c))
                hasConsonant = true;
        }

        return hasVowel && hasConsonant;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    private boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }
}
