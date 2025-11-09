package o00OO0oo;

/* loaded from: classes3.dex */
public final class OooOO0O {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final long[] f32056OooO0o0 = new long[0];

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00OO0o.OooO f32057OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO.OooO f32058OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f32059OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long[] f32060OooO0Oo;

    public OooOO0O(o00OO0o.OooO descriptor, o00OO.OooO oooO) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        this.f32057OooO00o = descriptor;
        this.f32058OooO0O0 = oooO;
        int iOooO0Oo = descriptor.OooO0Oo();
        if (iOooO0Oo <= 64) {
            this.f32059OooO0OO = iOooO0Oo != 64 ? (-1) << iOooO0Oo : 0L;
            this.f32060OooO0Oo = f32056OooO0o0;
            return;
        }
        this.f32059OooO0OO = 0L;
        int i = (iOooO0Oo - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iOooO0Oo & 63) != 0) {
            jArr[i - 1] = (-1) << iOooO0Oo;
        }
        this.f32060OooO0Oo = jArr;
    }
}
