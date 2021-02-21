package Enum;

public enum SupportedDrivers {
    CHROME("chrome"),
    APPIUM("appium");
    private String deviceName;

    SupportedDrivers(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }
}

