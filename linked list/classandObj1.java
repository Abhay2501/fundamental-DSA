public class classandObj1{
    public static class phone{
        String brand;
        String model;
        String color;
        int ram;
        int storage;
        int battery;
        phone(String brand, String model, String color, int ram, int storage, int battery){
         this.brand = brand;
         this.model = model;
         this.color = color;
         this.ram = ram;
         this.storage = storage;
         this.battery = battery;   
        }
         phone(String brand, String model, String color,  int storage, int battery){
         this.brand = brand;
         this.model = model;
         this.color = color;
         
         this.storage = storage;
         this.battery = battery;   
        
    }
    @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Brand: " + this.brand+ "\n");
            sb.append("Model: " + this.model + "\n");
            sb.append("Color: " + this.color + "\n");
            sb.append("Ram: " + this.ram + "\n");
            sb.append("Storage: " + this.storage + "\n");
            sb.append("Battery: "+ this.battery + "|n");
            sb.append("\n");
            return sb.toString();
        }

    }
    public static void main(String[] args){
        phone ph1 = new phone("one plus", "9r 5G", "Lake blue",8, 128, 4500);
        phone ph2 = new phone("one plus", " 9 pro", " Lake blue", 8, 128, 4500);
        System.out.println(ph1);
        System.out.println(ph2);
    }
}