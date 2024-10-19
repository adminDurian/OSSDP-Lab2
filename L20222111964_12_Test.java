import static org.junit.jupiter.api.Assertions.*;
class L20222111964_12_Test {
    Solution12 solution12 =new Solution12();
    @org.junit.jupiter.api.Test
    void multiply() {
        solution12.multiply("0","0");
        solution12.multiply("0","123");
        solution12.multiply("-123","123");
    }

    @org.junit.jupiter.api.Test
    void addStrings() {
        solution12.addStrings("1","1");
        solution12.addStrings("1","-1");
        solution12.addStrings("1","0");
    }
}