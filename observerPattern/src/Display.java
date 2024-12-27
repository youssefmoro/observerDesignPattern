public class Display implements Observer{
    @Override
    public void updateValue(int newValue)
    {
        System.out.println("Data value updated to: " + newValue);
    }
}
