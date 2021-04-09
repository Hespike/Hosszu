class Hosszu {
    static int hossz(String s) { int n = 0;
    while (s.matches(".*1{" + n + "}.*")) n++;
    return --n;
    }
}
