public class IronMan {

    public attack () {

        int i = (int)(1+Math.random()*1);
        switch (i) {

            case 1:
                System.out.println("Iron Man atakuje ");
                break;
            case 2:
                System.out.println("Iron Man pominal");
        }

    }

    public printNameOfOwner () {

        System.out.println("Tony Stark");

    }

    public goParty () {

        System.out.println("Party time");

    }


    public ironMan (RegularPerson.tony) {

        this.tony = tony;

    }
}
