import java.util.*;
/**
 * Write a description of class Rook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rook extends Piece
{
    int intact;
    Rook(Side side,Piece[][] coordinate){
        super(side,coordinate);
        intact=0;
    }
    public String toString()
    {
        if(isBlack()){
            return "[BRk]";
        }else if(isWhite()){
            return "[WRk]";
        }
        
        return null;
    }
    public boolean isAllowed(int x1,int x2,int y1,int y2){
        if(isHorizontalOrVerticalMovementValid(x1,x2,y1,y2)){
            return true;
        }
        return false;
    }
    public void addingEatablePiece(int x1,int y1,ArrayList eatablePiece){
        eatablePiece.clear();
        eatablePiece.add(isPieceInBetween_2(x1,x1,y1,-1));
        eatablePiece.add(isPieceInBetween_2(x1,-1,y1,y1));
        eatablePiece.add(isPieceInBetween_2(x1,x1,y1,8));
        eatablePiece.add(isPieceInBetween_2(x1,8,y1,y1));
    }
    private boolean isHorizontalOrVerticalMovementValid(int x1,int x2,int y1,int y2){
        return x1==x2||y1==y2;
    }
}
