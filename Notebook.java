public class Notebook {
    
    int memory;
    int hardDesk;
    String OS;
    String color;
    
    public int getMemory(){
        return memory;
    }

    public int getHardDesk(){
        return hardDesk;
    }

    public String getOS(){
        return OS;
    }

    public String getColor(){
        return color;
    }
    
    @Override
    public String toString(){
        return "memory: " + memory + ", hardDesk: " + hardDesk + ", OS: " + OS + ", color: "+ color;
    }
}
