package ws.billdavis.thymeleaf.web;

public class ExpressionPO {
    private int integerValue;
    private int[] integerArray;
    private boolean showSensitiveInformation;

    private String valueThatExists;
    private String valueThatDoesNotExist;

    public void setIntegerValue( final int integerValue ) { this.integerValue = integerValue; }
    public int getIntegerValue() { return integerValue; }
    public void setIntegerArray( final int[] integerArray ) { this.integerArray = integerArray; }
    public int[] getIntegerArray() { return integerArray; }
    public void setShowSensitiveInformation( final boolean showSensitiveInformation ) {
        this.showSensitiveInformation = showSensitiveInformation;
    }
    public boolean isShowSensitiveInformation() { return showSensitiveInformation; }
    public String getValueThatExists() { return valueThatExists; }
    public void setValueThatExists( final String valueThatExists ) { this.valueThatExists = valueThatExists; }
    public String getValueThatDoesNotExist() { return valueThatDoesNotExist; }
    public void setValueThatDoesNotExist( final String valueThatDoesNotExist ) {
        this.valueThatDoesNotExist = valueThatDoesNotExist;
    }
}
