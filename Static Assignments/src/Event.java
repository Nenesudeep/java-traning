class Event{

    // INHERITANcE EXAMPLE
    private String eventName;
    private String participantName;
    private double registrationFee;

    public Event(String eventName, String participantName) {
        this.eventName = eventName;
        this.participantName = participantName;
    }

    public void registerEvent(){

        if(this.eventName.equals("Singing")){

            this.registrationFee=8.0;

        }
        else if(this.eventName.equals("Dancing")){

            this.registrationFee=10.0;
        }
        else if(this.eventName.equals("DigitalArt")){
            this.registrationFee=12;
        }
        else if (this.eventName.equals("Acting")){
            this.registrationFee=15;
        }
        else
            this.registrationFee=0;






    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    //Implement your code here
}

class SoloEvent extends Event{

    private int participantNo;

    public SoloEvent(String eventName, String participantName, int participantNo) {
        super(eventName, participantName);
        this.participantNo=participantNo;

    }

    @Override
    public void registerEvent(){

        if(getEventName().equals("Singing")){

            setRegistrationFee(8);

        }
        else if(getEventName().equals("Dancing")){

            setRegistrationFee(10);
        }
        else if(getEventName().equals("DigitalArt")){
            setRegistrationFee(12);
        }
        else if (getEventName().equals("Acting")){

            setRegistrationFee(15.0);
        }
        else
            setRegistrationFee(0);




    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }
    //Implement your code here
}

class TeamEvent extends Event{

    private int noOfParticipants;
    private int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);

        this.noOfParticipants=noOfParticipants;
        this.teamNo=teamNo;
    }

    public void registerEvent(){

        if (getNoOfParticipants()>1) { // This check is neccsearry to check whether it is a team or not;

            switch (getEventName()) {

                case "Singing":

                    setRegistrationFee(4 * this.noOfParticipants);
                    break;
                case "Dancing":

                    setRegistrationFee(6 * this.noOfParticipants);
                    break;
                case "DigitalArt":

                    setRegistrationFee(8 * this.noOfParticipants);
                    break;
                case "Acting":

                    setRegistrationFee(10 * this.noOfParticipants);
                    break;
                default:

                    setRegistrationFee(0);

            }

        }

    }


    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
    //Implement your code here
}

class Test {

    public static void main(String[] args) {

        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
        soloEvent.registerEvent();
        if (soloEvent.getRegistrationFee() != 0) {
            System.out.println("Thank You " + soloEvent.getParticipantName()
                    + " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
            System.out.println("Your participant number is " + soloEvent.getParticipantNo());

        } else {
            System.out.println("Please enter a valid event");
        }

        System.out.println();
        TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
        teamEvent.registerEvent();
        if (teamEvent.getRegistrationFee() != 0) {
            System.out.println("Thank You " + teamEvent.getParticipantName()
                    + " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
            System.out.println("Your team number is " + teamEvent.getTeamNo());
        } else {
            System.out.println("Please enter a valid event");
        }
    }
}
