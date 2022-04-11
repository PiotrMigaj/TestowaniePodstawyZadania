package pl.migibud.zadaniapodstawyDay3.ex8;

public class Day3Ex8Main {

    public static void main(String[] args) {

        Poem[] poems = new Poem[3];
        poems[0]=new Poem(new Author("Mickiewicz","PL"),12);
        poems[1]=new Poem(new Author("Kochanowski","PL"),15);
        poems[2]=new Poem(new Author("Tolkien","UK"),18);

        int maxStropheNumbers = Integer.MIN_VALUE;
        Author authorMaxStropheNumber = null;
        for (Poem p:poems) {
            if (p!=null){
                if (p.getStropheNumbers()>maxStropheNumbers){
                    authorMaxStropheNumber = p.getCreator();
                }
            }
        }

        if (authorMaxStropheNumber!=null){
            System.out.println(authorMaxStropheNumber.getSurname());
            System.out.println(authorMaxStropheNumber);
        }

    }

}
