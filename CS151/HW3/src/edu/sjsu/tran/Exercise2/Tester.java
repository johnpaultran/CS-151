package edu.sjsu.tran.Exercise2;

// class that has method main and initializes object of NumberView, GraphView & Model and
// attaches GraphView to the Model object
public class Tester
{
    public static void main(String args[])
    {
        // initialize Model w/ values
        Model gary = new Model(40, 60 ,90);

        // create frame 1 for NumberView
        NumberView chumBucket = new NumberView(gary);

        // create frame 2 for GraphView
        GraphView krustyKrab = new GraphView(gary);

        // attach GraphView as listener to Model (updated by NumberView)
        chumBucket.attachListener(krustyKrab.updateGraph());
    }
}
