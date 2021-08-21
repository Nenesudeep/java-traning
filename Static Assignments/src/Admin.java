class Admin {

    //Doubt in assiging the rooms ..

    public void assignRoom(Room[] rooms, Member member) {

        for (Room room:rooms){

            if(room.getCapacity()>0){
//                System.out.println(room.getRoomNo());
//                System.out.println(member.getMemberId());
                member.setRoom(room);
                room.setCapacity(room.getCapacity()-1);
                break;
            }

        }





    }
}
