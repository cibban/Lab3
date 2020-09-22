package kyh.labs.lab3;

class Patient {
    String name;
    private String sickness;

    Patient(String name){
        this.name = name;
    }

    Patient(String name, String sickness){
        this.name = name;
        this.sickness = sickness;
    }

    String getName(){
        return this.name;
    }

    String getSickness(){
        return this.sickness;
    }

    boolean isSick(){
            return this.sickness != null;
    }

    void takeMedication(Medicine medicine){
        if (medicine.getTreatmentName().equals(sickness)) {
            this.sickness = null;
        }
    }
}
