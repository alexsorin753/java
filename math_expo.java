import java.text.DecimalFormat;

public class math_expo {
    public static String add(int num, int expo) {
        double pow = Math.pow(num, expo);
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(10);

        return df.format(pow);
    }

    public static void main(String[] args) {
        System.out.println(add(12, 8));
    }
}