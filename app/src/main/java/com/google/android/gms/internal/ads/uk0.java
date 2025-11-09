package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class uk0 implements zk0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final char f24653OooOo0O;

    public uk0(char c) {
        this.f24653OooOo0O = c;
    }

    public final boolean OooO00o(char c) {
        return c == this.f24653OooOo0O;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f24653OooOo0O;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return OooO0oO.OooOo.OooOO0O("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.ads.zk0
    public final /* synthetic */ boolean zza(Object obj) {
        return OooO00o(((Character) obj).charValue());
    }
}
