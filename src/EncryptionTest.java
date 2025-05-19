// EncryptionTest.java
public class EncryptionTest {
    public static void main(String[] args) {
        String originalText = "Hello123";
        System.out.println("原始字符串: " + originalText);

        // 测试简单加密
        DataEncrypt simple = new SimpleEncrypt(originalText);
        System.out.println("简单加密: " + simple.encrypt());

        // 测试简单+逆向加密
        DataEncrypt reverse = new ReverseEncrypt(simple);
        System.out.println("简单+逆向加密: " + reverse.encrypt());

        // 测试简单+求模加密
        DataEncrypt modulo = new ModuloEncrypt(simple, 5);
        System.out.println("简单+求模加密: " + modulo.encrypt());

        // 测试简单+逆向+求模加密
        DataEncrypt combo = new ModuloEncrypt(new ReverseEncrypt(simple), 7);
        System.out.println("简单+逆向+求模加密: " + combo.encrypt());

        // 测试多层加密
        DataEncrypt multiLayer = new ModuloEncrypt(
                new ReverseEncrypt(
                        new ModuloEncrypt(simple, 3)
                ),
                4
        );
        System.out.println("多层加密: " + multiLayer.encrypt());
    }
}