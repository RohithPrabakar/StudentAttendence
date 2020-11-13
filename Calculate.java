package com.Rohith;

public class Calculate {
    File f = new File();
    String[] classname = {"linear algebra", "data structures", "computer architecture", "discrete structures", "object oriented programming", "economics for engineers", "data structures laboratory", "object oriented programming laboratory", "environmental science"};

    public void prsntByName(String name) {
        f.read();
        double[] perctarr = new double[10];
        double[] totarr = new double[10];
        name = name.toUpperCase();
        int n = 1, index1 = 0, index2 = 0;
        double count = 0, total = 0;
        for (int i = 0; i < f.row; i++) {
            if (name.equals(f.array[i][1])) {
                int j = 2 * ((2 * n) - 1);
                System.out.println(f.array[i][1]);
                while (j <= 34) {
                    perctarr[index1] = Double.parseDouble(f.array[i][j]);
                    totarr[index2] = Double.parseDouble(f.array[2][j]);
                    total += Integer.parseInt(f.array[2][j]);
                    count += Integer.parseInt(f.array[i][j]);
                    j = 2 * ((2 * ++n) - 1);
                    index1++;
                    index2++;
                }
            }
        }
        double percent = (count / total) * 100;
        System.out.printf("Total present percentage is: %.3f", percent);
        System.out.println();

        for (int i = 0; i < perctarr.length - 1; i++) {

            try {
                percent = (perctarr[i] / totarr[i]) * 100;
                if (Double.isNaN(percent)) throw new ArithmeticException();
                System.out.printf("Present percentage in %s: %.3f\n", classname[i], percent);
            } catch (ArithmeticException e) {
                System.out.println("Class not yet taken in");
            }
        }
    }

    public void prsntByID(String id) {
        f.read();
        double[] perctarr = new double[10];
        double[] totarr = new double[10];
        id = id.toUpperCase();
        int n = 1, index1 = 0, index2 = 0;
        double count = 0, total = 0;
        for (int i = 0; i < f.row; i++) {
            if (id.equals(f.array[i][0])) {
                int j = 2 * ((2 * n) - 1);
                System.out.printf("%s %s\n",f.array[i][0],f.array[i][1]);
                while (j <= 34) {
                    perctarr[index1] = Double.parseDouble(f.array[i][j]);
                    totarr[index2] = Double.parseDouble(f.array[2][j]);
                    total += Integer.parseInt(f.array[2][j]);
                    count += Integer.parseInt(f.array[i][j]);
                    j = 2 * ((2 * ++n) - 1);
                    index1++;
                    index2++;
                }
            }
        }
        double percent = (count / total) * 100;
        System.out.printf("Total present percentage is: %.3f", percent);
        System.out.println();

        for (int i = 0; i < perctarr.length - 1; i++) {

            try {
                percent = (perctarr[i] / totarr[i]) * 100;
                if (Double.isNaN(percent)) throw new ArithmeticException();
                System.out.printf("Present percentage in %s: %.3f\n", classname[i], percent);
            } catch (ArithmeticException e) {
                System.out.println("Class not yet taken in");
            }
        }
    }
    public void prsntBySubject(String subject) {
        f.read();
        double[] perctarr = new double[10];
        double total=0, count=0,prsnt;
        subject = subject.toLowerCase();
        if (subject.equals(classname[0])) {
            total =Double.parseDouble(f.array[2][2]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][2]);
            }
        }else if (subject.equals(classname[1])) {
            total =Double.parseDouble(f.array[2][6]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][6]);
            }
        }else if (subject.equals(classname[2])) {
            total =Double.parseDouble(f.array[2][10]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][10]);
            }
        }else if (subject.equals(classname[3])) {
            total =Double.parseDouble(f.array[2][14]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][14]);
            }
        }else if (subject.equals(classname[4])) {
            total =Double.parseDouble(f.array[2][18]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][18]);
            }
        }else if (subject.equals(classname[5])) {
            total =Double.parseDouble(f.array[2][22]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][22]);
            }
        }else if (subject.equals(classname[6])) {
            total =Double.parseDouble(f.array[2][26]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][26]);
            }
        }else if (subject.equals(classname[7])) {
            total =Double.parseDouble(f.array[2][32]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][32]);
            }
        }else if (subject.equals(classname[8])) {
            total =Double.parseDouble(f.array[2][36]);
            for (int i = 2; i < f.row; i++) {
                count += Double.parseDouble(f.array[i][36]);
            }
        }else{
            System.out.println("Subject not found");
        }

        try {
            total = total*f.row;
            prsnt = (count/total)*100;
            if (Double.isNaN(prsnt)) throw new ArithmeticException();
            System.out.printf("%.2f of time students have attended %s",prsnt,subject);
        } catch (ArithmeticException e) {
            System.out.println("Class not yet taken in");
        }
    }
}

