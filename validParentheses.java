public boolean isValid(String s) {
        int roundCnt = 0;
        int curlyCnt = 0;
        int flatCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                roundCnt++;
            }
            if (s.charAt(i) == '{') {
                curlyCnt++;
            }
            if (s.charAt(i) == '[') {
                flatCnt++;
            }
            if (s.charAt(i) == ')') {
                roundCnt--;
            }
            if (s.charAt(i) == ']') {
                flatCnt--;
            }
            if (s.charAt(i) == '}') {
                curlyCnt--;
            }
            if (roundCnt < 0 || curlyCnt < 0 || flatCnt < 0) {
                return false;
            }
        }
        if (curlyCnt == 0 && flatCnt == 0 && roundCnt == 0) {
            return true;
        }
        return false;
    }
