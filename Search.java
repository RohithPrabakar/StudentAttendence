package com.Rohith;

import javax.swing.*;

public class Search {
    File f = new File();
    public void byName(String name) {
        f.read();
        name = name.toUpperCase();
        String data[][] = new String[2][f.col];
        String column[] = new String[f.col];
        for (int i = 0; i < f.row; i++) {
            if (name.equals(f.array[i][1])) {
                for (int j = 0; j < f.col; j++) {
                    column[j] = f.array[0][j];
                }
                for (int j = 0; j < f.col; j++) {
                    data[0][j] = f.array[1][j];
                }
                for (int j = 0; j < f.col; j++) {
                    data[1][j] =  f.array[i][j];
                }
                break;
            }
        }
        new Table(data,column);
    }

    public void byId(String id) {
        f.read();
        id = id.toUpperCase();
        String data[][] = new String[2][f.col];
        String column[] = new String[f.col];
        for (int i = 1; i < f.row; i++) {
            if (id.equals(f.array[i][0])) {
                for (int j = 0; j < f.col; j++) {
                    column[j] = f.array[0][j];
                }
                System.out.println();
                for (int j = 0; j < f.col; j++) {
                    data[0][j] = f.array[1][j];
                }
                System.out.println();
                for (int j = 0; j < f.col; j++) {
                    data[1][j] =  f.array[i][j];
                }
                break;
            }
        }
        new Table(data,column);
    }

    public void bySubject(String subject) {
        f.read();
        subject = subject.toLowerCase();
        if (subject.equals("linear algebra")) {
            int n = 1, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else if (subject.equals("data structures")) {
            int n = 2, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else if (subject.equals("computer architecture")) {
            int n = 3, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else if (subject.equals("discrete structures")) {
            int n = 4, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else if (subject.equals("object oriented programming")) {
            int n = 5, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else if (subject.equals("economics for engineers")) {
            int n = 6, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else if (subject.equals("data structures laboratory")) {
            int n = 7, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else if (subject.equals("object oriented programming laboratory")) {
            int n = 8, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else if (subject.equals("environmental science")) {
            int n = 9, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            //this is because the first col doesn't have the same row size as the rest of them so it will throw error
            System.out.println("environmental science");
            for (int j = 1; j < f.row; j++) {
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(f.array[j][i] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("no subject");
    }

    public void bySubject(String subject, String name) {
        f.read();
        name = name.toUpperCase();
        subject = subject.toLowerCase();
        if (subject.equals("linear algebra")) {
            int n = 1, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("linear algebra");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }else if (subject.equals("data structures")) {
            int n = 2, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("data structures");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }else if (subject.equals("computer architecture")) {
            int n = 3, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("computer architecture");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }else if (subject.equals("discrete structures")) {
            int n = 4, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("discrete structures");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }else if (subject.equals("object oriented programming")) {
            int n = 5, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("object oriented programming");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }else if (subject.equals("economics for engineers")) {
            int n = 6, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("economics for engineers");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }else if (subject.equals("data structures laboratory")) {
            int n = 7, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("data structures laboratory");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }else if (subject.equals("object oriented programming laboratory")) {
            int n = 8, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("object oriented programming laboratory");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }else if (subject.equals("environmental science")) {
            int n = 9, startrow = 2 * ((2 * n) - 1), endrow = (2 * ((2 * n) - 1)) + 3;
            for (int j = 0; j < f.row; j++) {
                if (name.equals(f.array[j][1])) {
                    System.out.println("environmental science");
                    System.out.print(f.array[j][1] + " ");
                    for (int i = startrow; i <= endrow; i++) {
                        System.out.print(f.array[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        } else
            System.out.println("no subject");

    }

}
