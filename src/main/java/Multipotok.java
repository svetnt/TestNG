public class Multipotok {

    static boolean flag = true;
    public static void main(String[] args) {

        int random = (int)(Math.random()*100000000);
        System.out.printf("Random number %d%n", random);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 1;
                    while (flag) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                }
                }
            });
        timer.start();

        Thread rand = new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag) {
                    int n = (int)(Math.random() * 100000000);
                    if (n == random) {
                        flag = false;
                        System.out.printf("n = %d%n", n);
                    }
                }
            }
        });
        rand.start();

        }
    }
