package o00OOO0;

/* loaded from: classes3.dex */
public final class OooOo00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f32188OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String[] f32189OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String[] f32190OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f32191OooO0Oo;

    public OooOo00(boolean z) {
        this.f32188OooO00o = z;
    }

    public final void OooO00o(String... strArr) {
        if (!this.f32188OooO00o) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f32189OooO0O0 = (String[]) strArr.clone();
    }

    public final void OooO0O0(OooOOO... oooOOOArr) {
        if (!this.f32188OooO00o) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[oooOOOArr.length];
        for (int i = 0; i < oooOOOArr.length; i++) {
            strArr[i] = oooOOOArr[i].f32174OooO00o;
        }
        OooO00o(strArr);
    }

    public final void OooO0OO(String... strArr) {
        if (!this.f32188OooO00o) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f32190OooO0OO = (String[]) strArr.clone();
    }

    public final void OooO0Oo(o00000O... o00000oArr) {
        if (!this.f32188OooO00o) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[o00000oArr.length];
        for (int i = 0; i < o00000oArr.length; i++) {
            strArr[i] = o00000oArr[i].f32228OooOo0O;
        }
        OooO0OO(strArr);
    }
}
