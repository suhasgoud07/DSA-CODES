class Solution {
    public boolean isSubsequence(String source, String target) {
        if (source.isEmpty()) return true;
        if (source.length() == target.length() && source.equals(target)) {
            return true;
        }
        if (source.length() > target.length()) {
            return false;
        }

        int targetLeft = 0;
        int targetRight = target.length() - 1;
        int sourceLeft = 0;
        int sourceRight = source.length() - 1;

        while (targetLeft <= targetRight) {

            if (target.charAt(targetLeft) == source.charAt(sourceLeft)) {
                sourceLeft++;
                if (sourceLeft == source.length()) return true;
            }
            targetLeft++;

            if (target.charAt(targetRight) == source.charAt(sourceRight)) {
                sourceRight--;
                if (sourceRight < 0) return true;
            }
            targetRight--;

        }

        int leftSteps = sourceLeft;
        int rightSteps = (source.length() - 1 - sourceRight);
        return leftSteps + rightSteps >= source.length();
    }
}