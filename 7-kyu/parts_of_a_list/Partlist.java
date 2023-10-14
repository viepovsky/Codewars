package parts_of_a_list;

class Partlist {
    static String[][] partlist(String[] arr) {
        String[][] result = new String[arr.length - 1][2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = 0; k < 2; k++) {
                if (k == 0)  {
                    int m = 0;
                    StringBuilder firstPart = new StringBuilder();
                    while(m <= i) {
                        firstPart.append(arr[m]);
                        firstPart.append(" ");
                        m++;
                    }
                    result[i][0] = firstPart.toString().trim();
                } else {
                    int m = i + 1;
                    StringBuilder secondPart = new StringBuilder();
                    while(m < arr.length) {
                        secondPart.append(arr[m]);
                        secondPart.append(" ");
                        m++;
                    }
                    result[i][1] = secondPart.toString().trim();
                }
            }
        }
        return result;
    }
}
