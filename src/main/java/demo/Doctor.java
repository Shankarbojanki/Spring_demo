package demo;

public class Doctor implements Staff{

    private String Qualification;
    private Nurse nurse;
    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }
}
