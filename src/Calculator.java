public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator v2.0 - 四則演算対応");
        System.out.println("=========================");

        int a = 20, b = 5;
        System.out.println("計算対象: " + a + ", " + b);
        System.out.println();

        System.out.println("加算結果: " + add(a, b));
        System.out.println("減算結果: " + subtract(a, b));
        System.out.println("乗算結果: " + multiply(a, b));
        System.out.println("除算結果: " + divide(a, b));
    }

    /**
     * 加算処理
     * @param a 第一引数
     * @param b 第二引数
     * @return a + b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 減算処理
     * @param a 第一引数
     * @param b 第二引数
     * @return a - b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * 乗算処理
     * @param a 第一引数
     * @param b 第二引数
     * @return a * b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 除算処理（ゼロ除算チェック付き）
     * @param a 第一引数
     * @param b 第二引数
     * @return a / b
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("エラー: ゼロで除算することはできません");
            return 0;
        }
        return a / b;
    }
}