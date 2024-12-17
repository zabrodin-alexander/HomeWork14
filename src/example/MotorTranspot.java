package example;

public abstract class MotorTranspot extends WheeledTransport {
    public MotorTranspot(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель у транспорта " + getModelName());
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
