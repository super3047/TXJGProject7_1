// ReverseEncrypt.java - 具体装饰器（逆向输出）
public class ReverseEncrypt extends EncryptDecorator {
    public ReverseEncrypt(DataEncrypt component) {
        super(component);
    }

    @Override
    public String encrypt() {
        return new StringBuilder(super.encrypt()).reverse().toString();
    }
}
