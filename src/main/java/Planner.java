import java.util.ArrayList;

public class Planner {
    private ArrayList<Term> termPlanner;

    public Planner(){
        termPlanner = new ArrayList<>();
    }

    public void addTerm(String name, int year){
        for (Term term : termPlanner) {
            if (term.getYear() == year && term.getSeason().equalsIgnoreCase(name)) {
                System.out.println("Term already exists!");
                return;
            }
        }

        termPlanner.add(new Term(name, year));
        System.out.println("Term Added!");
    }

    public void deleteTerm(String name, int year){
        for (int i = 0; i<termPlanner.size();i++){
            if(termPlanner.get(i).getYear() == year && termPlanner.get(i).getSeason().equalsIgnoreCase(name)){
                termPlanner.remove(i);
                System.out.println("Term Deleted!");
                return;
            }
        }
        System.out.println("Term Not Found");
    }

    public void displayTerms() {
        if (termPlanner.isEmpty()) {
            System.out.println("No terms in the planner.");
        } else {
            for (Term term : termPlanner) {
                System.out.println(term);
            }
        }
    }


}
