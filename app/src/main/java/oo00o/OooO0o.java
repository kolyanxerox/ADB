package oo00o;

import o000O00.o00O0O0O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OooO0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ OooO0o[] f33182OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final OooO0o f33183OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0o f33184OooOo0o;

    static {
        OooO0o oooO0o = new OooO0o("SYNCHRONIZED", 0);
        OooO0o oooO0o2 = new OooO0o("PUBLICATION", 1);
        f33183OooOo0O = oooO0o2;
        OooO0o oooO0o3 = new OooO0o("NONE", 2);
        f33184OooOo0o = oooO0o3;
        OooO0o[] oooO0oArr = {oooO0o, oooO0o2, oooO0o3};
        f33182OooOo = oooO0oArr;
        o00O0O0O.OooOOo(oooO0oArr);
    }

    public static OooO0o valueOf(String str) {
        return (OooO0o) Enum.valueOf(OooO0o.class, str);
    }

    public static OooO0o[] values() {
        return (OooO0o[]) f33182OooOo.clone();
    }
}
