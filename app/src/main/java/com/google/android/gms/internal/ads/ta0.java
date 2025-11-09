package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class ta0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24280OooO00o = 1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f24281OooO0O0;

    public /* synthetic */ ta0() {
    }

    public static String OooO0O0(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public boolean OooO00o(int i) {
        return (this.f24281OooO0O0 & i) == i;
    }

    public boolean OooO0OO() {
        return OooO00o(1);
    }

    public String toString() {
        switch (this.f24280OooO00o) {
            case 0:
                return OooO0O0(this.f24281OooO0O0);
            default:
                return super.toString();
        }
    }
}
