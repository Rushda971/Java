//Encapsulation-player, name, age, team and jersey_number accessible nhi rahe
class Player{
    private String name;
    private int age;
    private int jerseyNumber;
    private int team;
   
   
//Getter method
    public String getName() {return name;}
    public int getAge() {return age;}
    public int getJerseyNumber() {return jerseyNumber;}
    public int getTeam() {return team;}

//Setter method
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setJerseyNumber(int jerseyNumber){this.jerseyNumber=jerseyNumber;}
    public void setTeam(int team){this.team=team;}
}
