package edu.sjsu.tran.Exercise1;

// new class to supply to filter method
public class UpdatedFilter<T> implements Filter<T>
{
    @Override
    public boolean accept(T x)
    {
        // if accept is called on a String, we must ensure it is >= 9 characters
        if (x instanceof String)
        {
            String other = (String) x;
            if (other.length() >= 9)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        // if accept is called on an Integer, we must ensure that it is positive
        if (x instanceof Integer)
        {
            int other = (Integer) x;
            if (other >= 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
