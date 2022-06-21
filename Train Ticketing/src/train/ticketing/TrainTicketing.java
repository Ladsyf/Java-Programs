
package train.ticketing;

import javax.swing.*;


public class TrainTicketing {

    
    public static void main(String[] args) {
    TrainTicketing tk = new TrainTicketing();
    String[] Stations = {"North Avenue", "Quezon Avenue","Kamuning",
                         "Cubao","Santolan","Ortigas","Shaw","Boni","Guadalupe",
                         "Buendia","Ayala","Magallanes","Taft"};
    int fare[] = {0, 13, 13, 16, 16, 20, 20, 20, 24, 24, 24, 28, 28};    
    int x=0,y=0, change;
    int ex=0;
    
    do{
    String name =  JOptionPane.showInputDialog(null, 
            "Welcome to DME Ticketing System!\n"
            + "\nEnter your name: ");
    if(tk.errorcheck(name))
        continue;
    String origin = (String) JOptionPane.showInputDialog(null,
            "Leaving From",
            "Train Station",
            JOptionPane.QUESTION_MESSAGE,
            null,
            Stations,
            Stations[5]);
    String destination = (String) JOptionPane.showInputDialog(null,
            "Going To",
            "Train Station",
            JOptionPane.QUESTION_MESSAGE,
            null,
            Stations,
            Stations[5]);
    if(tk.errorcheck(origin, destination))
        continue;
    
    for(int i = 0; i<13; i++){
        
        if(origin.equals(Stations[i])){
            x = i;
        }
        if(destination.equals(Stations[i])){
            y = i;
        }    
    }
    
    String payment =  JOptionPane.showInputDialog(null, 
            "From: " + origin + "\nTo: " + destination
            + "\nFare Price: " + tk.price(fare, x, y)
            + "\n\nEnter your payment amount: ");
    
        if(tk.errorcheck(payment, tk.price(fare, x, y)))
            continue;
    
        try{
        change = Integer.parseInt(payment) - tk.price(fare,x,y);
    
        
    JOptionPane.showMessageDialog(null,
            "DME Ticketing System\n"
                    + "Malolos, Bulacan\n\n"
                    + "Name: " + name
                    + "\nLocation: " + origin
                    + "\nDestination: " + destination
                    + "\nFare: " + tk.price(fare,x,y)
                    + "\nPayment: " + payment
                    + "\nChange: " + change
                    + "\n\n\nThank you for riding with us!",
            "Reciept", -1, null);
    }catch (NumberFormatException e){ e.printStackTrace();}
     ex = JOptionPane.showConfirmDialog(null, "If you want another transaction, click YES"
            + " otherwise NO", "Confirm", JOptionPane.YES_NO_OPTION);        
    
    }while(ex != JOptionPane.NO_OPTION);
    System.exit(0);
    }
    
    
    private int price(int[] fare, int origin, int destination){
    int amount;
    if (origin < destination){
    amount = fare[destination-origin];
    }
    else{
    amount = fare[origin-destination];
    }
    return amount;
    }
    
    boolean errorcheck(String x){
    if (x.isEmpty()){
                JOptionPane.showMessageDialog(null, 
                "You can't leave without entering your name, please input your name."
                , "Error 101", 2, null);
        return true;
    }
    return false;
    }
    boolean errorcheck(String x, String y){
    if(x.equals(y)){
                JOptionPane.showMessageDialog(null, 
                "You can't have the same location and destination at the same time,"
                        + " please fill the form again."
                , "Error 102", 2, null);
        return true;
    }
    return false;
    }
    boolean errorcheck(String x, int y){
    if(Integer.parseInt(x) < y){
                JOptionPane.showMessageDialog(null, 
                "Your payment is insufficient, please try again."
                , "Error 103", 2, null);
        return true;
    }
    return false;
    }
    
}
