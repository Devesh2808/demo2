class Emp {
    private int id;
    private int sal;
    //getter and setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
 class demo2{
    public static void main(String[] args) {
        //display the value of id and sal
     Emp obj1=new Emp();
     obj1.setId(12);
     obj1.setSal(1200);
        System.out.println(obj1.setId());

    }
}
