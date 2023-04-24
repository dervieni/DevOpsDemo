package ch.zhaw.iwi.devops.mathlab;

public class MathLab {
    
    public int sum(int a, int b) {
        int sum = a + b;
        return (sum);
    }

    public String size(int a, int b) {
        if (sum(a, b)>=100) {
            return("Die Summe "+String.valueOf(sum(a, b))+" ist grösser als 100");
        } else {
            return("Die Summe "+String.valueOf(sum(a, b))+" ist kleiner als 100");
        }
    }

    public String even(int a, int b) {
        String size = size(a, b);
        Boolean even=sum(a, b)%2==0;
        if (Boolean.TRUE.equals(even)) {
            return(size+" und ist gerade");
        } else {
            return(size+" und ist nicht gerade");
        } 
    }

    public String prime(int a, int b) {
        int sum = sum(a, b);
        String even = even(a, b);
        if (sum<2) {
            return(even+", sowie keine Primzahl");
        } else {
            for (int i = 2; i <= Math.sqrt(sum); i++) {
                if (sum % i == 0) {
                    return(even+", sowie keine Primzahl");
                }
            }
        }
        return(even+", sowie eine Primzahl");
    }
}
