/* Generated By:JJTree&JavaCC: Do not edit this line. AstTokenManager.java */
package ast.AST;
import java.util.*;

public class AstTokenManager implements AstConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x80000140L) != 0L)
            return 2;
         if ((active0 & 0x1ffa000L) != 0L)
         {
            jjmatchedKind = 25;
            return 5;
         }
         return -1;
      case 1:
         if ((active0 & 0x100L) != 0L)
            return 0;
         if ((active0 & 0x1ffa000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 1;
            return 5;
         }
         return -1;
      case 2:
         if ((active0 & 0x1f7a000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 2;
            return 5;
         }
         if ((active0 & 0x80000L) != 0L)
            return 5;
         return -1;
      case 3:
         if ((active0 & 0x1e4a000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 3;
            return 5;
         }
         if ((active0 & 0x130000L) != 0L)
            return 5;
         return -1;
      case 4:
         if ((active0 & 0xa40000L) != 0L)
            return 5;
         if ((active0 & 0x140a000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
            return 5;
         }
         return -1;
      case 5:
         if ((active0 & 0x400000L) != 0L)
            return 5;
         if ((active0 & 0x100a000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 5;
            return 5;
         }
         return -1;
      case 6:
         if ((active0 & 0x1008000L) != 0L)
            return 5;
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 6;
            return 5;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStopAtPos(0, 2);
      case 10:
         return jjStopAtPos(0, 3);
      case 12:
         return jjStopAtPos(0, 5);
      case 13:
         return jjStopAtPos(0, 4);
      case 32:
         return jjStopAtPos(0, 1);
      case 42:
         return jjStopAtPos(0, 30);
      case 44:
         return jjStopAtPos(0, 37);
      case 46:
         return jjStopAtPos(0, 36);
      case 47:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x140L);
      case 58:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 59:
         return jjStopAtPos(0, 14);
      case 60:
         return jjStopAtPos(0, 33);
      case 62:
         return jjStopAtPos(0, 35);
      case 63:
         return jjStopAtPos(0, 38);
      case 91:
         return jjStopAtPos(0, 32);
      case 93:
         return jjStopAtPos(0, 34);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x28000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x840000L);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 0);
         break;
      case 47:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 58:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x50000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x508000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(2, 29);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x248000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 5);
         return jjMoveStringLiteralDfa3_0(active0, 0x1020000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 5);
         return jjMoveStringLiteralDfa4_0(active0, 0x1800000L);
      case 103:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 5);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 114:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 5);
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 114:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 5);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 5);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0xa000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 110:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 5);
         break;
      case 115:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(6, 24, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(7, 13, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0xffff7fffffffffffL & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 2:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 3:
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(5);
                  break;
               case 1:
                  if (kind > 7)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 7)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x800L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_3(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         break;
      default :
         return 2;
   }
   return 2;
}
private final int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private final int jjMoveNfa_1(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 9)
                     kind = 9;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x400L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
"\141\142\163\164\162\141\143\164", "\73", "\142\157\157\154\145\141\156", "\143\150\141\162", "\142\171\164\145", 
"\163\150\157\162\164", "\151\156\164", "\154\157\156\147", "\146\154\157\141\164", 
"\144\157\165\142\154\145", "\163\165\160\145\162", "\145\170\164\145\156\144\163", null, null, null, 
"\72", "\72\72\75", "\52", "\57", "\133", "\74", "\135", "\76", "\56", "\54", "\77", };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "IN_SINGLE_LINE_COMMENT", 
   "IN_FORMAL_COMMENT", 
   "IN_MULTI_LINE_COMMENT", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 2, 3, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7ff3ffe001L, 
};
static final long[] jjtoSkip = {
   0xe3eL, 
};
static final long[] jjtoSpecial = {
   0xe3eL, 
};
static final long[] jjtoMore = {
   0x11c0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[6];
private final int[] jjstateSet = new int[12];
StringBuffer image;
int jjimageLen;
int lengthOfMatch;
protected char curChar;
public AstTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public AstTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else 
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 7 :
         if (image == null)
            image = new StringBuffer();
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                   input_stream.backup(1);
         break;
      default : 
         break;
   }
}
}
