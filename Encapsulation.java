class Programmer{
    private String id;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
}

class Computer{
    public static void main(String [] args){
        Programmer p=new Programmer();
        p.setId("1392");
        System.out.println("Name:"+p.getId);
    }
}