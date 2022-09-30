package day5;

public class Main {
    public static void main(String[] args) {
        NumberOperator<Float> sumFloat = (a, b) -> (a + b);
        System.out.println(sumFloat.sum(1.5f, 2f));

        NumberOperator<SoPhuc> sumSoPhuc = new NumberOperator<SoPhuc>() {
            @Override
            public SoPhuc sum(SoPhuc a, SoPhuc b) {
                SoPhuc sum = new SoPhuc(0, 0);
                // VD: z1 = 1 + 2i; z2 = 3 + 4i
                // t = 4 + 6i
                sum.phanThuc = a.phanThuc + b.phanThuc;
                sum.phanAo = a.phanAo + b.phanAo;
                return sum;
            }
        };

        SoPhuc z1 = new SoPhuc(1, 2);
        SoPhuc z2 = new SoPhuc(3, 4);
        System.out.println(sumSoPhuc.sum(z1, z2));

    }
}
