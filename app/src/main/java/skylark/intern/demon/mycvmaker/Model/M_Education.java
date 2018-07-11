package skylark.intern.demon.mycvmaker.Model;

public class M_Education {
    private int id;
    private String level, major, university, graduated_year, other_qualification;
    private boolean is_graduated;

    public M_Education() {
    }

    public M_Education(int id, boolean is_graduated) {
        this.id = id;
        this.is_graduated = is_graduated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGraduated_year() {
        return graduated_year;
    }

    public void setGraduated_year(String graduated_year) {
        this.graduated_year = graduated_year;
    }

    public String getOther_qualification() {
        return other_qualification;
    }

    public void setOther_qualification(String other_qualification) {
        this.other_qualification = other_qualification;
    }

    public boolean isIs_graduated() {
        return is_graduated;
    }

    public void setIs_graduated(boolean is_graduated) {
        this.is_graduated = is_graduated;
    }
}
