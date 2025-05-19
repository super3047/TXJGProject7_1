// EncryptDecorator.java - 抽象装饰器
public abstract class EncryptDecorator implements DataEncrypt {
    protected DataEncrypt component;

    public EncryptDecorator(DataEncrypt component) {
        this.component = component;
    }

    @Override
    public String encrypt() {
        return component.encrypt();
    }
}
