package skylark.intern.demon.mycvmaker.Model;

public class M_Skill {
    private int id;
    private String language,lang_level, otherskill;
    private boolean driver_licence;

    public M_Skill() {
    }

    public M_Skill(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLang_level() {
        return lang_level;
    }

    public void setLang_level(String lang_level) {
        this.lang_level = lang_level;
    }

    public String getOtherskill() {
        return otherskill;
    }

    public void setOtherskill(String otherskill) {
        this.otherskill = otherskill;
    }

    public boolean isDriver_licence() {
        return driver_licence;
    }

    public void setDriver_licence(boolean driver_licence) {
        this.driver_licence = driver_licence;
    }
}
