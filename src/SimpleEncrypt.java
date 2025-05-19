// SimpleEncrypt.java - 具体组件
public class SimpleEncrypt implements DataEncrypt {
    private String text;
    private int shift;

    public SimpleEncrypt(String text) {
        this(text, 3);
    }

    public SimpleEncrypt(String text, int shift) {
        this.text = text;
        this.shift = shift;
    }

    @Override
    public String encrypt() {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) ((c + shift - 'A') % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                result.append((char) ((c + shift - 'a') % 26 + 'a'));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
