public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator v2.0.0 - 四則演算対応");
        System.out.println("============================");

        int a = 20, b = 5;
        System.out.println("計算対象: " + a + ", " + b);
        System.out.println();

        try {
            System.out.println("加算結果: " + add(a, b));
            System.out.println("減算結果: " + subtract(a, b));
            System.out.println("乗算結果: " + multiply(a, b));
            System.out.println("除算結果: " + divide(a, b));

            // ゼロ除算テスト
            System.out.println("ゼロ除算テスト:");
            System.out.println("結果: " + divide(a, 0));
        } catch (ArithmeticException e) {
            System.out.println("エラーをキャッチしました: " + e.getMessage());
        }
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
     * 除算処理
     * @param a 被除数
     * @param b 除数
     * @return a / b
     * @throws ArithmeticException ゼロ除算の場合
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("ゼロで除算することはできません");
        }
        return a / b;
    }
}