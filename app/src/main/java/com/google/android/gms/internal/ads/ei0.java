package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ei0 implements Comparable {

    /* renamed from: OooOo, reason: collision with root package name */
    public long f18612OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long f18614OooOo0o = -9223372036854775807L;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final r40 f18613OooOo0O = new r40();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ei0 ei0Var = (ei0) obj;
        int iCompare = Long.compare(this.f18614OooOo0o, ei0Var.f18614OooOo0o);
        return iCompare != 0 ? iCompare : Long.compare(this.f18612OooOo, ei0Var.f18612OooOo);
    }
}
