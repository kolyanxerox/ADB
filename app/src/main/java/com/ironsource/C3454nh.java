package com.ironsource;

/* renamed from: com.ironsource.nh */
/* loaded from: classes2.dex */
public class C3454nh {

    /* renamed from: c */
    public static final int f10541c = 1001;

    /* renamed from: a */
    private String f10542a;

    /* renamed from: b */
    private int f10543b;

    public C3454nh(int i, String str) {
        this.f10543b = i;
        this.f10542a = str == null ? "" : str;
    }

    /* renamed from: a */
    public int m10991a() {
        return this.f10543b;
    }

    /* renamed from: b */
    public String m10992b() {
        return this.f10542a;
    }

    public String toString() {
        return "error - code:" + this.f10543b + ", message:" + this.f10542a;
    }
}
