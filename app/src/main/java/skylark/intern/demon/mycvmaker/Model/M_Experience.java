package skylark.intern.demon.mycvmaker.Model;

public class M_Experience {

    private int id;
    private boolean work_exp;
    private String company_name, job_title, exp_year;

    public M_Experience() {
    }

    public M_Experience(int id, boolean work_exp) {
        this.id = id;
        this.work_exp = work_exp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isWork_exp() {
        return work_exp;
    }

    public void setWork_exp(boolean work_exp) {
        this.work_exp = work_exp;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getExp_year() {
        return exp_year;
    }

    public void setExp_year(String exp_year) {
        this.exp_year = exp_year;
    }
}
