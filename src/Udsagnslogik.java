public class Udsagnslogik {


    public void Udsagnslogik(String... String) {

        //Udsagnslogik r =new Udsagnsogik;


    }


    public static String[][] logiskIdentitet() {

        String[][] logiskIdentitetListe = new String[20][2];

        logiskIdentitetListe[0][0] = "P%Q";
            logiskIdentitetListe[0][1] = "Q%P";
        logiskIdentitetListe[1][0] = "P&Q";
            logiskIdentitetListe[1][1] = "Q&P";
        logiskIdentitetListe[2][0] = "P%(Q%R)";
            logiskIdentitetListe[2][1] = "(P%Q)%R";
        logiskIdentitetListe[3][0] = "P&(Q&R)";
            logiskIdentitetListe[3][1] = "(P&Q)&R";
        logiskIdentitetListe[4][0] = "P&(Q%R)";
            logiskIdentitetListe[4][1] = "(P&Q)%(P&R)";
        logiskIdentitetListe[5][0] = "P%(Q&R)";
            logiskIdentitetListe[5][1] = "(P%Q)&(P%R)";
        logiskIdentitetListe[6][0] = "P%0";
            logiskIdentitetListe[6][1] = "P";
        logiskIdentitetListe[7][0] = "P&1";
            logiskIdentitetListe[7][1] = "P";
        logiskIdentitetListe[8][0] = "P%-P";
            logiskIdentitetListe[8][1] = "1";
        logiskIdentitetListe[9][0] = "P&-1";
            logiskIdentitetListe[9][1] = "0";

        return logiskIdentitetListe;
    }

    public static void main(String[] args) {
        System.out.println(enkeltLogiskIdentitet("(P&Q)%(P&R)"));
        System.out.println(opdelUdsagn("P&1"));
    }

    public static String enkeltLogiskIdentitet(String s) {

        String s2 ="";
        String p="";


        for (int row = 0; row < logiskIdentitet().length; row++)
            for (int colomn = 0; colomn < logiskIdentitet()[row].length; colomn++) {
                String w = logiskIdentitet()[row][colomn];
                if (s.equals(w)) {
                    if(colomn==1){
                        s2 = logiskIdentitet()[row][colomn-1];p="=>";}
                    else if(colomn==0) {s2 = logiskIdentitet()[row][colomn+1];p="<=";}



                    //System.out.println("S blier til, " + s + " "+p+"" +s2);

                }

            } return "S blier til, " + s + " "+p+" " +s2;
    }

   public static String [] opdelUdsagn(String udsagn){
       String str=udsagn;
       String[] arrOfstr=str.split("%");
        for (String h:arrOfstr)
            System.out.println(h);


        return arrOfstr;
    }


}
