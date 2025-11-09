package com.applovin.impl;

import com.applovin.impl.mediation.C1129h;
import com.applovin.mediation.MaxError;

/* renamed from: com.applovin.impl.a5 */
/* loaded from: classes.dex */
public class C0958a5 {

    /* renamed from: a */
    private final C0986b5 f182a;

    /* renamed from: b */
    private final String f183b;

    /* renamed from: c */
    private final String f184c;

    /* renamed from: d */
    private final String f185d;

    /* renamed from: e */
    private final MaxError f186e;

    /* renamed from: f */
    private final long f187f;

    /* renamed from: g */
    private final long f188g;

    /* renamed from: h */
    private final boolean f189h;

    /* renamed from: com.applovin.impl.a5$a */
    public interface a {
        /* renamed from: a */
        void mo120a(C0958a5 c0958a5);
    }

    private C0958a5(C0986b5 c0986b5, C1129h c1129h, String str, MaxError maxError, long j, long j2) {
        this(c0986b5, str, maxError, j, j2, c1129h != null ? c1129h.m1839i() : null, c1129h != null ? c1129h.m1831b() : null, false);
    }

    /* renamed from: a */
    public static C0958a5 m111a(C0986b5 c0986b5, C1129h c1129h, String str, long j, long j2) {
        if (c0986b5 == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (c1129h != null) {
            return new C0958a5(c0986b5, c1129h, str, null, j, j2);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    /* renamed from: b */
    public long m114b() {
        return this.f188g;
    }

    /* renamed from: c */
    public MaxError m115c() {
        return this.f186e;
    }

    /* renamed from: d */
    public String m116d() {
        return this.f183b;
    }

    /* renamed from: e */
    public String m117e() {
        return this.f185d;
    }

    /* renamed from: f */
    public C0986b5 m118f() {
        return this.f182a;
    }

    /* renamed from: g */
    public boolean m119g() {
        return this.f189h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f182a);
        sb.append(", mSdkVersion='");
        sb.append(this.f183b);
        sb.append("', mAdapterVersion='");
        sb.append(this.f184c);
        sb.append("', mSignalDataLength='");
        String str = this.f185d;
        sb.append(str != null ? str.length() : 0);
        sb.append("', mErrorMessage=");
        MaxError maxError = this.f186e;
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO('}', maxError != null ? maxError.getMessage() : "", sb);
    }

    private C0958a5(C0986b5 c0986b5, String str, MaxError maxError, long j, long j2, String str2, String str3, boolean z) {
        this.f182a = c0986b5;
        this.f185d = str;
        this.f186e = maxError;
        this.f187f = j;
        this.f188g = j2;
        this.f183b = str2;
        this.f184c = str3;
        this.f189h = z;
    }

    /* renamed from: a */
    public static C0958a5 m112a(C0986b5 c0986b5, MaxError maxError) {
        return m110a(c0986b5, (C1129h) null, maxError, -1L, -1L);
    }

    /* renamed from: a */
    public static C0958a5 m110a(C0986b5 c0986b5, C1129h c1129h, MaxError maxError, long j, long j2) {
        if (c0986b5 != null) {
            return new C0958a5(c0986b5, c1129h, null, maxError, j, j2);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    /* renamed from: a */
    public static C0958a5 m109a(C0958a5 c0958a5) {
        return new C0958a5(c0958a5.m118f(), c0958a5.m117e(), c0958a5.m115c(), c0958a5.f187f, c0958a5.f188g, c0958a5.m116d(), c0958a5.m113a(), true);
    }

    /* renamed from: a */
    public String m113a() {
        return this.f184c;
    }
}
