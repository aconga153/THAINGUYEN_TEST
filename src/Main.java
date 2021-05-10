public class Main {
    public static void main(String[] args) {

        //thread 1
    new Thread(()-> {
        for (int i = 0; i < 10; i++) {
            System.out.println("a ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }).start();

        //thread 2
        new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("b ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        System.out.println("main end");
    }
}