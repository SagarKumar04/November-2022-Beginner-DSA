package Contest;

public class QueensAttach {
    static int QueenAttack(int X, int Y, int P, int Q){
//Enter your code here
        if((X==P)||(Y==Q))
            return 1;
        else if(Math.abs(X-P)==Math.abs(Y-Q))
            return 1;
        else
            return 0;
    }
}
