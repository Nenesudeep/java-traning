class Room {

    // Aggregation assignment 3

    private int roomNo;
    private int capacity ;
    private static int roomCounter=500;



    public Room(){


        this.roomNo= roomCounter;
        roomCounter = roomCounter +1;
        this.capacity=4;

    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getRoomCounter() {
        return roomCounter;
    }

    public static void setRoomCounter(int roomCounter) {
        Room.roomCounter = roomCounter;
    }
    //Implement your code here

    //Uncomment the below method after implementation before verifying
    //DO NOT MODIFY THE METHOD

    public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }

}














