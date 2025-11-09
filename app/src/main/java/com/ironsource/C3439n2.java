package com.ironsource;

/* renamed from: com.ironsource.n2 */
/* loaded from: classes2.dex */
public class C3439n2 {

    /* renamed from: e */
    public static final int f10363e = -1;

    /* renamed from: a */
    private final a f10364a;

    /* renamed from: b */
    private final long f10365b;

    /* renamed from: c */
    private final long f10366c;

    /* renamed from: d */
    private final long f10367d;

    /* renamed from: com.ironsource.n2$a */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C3439n2(a aVar, long j, long j2, long j3) {
        this.f10364a = aVar;
        this.f10365b = j;
        this.f10366c = j2;
        this.f10367d = j3;
    }

    /* renamed from: a */
    public a m10935a() {
        return this.f10364a;
    }

    /* renamed from: b */
    public long m10936b() {
        return this.f10367d;
    }

    /* renamed from: c */
    public long m10937c() {
        return this.f10366c;
    }

    /* renamed from: d */
    public long m10938d() {
        return this.f10365b;
    }

    /* renamed from: e */
    public boolean m10939e() {
        a aVar = this.f10364a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    /* renamed from: f */
    public boolean m10940f() {
        a aVar = this.f10364a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
