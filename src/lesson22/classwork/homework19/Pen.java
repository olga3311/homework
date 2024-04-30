package lesson22.classwork.homework19;

public class Pen {
    private int inkAmount = 100;

    public  Pen (){
       this.inkAmount = 100;
    }
    public int getInkAmount(){
        return inkAmount;
    }
    public  void write(String text){
        if (text.length() > inkAmount){
            return;
        }

        for (int i = 0; i<text.length(); i++){
            //если чернила закончились
            if (inkAmount ==0){
                break;
            }
            //пишем букву
            System.out.print(text.charAt(i));
            inkAmount--;
        }

        System.out.println();
    }

    public void refill(){
        inkAmount = 100;
    }

    public void checkInk(){
        System.out.println( "Remaining ink: " + inkAmount);

    }


}
