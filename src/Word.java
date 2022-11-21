public class Word {
    protected String hebrew;
    protected String english;

//    ========== CONSTRUCTOR ==========
    public Word(String heb, String eng){
        this.hebrew = heb;
        this.english = eng;
    }

//    ========== SETTERS ==========
    public void setHebrew(String heb){
        this.hebrew = heb;
    }

    public void setEnglish(String eng){
        this.english = eng;
    }

//    ========== GETTERS ===========
    public String getHebrew(){
        return hebrew;
    }

    public String getEnglish(){
        return english;
    }

//    ========== toString() METHOD ==========
    @Override
    public String toString(){
        return english + " : " + hebrew;
    }
}
