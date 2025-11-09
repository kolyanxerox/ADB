package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.ps */
/* loaded from: classes2.dex */
public final class C3535ps {

    /* renamed from: c */
    public static final a f10854c = new a(null);

    /* renamed from: d */
    public static final int f10855d = 2070;

    /* renamed from: e */
    public static final int f10856e = 2080;

    /* renamed from: f */
    public static final int f10857f = 2090;

    /* renamed from: g */
    public static final int f10858g = 2100;

    /* renamed from: h */
    public static final int f10859h = 2110;

    /* renamed from: a */
    private final int f10860a;

    /* renamed from: b */
    private final String f10861b;

    /* renamed from: com.ironsource.ps$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3535ps(int i, String errorMessage) {
        kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "errorMessage");
        this.f10860a = i;
        this.f10861b = errorMessage;
    }

    /* renamed from: a */
    public final int m11455a() {
        return this.f10860a;
    }

    /* renamed from: b */
    public final String m11457b() {
        return this.f10861b;
    }

    /* renamed from: c */
    public final int m11458c() {
        return this.f10860a;
    }

    /* renamed from: d */
    public final String m11459d() {
        return this.f10861b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3535ps)) {
            return false;
        }
        C3535ps c3535ps = (C3535ps) obj;
        return this.f10860a == c3535ps.f10860a && kotlin.jvm.internal.OooOo.OooO00o(this.f10861b, c3535ps.f10861b);
    }

    public int hashCode() {
        return this.f10861b.hashCode() + (Integer.hashCode(this.f10860a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkError(errorCode=");
        sb.append(this.f10860a);
        sb.append(", errorMessage=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f10861b, sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3535ps(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        kotlin.jvm.internal.OooOo.OooO0Oo(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    /* renamed from: a */
    public final C3535ps m11456a(int i, String errorMessage) {
        kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "errorMessage");
        return new C3535ps(i, errorMessage);
    }

    /* renamed from: a */
    public static /* synthetic */ C3535ps m11454a(C3535ps c3535ps, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c3535ps.f10860a;
        }
        if ((i2 & 2) != 0) {
            str = c3535ps.f10861b;
        }
        return c3535ps.m11456a(i, str);
    }
}
