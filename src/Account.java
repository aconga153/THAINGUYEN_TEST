public class Account {
    private int numberAccount = 0;

    public synchronized void add(int num){
        numberAccount += num;
        System.out.println("nap vao " + num);
        notify();
    }

    public synchronized void sub(int num){
        if (numberAccount < 50000){
            System.out.println("so du > 50000!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberAccount -= num;
        System.out.println("rut ra " + num);
    }
}