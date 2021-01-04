package edu.sjsu.tran.Exercise2;

// class to store data from NumberView and pass to GraphView
public class Model
{
    // constructor for model class
    // @param spongebob length of yellow bar
    // @param patrick length of pink bar
    // @param squidward length of teal bad
    public Model(int spongebob, int patrick, int squidward)
    {
        this.spongebob = spongebob;
        this.patrick = patrick;
        this.squidward = squidward;
    }

    // following are get methods to return the length of each bar
    public int getSpongebob()
    {
        return spongebob;
    }

    public int getPatrick()
    {
        return patrick;
    }

    public int getSquidward()
    {
        return squidward;
    }

    // following are set methods to set the length of each bar
    public void setSpongebob(int spongebob)
    {
        this.spongebob = spongebob;
    }

    public void setPatrick(int patrick)
    {
        this.patrick = patrick;
    }

    public void setSquidward(int squidward)
    {
        this.squidward = squidward;
    }

    // instance variables
    private int spongebob;
    private int patrick;
    private int squidward;
}
