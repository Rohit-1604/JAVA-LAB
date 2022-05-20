class Rectangle{
      int length =1,width =1;
    Rectangle(){
       System.out.println("This is default constructor and area of rectangle is : "+length*width);
   }
    Rectangle(int length,int width){
       System.out.println("This is Parametrized constructor and area of rectangle is : "+length*width);

   }


    public static void main(String[] args) {
        System.out.println("Constructor is called with default value \n");
        Rectangle a1 = new Rectangle();
        System.out.println("Constructor is called with values  \n");

        Rectangle a2 = new Rectangle(10,20);


    }
}
