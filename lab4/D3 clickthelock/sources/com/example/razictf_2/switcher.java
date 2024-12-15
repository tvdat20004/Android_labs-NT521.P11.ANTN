package com.example.razictf_2;

/* loaded from: classes.dex */
public class switcher {
    public String run(int i) {
        if (i != 0) {
            return null;
        }
        String str = " " + new a1().run(i);
        a2 a2Var = new a2();
        System.out.println(a2Var.run(i));
        return (((str + a2Var.run(i)) + new a3().run(i)) + new a4().run(i)) + new a5().run(i);
    }
}
