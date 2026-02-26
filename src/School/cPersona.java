package School;

class cPersona {
    private String Name ;
    private String Address;
    private String country;

    public String getName(){
        return Name;
    }

    cPersona(String Name, String Address, String country){
        this.Name = Name;
        this.Address = Address;
        this.country = country;
        // System.out.println("I am a person");
    }
    
    public void editPersona(String name, String address, String country){
        this.Name = name;
        this.Address = address;
        this.country = country;
    }

    public void Hello(String paraName){
        System.out.println("Hello " + paraName + ", My name is " + Name);
    }

}

class student extends cPersona {
    public student (String name){
        super(name, "Unknown", "Indonesia");
    }
    public void study(){
        System.out.println(this.getName() + " is studying");
    }

    @Override
    public  void Hello(String paraName){
        System.out.println("Holla " + paraName + ", just call me " + this.getName());
    }
}

class teacher extends cPersona {
    public teacher (String name){
        super(name, "Unknown", "Indonesia");
    }

    @Override
    public  void Hello(String paraName){
        System.out.println("Holla " + paraName + ", just call me " + this.getName());
    }

    public void teach(){
        System.out.println(this.getName() + " is teaching");
    }

    


}
