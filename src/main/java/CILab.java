public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse()
    {
        if(myString == "")
        {
            throw new IllegalArgumentException("No input");
        }
        boolean containsUpperCase = !myString.equals(myString.toLowerCase());
        return containsUpperCase;
    }
}

