package Builder;

class Developer {
    private String programmingLanguage = "";
    private String experience = "";

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
