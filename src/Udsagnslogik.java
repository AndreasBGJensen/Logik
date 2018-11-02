public class Udsagnslogik {


    public void Udsagnslogik(String...String){

        Udsagnslogik r =new Udsagnsogik;


    }



    public String[][] logiskIdentitet() {

        String [][] logiskIdentitetListe=new String[20][2];

        logiskIdentitetListe[0][0]="P%Q";
        logiskIdentitetListe[0][1]="Q%P";
        logiskIdentitetListe[1][0]="P&Q";
        logiskIdentitetListe[1][1]="Q&P";
        logiskIdentitetListe[2][0]="P%(Q%R)";
        logiskIdentitetListe[2][1]="(P%Q)%R";
        logiskIdentitetListe[3][0]="P&(Q&R)";
        logiskIdentitetListe[3][1]="(P&Q)&R";
        logiskIdentitetListe[4][0]="P&(Q%R)";
        logiskIdentitetListe[4][1]="(P&Q)%(P&R)";
        logiskIdentitetListe[5][0]="P%(Q&R)";
        logiskIdentitetListe[5][1]="(P%Q)&(P%R)";
        logiskIdentitetListe[6][0]="P%0";
        logiskIdentitetListe[6][1]="P";
        logiskIdentitetListe[7][0]="P&1";
        logiskIdentitetListe[7][1]="P";
        logiskIdentitetListe[8][0]="P%-P";
        logiskIdentitetListe[8][1]="1";
        logiskIdentitetListe[9][0]="P&-1";
        logiskIdentitetListe[9][1]="0";

        return logiskIdentitetListe;
    }
}
