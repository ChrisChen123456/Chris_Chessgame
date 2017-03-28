/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends Piece
{
    King(Side side){
        super(side);
        super.setIntact(0);
    }
    public String toString()
    {
        if(isBlack())
        {
           return "[BKg]";
        }else if(isWhite()){
           return "[WKg]";
        }   
        return null;
    }
    public boolean isAllowed(int x1,int x2,int y1,int y2){
        addingEatablePiece(x1,y1);
        if((isHorizontalMovementValid(x1,x2) || isVerticalMovementValid(y1,y2))){
            setIntact(1);
            return true;
        }else if(isSlantMovementValid(x1,x2,y1,y2) ){
            setIntact(1);
            return true;
        }else if(super.isItCastling(x1,x2,y1,y2,super.getSide())){
            setIntact(1);
            return true;
        }
        //return false;
        return true;
    }
    private void addingEatablePiece(int x1,int y1){
        eatablePiece.clear();
        eatablePiece.add(isPieceInBetween_2(x1,x1+2,y1,y1+2));
        eatablePiece.add(isPieceInBetween_2(x1,x1+2,y1,y1-2));
        eatablePiece.add(isPieceInBetween_2(x1,x1-2,y1,y1+2));
        eatablePiece.add(isPieceInBetween_2(x1,x1-2,y1,y1-2));
        eatablePiece.add(isPieceInBetween_2(x1,x1+2,y1,y1));
        eatablePiece.add(isPieceInBetween_2(x1,x1-2,y1,y1));
        eatablePiece.add(isPieceInBetween_2(x1,x1,y1,y1+2));
        eatablePiece.add(isPieceInBetween_2(x1,x1,y1,y1-2));
    }
    private boolean isKingBeenThreaten(int x,int y){
        if(isBlack()){
            
        }else if(isWhite()){
            
        }
        return true;
    }
    private boolean isHorizontalMovementValid(int x1,int x2){
        return Math.abs(x1-x2)==1;
    }
    private boolean isVerticalMovementValid(int y1,int y2){
        return Math.abs(y1-y2)==1;
    }
    private boolean isSlantMovementValid(int x1,int x2,int y1,int y2){
        return (Math.abs(y1-y2)==1 && Math.abs(x1-x2)==1);
    }
}
