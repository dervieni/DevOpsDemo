package ch.zhaw.iwi.devops.mathlab;

public class MathLab {
    
    public int sum(int a, int b) {
        int sum = a + b;
        return (sum);
    }

    public String even(int a, int b) {
        Boolean even=sum(a, b)%2==0;
        if (Boolean.TRUE.equals(even)) {
            return("Die Summe "+String.valueOf(sum(a, b))+" ist gerade");
        } else {
            return("Die Summe "+String.valueOf(sum(a, b))+" ist nicht gerade");
        } 
    }

    public String prime(int a, int b) {
        int sum = sum(a, b);
        String even = even(a, b);
        if (sum<2) {
            return(even+" und keine Primzahl");
        } else {
            for (int i = 2; i <= Math.sqrt(sum); i++) {
                if (sum % i == 0) {
                    return(even+" und keine Primzahl");
                }
            }
        }
        return(even+" und eine Primzahl");
    }
}
