class Patterns{
    public static void displayLine(int times){
        for(int i=0;i<times;i++){
            System.out.print("*");
        }
    }
    public static void display(int row,int col){
        if(row==0)
        return;
    displayLine(col);
    System.out.println();
    display(row-1,col);
    }
    public static void main(String[] args){
        int row=5,col=5;
        display(row,col);
    }
}