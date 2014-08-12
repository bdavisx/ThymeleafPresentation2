package ws.billdavis.thymeleaf.web;

public class ExpressionPO {
    private int integerValue;
    private int[] integerArray;
    private boolean showSensitiveInformation;

    public void setIntegerValue( final int integerValue ) { this.integerValue = integerValue; }
    public int getIntegerValue() { return integerValue; }
    public void setIntegerArray( final int[] integerArray ) { this.integerArray = integerArray; }
    public int[] getIntegerArray() { return integerArray; }
    public void setShowSensitiveInformation( final boolean showSensitiveInformation ) {
        this.showSensitiveInformation = showSensitiveInformation;
    }
    public boolean isShowSensitiveInformation() { return showSensitiveInformation; }
}
