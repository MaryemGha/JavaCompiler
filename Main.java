import java.util.ArrayList;





public class Main {

    static ArrayList<UniteLexicale> tab= new ArrayList<UniteLexicale>();
    static ArrayList<String> tab1= new ArrayList<String>();
    public static void main(String[] args) {
        Scanner anaLex=new Scanner("/Users/maryemgharbi/Desktop/test.txt");
        //System.out.println(anaLex);


        UniteLexicale ul=null;
        do {
            ul=anaLex.lexemeSuivant();
            tab.add(ul); // tableau pour les unitées lexicales
            tab1.add(ul.getCategorie().toString()) ; // tableau pour les categorie

        } while(ul.getCategorie()!=Categorie.$);





        System.out.println("********************************Début Analyse Lexicale********************************");
        for( int i=0; i<tab.size();i++)

            System.out.println(" " +tab.get(i).toString());
        System.out.println("********************************Fin Analyse Lexicale********************************");







        System.out.println("********************************Début Analyse Syntaxique********************************");

        Parser test = new Parser();
        test.analyzeSLnew(tab1,tab);

        System.out.println("********************************Fin Analyse Syntaxique********************************");
        System.out.println();
        test.getAnalSem();
        test.getTableSym();
        test.ouput();




    }
}

