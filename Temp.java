public class Temp {
    public static void main (String[]args){
        double acceleration;
        double time;
        double velocity;
        double position;
        double destination;
         acceleration = -9.81;
         time = 10;
         velocity = 0;
         position = 0;
         destination = 0.5 * acceleration * time * time + (velocity * time) + (position);
         System.out.println("The answer is:" +destination);
    }
}
