package classOne;

import java.io.Serializable;

public class TrainingSolved implements Serializable {

    private int intValue;
    private boolean booleanValue;
    private Long longValue;
    private String stringValue;

    public TrainingSolved() {
        //Of course, constructor should have the name of the class, so yours should be "public Training() {}"
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
