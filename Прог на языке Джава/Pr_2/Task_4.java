public class Task_4 {
    public static void main(String[] args) {
        int[] m = new int[10];
        for (int i=0;i<m.length;i++) {
            m[i] = (int) (Math.random()*100);
            System.out.print(m[i]+ " ");
        }
        for (int i = m.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(m[j] > m[j + 1]) {
                    int a = m[j];
                    m[j] = m[j+1];
                    m[j+1] = a;
                }

            }
        }
        System.out.println();
        for (int i=0;i<m.length;i++) {
            System.out.print(m[i]+ " ");
        }
    }
}
