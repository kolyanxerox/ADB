package com.ironsource;

/* renamed from: com.ironsource.ew */
/* loaded from: classes2.dex */
public class C3097ew {

    /* renamed from: a */
    protected long f8464a;

    /* renamed from: b */
    protected long f8465b;

    /* renamed from: c */
    protected long f8466c;

    /* renamed from: a */
    public long m8568a() {
        return Math.max(0L, this.f8464a - System.currentTimeMillis());
    }

    /* renamed from: b */
    public void m8570b() {
        this.f8464a = 0L;
        this.f8465b = 0L;
        this.f8466c = 0L;
    }

    /* renamed from: c */
    public void m8572c(long j) {
        this.f8465b = j;
        this.f8466c = 0L;
    }

    /* renamed from: a */
    public void m8569a(long j) {
        this.f8464a = System.currentTimeMillis() + j;
    }

    /* renamed from: b */
    public void m8571b(long j) {
        this.f8466c = j;
        this.f8464a = (j - this.f8465b) + this.f8464a;
    }
}
