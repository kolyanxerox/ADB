package com.ironsource;

/* renamed from: com.ironsource.m2 */
/* loaded from: classes2.dex */
public class C3350m2 {

    /* renamed from: e */
    public static final int f9451e = -1;

    /* renamed from: a */
    private final a f9452a;

    /* renamed from: b */
    private final long f9453b;

    /* renamed from: c */
    private final long f9454c;

    /* renamed from: d */
    private final long f9455d;

    /* renamed from: com.ironsource.m2$a */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C3350m2(a aVar, long j, long j2, long j3) {
        this.f9452a = aVar;
        this.f9453b = j;
        this.f9454c = j2;
        this.f9455d = j3;
    }

    /* renamed from: a */
    public a m9974a() {
        return this.f9452a;
    }

    /* renamed from: b */
    public long m9975b() {
        return this.f9455d;
    }

    /* renamed from: c */
    public long m9976c() {
        return this.f9454c;
    }

    /* renamed from: d */
    public long m9977d() {
        return this.f9453b;
    }

    /* renamed from: e */
    public boolean m9978e() {
        a aVar = this.f9452a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    /* renamed from: f */
    public boolean m9979f() {
        a aVar = this.f9452a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
