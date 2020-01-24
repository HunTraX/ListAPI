public class Warning {
    private WARNING_LEVEL warning_level;
    private String content;
    private String system;

    public Warning(WARNING_LEVEL warning_level, String content, String system) {
        this.warning_level = warning_level;
        this.content = content;
        this.system = system;
    }

    public WARNING_LEVEL getWarning_level() {
        return warning_level;
    }

    public void setWarning_level(WARNING_LEVEL warning_level) {
        this.warning_level = warning_level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
}
