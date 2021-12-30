public class FasMain {

    ChemistryCalc chemCalc;
    FormationData formationData;

    String[] positions = {"GK", "RWB", "RB", "CB", "LB", "LWB", "CDM", "RM", "CM", "LM", "CAM", "CF", "RW", "LW", "RF", "ST", "LF"};

    public static void main(String[] args){
        FasMain fasMain = new FasMain();
        fasMain.chemCalc = new ChemistryCalc();
        fasMain.formationData = new FormationData();

        int[][] players = {{194404, 0}, {234035, 2}, {152729, 3}, {184432, 3}, {192638, 5}, {238074, 1}, {223959, 6}, {196432, 6}, {213565, 9}, {215333, 15}, {199110, 15}};
        fasMain.chemCalc.calculateChemistry("442(2)", players);
    }



}
