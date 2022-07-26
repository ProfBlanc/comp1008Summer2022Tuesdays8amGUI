package ca.georgiancollege.cppr.comp1008.comp1008summer2022thursdays12pmgui;

public class GradeModel {

    private String grade, letter;
    private int gradeNumber;

    public GradeModel(){}

    public void setGrade(String grade) throws Exception{
        this.grade = grade;
        validateGrade();
    }
    private void validateGrade() throws Exception{
        try{
           gradeNumber = Integer.parseInt(grade);
        }
        catch (Exception e){
            throw new Exception("Could not convert grade to a number");
        }
    }
    public void process(){
        if(gradeNumber < 0)
            throw new IllegalArgumentException("Grade must be greater than zero");
        if(gradeNumber > 100)
            throw new IllegalArgumentException("Grade must be lower than 100");

        if(gradeNumber >=90)
            setLetter("A+");
        else if (gradeNumber >=80)
            setLetter("A");
        else if (gradeNumber >=70)
            setLetter("B");
        else if (gradeNumber >=60)
            setLetter("C");
        else if (gradeNumber >=50)
            setLetter("D");
        else
            setLetter("F");

    }

    private void setLetter(String letter) {
        this.letter = letter;
    }

    public String getLetter(){
        return letter;
    }
}
