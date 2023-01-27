public class Enemy {

    public void attack () {

        int i = (int)(1+Math.random()*1);
        switch (i) {

            case 1:
                System.out.println("Justin Hammer atakuje  ");
                break;
            case 2:
                System.out.println("Justin Hammer pominal ");
        }

    }
}
