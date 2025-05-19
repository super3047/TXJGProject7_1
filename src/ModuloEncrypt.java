// ModuloEncrypt.java - 具体装饰器（求模加密）
public class ModuloEncrypt extends EncryptDecorator {
    private int mod;

    public ModuloEncrypt(DataEncrypt component) {
        this(component, 26);
    }

    public ModuloEncrypt(DataEncrypt component, int mod) {
        super(component);
        this.mod = mod;
    }

    @Override
    public String encrypt() {
        String encrypted = super.encrypt();
        StringBuilder result = new StringBuilder();
        for (char c : encrypted.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append((Character.getNumericValue(c) + mod) % 10);
            } else if (Character.isUpperCase(c)) {
                result.append((char) ((c - 'A' + mod) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                result.append((char) ((c - 'a' + mod) % 26 + 'a'));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
